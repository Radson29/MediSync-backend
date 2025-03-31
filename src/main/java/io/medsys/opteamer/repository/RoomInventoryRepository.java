package io.medsys.opteamer.repository;

import io.medsys.opteamer.model.RoomInventory;
import io.medsys.opteamer.model.embeddedids.RoomInventoryId;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author degijanos
 * @version 1.0
 * @since 2024. 06. 15.
 */

public interface RoomInventoryRepository extends CrudRepository<RoomInventory, RoomInventoryId> {
    Optional<RoomInventory> findById(RoomInventoryId roomInventoryId);
}
