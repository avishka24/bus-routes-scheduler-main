package com.javamasters.repository;

import com.javamasters.model.BusEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;



@Repository
public interface BusRepository extends MongoRepository<BusEntity, String> {
    Optional<BusEntity> findByBusRegNumber(String busRegNumber);
}
