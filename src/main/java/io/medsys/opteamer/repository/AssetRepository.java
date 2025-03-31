package io.medsys.opteamer.repository;

import io.medsys.opteamer.model.Asset;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AssetRepository extends CrudRepository<Asset, Long> {
    Optional<Asset> findById(Long id);
}