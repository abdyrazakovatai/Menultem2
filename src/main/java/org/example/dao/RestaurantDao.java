package org.example.dao;

import org.example.model.Restaurant;

import java.util.List;
import java.util.Set;

public interface RestaurantDao {
    String save(Restaurant restaurant);

    String save(List<Restaurant> restaurants);

    String deleteByIds(Long id);

    String deleteByIds(Set<Long> ids);

    List<Restaurant> getAll();

    String update(Long id, Restaurant restaurant);

    String findById(Long id);

    List<Restaurant> getRestaurantByType(String restType);
}
