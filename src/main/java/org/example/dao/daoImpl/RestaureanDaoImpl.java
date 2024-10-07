package org.example.dao.daoImpl;

import org.example.dao.RestaurantDao;
import org.example.db.Database;
import org.example.model.Restaurant;

import java.util.List;
import java.util.Set;

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
    public String deleteByIds(Long id) {
        return "";
    }

    @Override
    public String deleteByIds(Set<Long> ids) {
        return "";
    }


    @Override
    public List<Restaurant> getAll() {
        return List.of();
    }

    @Override
    public String findById(Long id) {
        for (Restaurant restaurant : database.restaurants) {
                if (restaurant.getId().equals(id)) {
                    return "Restaurant with id " + id + " found";

            }
        }
        return "Restaurant with id " + id + " not found";
    }
    @Override
    public String update(Long id, Restaurant newRestaurant) {
        for (Restaurant restaurant1 : database.restaurants) {
            if (restaurant1.getId().equals(id)) {
                restaurant1.setName(newRestaurant.getName());
                restaurant1.setLocation(newRestaurant.getLocation());
                restaurant1.setRestType(newRestaurant.getRestType());
                return "Restaurant with id " + id + " updated";
            }
        }
        return "Restaurant with id " + id + " not found";
    }


    @Override
    public List<Restaurant> getRestaurantByType(String restType) {
        for (Restaurant restaurant : database.restaurants) {
            if (restaurant.getRestType().equals(restType)) {
                return List.of(restaurant);
            }
        }
        return null;
    }
}
