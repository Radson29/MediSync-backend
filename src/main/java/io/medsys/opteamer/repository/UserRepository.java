package io.medsys.opteamer.repository;

import io.medsys.opteamer.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author degijanos
 * @version 1.0
 * @since 2024. 06. 22.
 */

public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
