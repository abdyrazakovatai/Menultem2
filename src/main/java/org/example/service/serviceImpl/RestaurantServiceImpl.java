package org.example.service.serviceImpl;

import org.example.dao.RestaurantDao;
import org.example.dao.daoImpl.RestaureanDaoImpl;
import org.example.db.Database;
import org.example.model.Restaurant;
import org.example.service.RestaurantService;

import java.util.List;

public class RestaurantServiceImpl implements RestaurantService {

    Database database;

    RestaurantDao restaurantDao = new RestaureanDaoImpl(database);

    public RestaurantServiceImpl(Database database) {
        this.database = database;
    }

    @Override
    public String save(Restaurant restaurant) {
        return "";
    }

    @Override
    public String save(List<Restaurant> restaurants) {
        return "";
    }

    @Override
    public String delete(Long id) {
        return "";
    }

    @Override
    public List<Restaurant> getAll() {
        return List.of();
    }

    @Override
    public String update(Long id, Restaurant restaurant) {
        return "";
    }

    @Override
    public String findById(Long id) {
        return "";
    }

    @Override
    public List<Restaurant> getRestaurantByType(String restType) {
        return List.of();
    }
}
