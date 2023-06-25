package com.sachin.Restaurant.model.controller;

import com.sachin.Restaurant.model.model.User;
import com.sachin.Restaurant.model.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService;

    //read
    @GetMapping("restaurants")
    public List<User> getAllRestaurant()
    {
        return restaurantService.getAllRestaurant();
    }

    //read by ID
    @GetMapping("restaurants/{restaurantID}")
    public User getRestaurantByID(@PathVariable Integer restaurantID)
    {
        return restaurantService.getRestaurantByID(restaurantID);
    }

    //create
    @PostMapping("restaurants")
   public String addRestaurant(@RequestBody List<User> restaurants)
    {
        return restaurantService.createRestaurants(restaurants);
    }

    //update
    @PutMapping("restaurants/{restaurantID}/{status}")
    public String markRestaurant(@PathVariable Integer restaurantID)
    {
        return restaurantService.updateRestaurants(restaurantID);
    }

    //delete
    @DeleteMapping("restaurants")
    public String removeRestaurant(@RequestParam Integer restaurantID)
    {
        return restaurantService.removeRestaurant(restaurantID);
    }
}
