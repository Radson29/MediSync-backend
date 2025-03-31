package io.medsys.opteamer.repository;

import io.medsys.opteamer.model.Assessment;
import io.medsys.opteamer.model.embeddedids.AssessmentId;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AssessmentRepository extends CrudRepository<Assessment, AssessmentId> {
    Optional<Assessment> findById(AssessmentId assessmentId);
}
