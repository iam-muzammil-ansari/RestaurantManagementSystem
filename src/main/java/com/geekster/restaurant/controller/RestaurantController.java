package com.geekster.restaurant.controller;

import com.geekster.restaurant.model.Restaurant;
import com.geekster.restaurant.service.RestaurantService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/restaurants")
@Validated
public class RestaurantController {
    @Autowired
    private RestaurantService restaurantService;

    @GetMapping
    public Map<Integer, Restaurant> getAllRestaurant() {
        return restaurantService.getAllRestaurant();
    }

    @GetMapping("search/{id}")
    public Restaurant getRestaurantById(@PathVariable Integer id) {
        return restaurantService.getRestaurantById(id);
    }

    @PostMapping("add")
    public String addRestaurant(@Valid @RequestBody List<Restaurant> restaurants) {
        return restaurantService.addRestaurant(restaurants);
    }

    @PutMapping("update/{id}")
    public String updateRestaurant(@PathVariable Integer id, @Valid @RequestBody Restaurant restaurant) {
        return restaurantService.updateRestaurant(id, restaurant);
    }

    @DeleteMapping("delete/{id}")
    public String deleteRestaurant(@PathVariable Integer id) {
        return restaurantService.deleteRestaurant(id);
    }
}
