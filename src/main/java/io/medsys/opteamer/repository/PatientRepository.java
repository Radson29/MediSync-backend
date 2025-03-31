package io.medsys.opteamer.repository;

import io.medsys.opteamer.model.Patient;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PatientRepository extends CrudRepository<Patient, Long> {
    Optional<Patient> findById(Long id);

}
