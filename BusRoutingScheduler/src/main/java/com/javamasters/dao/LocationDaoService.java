package com.javamasters.dao;

import com.javamasters.model.LocationEntity;

import java.util.List;
import java.util.Optional;


public interface LocationDaoService {
    Optional<LocationEntity> getLocationByName(String locationName);

    List<LocationEntity> getAllLocations();

}
