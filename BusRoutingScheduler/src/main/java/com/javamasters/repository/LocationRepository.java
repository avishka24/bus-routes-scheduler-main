package com.javamasters.repository;

import com.javamasters.model.LocationEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;


public interface LocationRepository extends MongoRepository<LocationEntity, String> {
    Optional<LocationEntity> findByLocationName(String locationName);

    @Query(value = "{}", sort = "{ 'locationName' : 1 }")
    List<LocationEntity> findAllSorted();
}
