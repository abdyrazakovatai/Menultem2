package org.example.service.serviceImpl;

import org.example.dao.RestaurantDao;
import org.example.dao.daoImpl.RestaurantDaoImpl;
import org.example.db.Database;
import org.example.model.Restaurant;
import org.example.service.RestaurantService;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class RestaurantServiceImpl implements RestaurantService {

    Database database;

    RestaurantDao restaurantDao = new RestaurantDaoImpl(database);

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
            if (restaurant == null) {
                return "Restaurant is null";
            } else {
                restaurantDao.findById(id);
            }
        }
        return "Restaurant is find";
    }

    @Override
    public String update(Long id, Restaurant newRestaurant) {
        for (Restaurant restaurant : database.restaurants) {
            if (restaurant == null) {
                return "Restaurant is null";
            } else if (restaurant.getId().equals(id)) {
                restaurantDao.update(id, newRestaurant);
            }
        }
        return "Restaurant is update";
    }


    @Override
    public List<Restaurant> getRestaurantByType(String restType) {
        List<Restaurant> filteredRestaurants = new ArrayList<>();
        for (Restaurant restaurant : database.restaurants) {
            if (restaurant.getRestType() != null && restaurant.getRestType().equals(restType)) {
                filteredRestaurants.add(restaurant);
            }
        }
        return filteredRestaurants;
    }
}
