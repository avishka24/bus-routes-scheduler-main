package com.javamasters.dao;

import com.javamasters.model.RouteEntity;

import java.util.List;



public interface RouteDaoService {
    RouteEntity getRoute(String routeId);

    RouteEntity createRoute(RouteEntity route);

    RouteEntity updateRoute(RouteEntity route);

    void deleteRoute(String routeId);

    List<RouteEntity> getAllRoutesByBusId(String busId);

}
