package com.sachin.Restaurant.model.configuration;

import com.sachin.Restaurant.model.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanManager {
    @Bean
   public List<User> getInitializedList()
    {
        User initUser = new User(0,"Taj","Mumbai","9596834516","Pure Veg",100);

       List<User> initList = new ArrayList<>();
       initList.add(initUser);

       return initList;
    }
}
