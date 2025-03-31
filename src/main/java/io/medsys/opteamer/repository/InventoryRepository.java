package io.medsys.opteamer.repository;

import io.medsys.opteamer.model.Inventory;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface InventoryRepository extends CrudRepository<Inventory, Long> {
    Optional<Inventory> findByAssetId(Long id);
}
