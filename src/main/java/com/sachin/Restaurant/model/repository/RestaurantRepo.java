package com.sachin.Restaurant.model.repository;

import com.sachin.Restaurant.model.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RestaurantRepo {
    @Autowired
    private List<User> userList;


    public List<User> getAllRestaurant() {
        return userList;
    }


    public void delete(User user) {
        userList.remove(user);
    }



}
