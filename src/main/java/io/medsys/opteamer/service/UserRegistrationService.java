package io.medsys.opteamer.service;

import io.medsys.opteamer.dto.UserRegistrationDTO;
import io.medsys.opteamer.model.Role;
import io.medsys.opteamer.model.User;
import io.medsys.opteamer.model.enums.ERole;
import io.medsys.opteamer.repository.RoleRepository;
import io.medsys.opteamer.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;



@Service
public class UserRegistrationService {

    UserRepository userRepository;
    RoleRepository roleRepository;
    PasswordEncoder passwordEncoder;

    @Autowired
    public UserRegistrationService(UserRepository userRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void createUser(UserRegistrationDTO registrationDTO) {
        Role role = roleRepository.findByName(ERole.ROLE_USER)
                .orElseThrow(() -> new RuntimeException("Default role ROLE_USER not found in database"));

        User user = new User(
                registrationDTO.getUsername(),
                registrationDTO.getEmail(),
                passwordEncoder.encode(registrationDTO.getPassword()),
                new HashSet<>(Arrays.asList(role))
        );

        userRepository.save(user);
    }


}
