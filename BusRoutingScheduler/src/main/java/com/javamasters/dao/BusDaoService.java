package com.javamasters.dao;

import com.javamasters.model.BusEntity;

import java.util.Optional;


public interface BusDaoService {
    BusEntity saveBus(BusEntity busEntity);

    BusEntity getBus(String busId);

    void deleteBus(String busId);

    BusEntity updateBus(BusEntity busEntity);

    Optional<BusEntity> findBusByRegNumber(String busRegNumber);
}
