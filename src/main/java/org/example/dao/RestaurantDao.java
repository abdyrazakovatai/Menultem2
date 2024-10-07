package org.example.dao;

import org.example.model.Restaurant;

import java.util.List;

public interface RestaurantDao {
    String save(Restaurant restaurant);

    String save(List<Restaurant> restaurants);

    String delete(Long id);

    List<Restaurant> getAll();

    String update(Long id, Restaurant restaurant);

    String findById(Long id);

    List<Restaurant> getRestaurantByType(String restType);
}
