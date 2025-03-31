package io.medsys.opteamer.repository;

import io.medsys.opteamer.model.Privilege;
import io.medsys.opteamer.model.enums.EPrivilege;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author degijanos
 * @version 1.0
 * @since 2024. 06. 22.
 */

public interface PrivilegeRepository  extends CrudRepository<Privilege, Long> {
    Optional<Privilege> findByName(EPrivilege name);
}
