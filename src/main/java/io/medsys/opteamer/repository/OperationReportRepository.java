package io.medsys.opteamer.repository;

import io.medsys.opteamer.model.OperationReport;
import io.medsys.opteamer.model.embeddedids.OperationReportId;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;

public interface OperationReportRepository extends CrudRepository<OperationReport, OperationReportId> {
    Optional<OperationReport> findById(OperationReportId operationReportId);
}