package com.javamasters.service;

import com.javamasters.model.LocationEntity;

import java.util.List;


public interface LocationService {
    List<LocationEntity> getAllLocations();

    boolean locationExists(String locationId);
}
