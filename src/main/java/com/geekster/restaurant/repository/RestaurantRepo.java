package com.geekster.restaurant.repository;

import com.geekster.restaurant.model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class RestaurantRepo {

    @Autowired
    private Map<Integer, Restaurant> restaurantMap;

    public Map<Integer, Restaurant> getRestaurantList() {
        return restaurantMap;
    }

    public void addRestaurant(Integer id, Restaurant restaurant) {
        restaurantMap.put(id, restaurant);
    }

    public void removeRestaurant(Integer id) {
        restaurantMap.remove(id);
    }
}
