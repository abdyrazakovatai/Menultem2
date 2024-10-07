package org.example.service;

import org.example.model.Restaurant;

import java.util.List;
import java.util.Set;

public interface RestaurantService {

    String save(Restaurant restaurant);

    String save(List<Restaurant> restaurants);

    String delete(Long id);

    String deleteByIds(Set<Long> ids);

    List<Restaurant> getAll();

    String update(Long id, Restaurant restaurant);

    String findById(Long id);

    List<Restaurant> getRestaurantByType(String restType);
}
