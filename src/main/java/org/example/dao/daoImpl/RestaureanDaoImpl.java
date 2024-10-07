package org.example.dao.daoImpl;

import org.example.dao.RestaurantDao;
import org.example.db.Database;
import org.example.model.Restaurant;

import java.util.List;

public class RestaureanDaoImpl implements RestaurantDao {

    private final Database database;

    public RestaureanDaoImpl(Database database) {
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
