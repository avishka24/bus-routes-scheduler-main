package com.javamasters.repository;

import com.javamasters.model.RouteEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface RouteRepository extends MongoRepository<RouteEntity, String> {
    List<RouteEntity> findAllByBusId(String busId);
}
