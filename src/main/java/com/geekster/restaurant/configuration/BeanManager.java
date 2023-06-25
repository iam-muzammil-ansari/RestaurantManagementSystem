package com.geekster.restaurant.configuration;

import com.geekster.restaurant.model.Restaurant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class BeanManager {

    @Bean
    public Map<Integer, Restaurant> getRestaurantMap() {
        return new HashMap<>();
    }
}
