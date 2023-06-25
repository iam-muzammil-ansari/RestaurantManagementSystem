package com.geekster.restaurant.service;

import com.geekster.restaurant.model.Restaurant;
import com.geekster.restaurant.repository.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;
import java.util.Map;

@Service
@Validated
public class RestaurantService {
    @Autowired
    private RestaurantRepo restaurantRepo;

    public Map<Integer, Restaurant> getAllRestaurant() {
        return restaurantRepo.getRestaurantList();
    }

    public Restaurant getRestaurantById(Integer id) {
        return getAllRestaurant().get(id);
    }

    public String addRestaurant(List<Restaurant> restaurants) {
        for (Restaurant restaurant : restaurants) {
            restaurantRepo.addRestaurant(restaurant.getId(), restaurant);
        }
        return "Restaurants added successfully!";
    }

    public String updateRestaurant(Integer id, Restaurant restaurant) {
        if (restaurantRepo.getRestaurantList().containsKey(id)) {
            restaurantRepo.addRestaurant(id, restaurant);
            return "Restaurant updated successfully!";
        } else {
            return "Restaurant not found!";
        }
    }

    public String deleteRestaurant(Integer id) {
        if (restaurantRepo.getRestaurantList().containsKey(id)) {
            restaurantRepo.removeRestaurant(id);
            return "Restaurant deleted successfully!";
        } else {
            return "Restaurant not found!";
        }
    }
}
