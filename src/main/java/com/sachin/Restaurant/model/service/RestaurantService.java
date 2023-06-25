package com.sachin.Restaurant.model.service;

import com.sachin.Restaurant.model.model.User;
import com.sachin.Restaurant.model.repository.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {
    @Autowired
    RestaurantRepo restaurantRepo;

    public List<User> getAllRestaurant() {
        return restaurantRepo.getAllRestaurant();
    }

    public String createRestaurants(List<User> restaurants) {
        List<User> originalList = getAllRestaurant();
        originalList.addAll(restaurants);
        return "New restaurant added";
    }

    public User getRestaurantByID(Integer restaurantID) {
        for(User user : restaurantRepo.getAllRestaurant())
        {
            if(user.getRestaurantID().equals(restaurantID))
            {
                return user;
            }
        }
        throw new IllegalStateException("id not found");
    }

    public String updateRestaurants(Integer restaurantID) {
        for(User user : restaurantRepo.getAllRestaurant())
        {
            if(user.getRestaurantID().equals(restaurantID))
            {
                Integer status = null;
                user.setRestaurantID(status);
                return "restaurant updated for restaurant ID: "+ restaurantID;
            }
        }
        return "restaurant not found by ID: " + restaurantID;
    }

    public String removeRestaurant(Integer restaurantID) {
        for(User user : restaurantRepo.getAllRestaurant())
        {
            if(user.getRestaurantID().equals(restaurantID))
            {
                restaurantRepo.delete(user);
                return "restaurant removed for restaurant ID: "+ restaurantID;
            }
        }
        return "restaurant : " + restaurantID + "not exist";
    }
}
