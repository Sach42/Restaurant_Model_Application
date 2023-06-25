package com.sachin.Restaurant.model.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Integer restaurantID;
    private String restaurantName;
    private String restaurantAddress;
    private String restaurantContact;
    private String restaurantSpeciality;
    private Integer restaurantStaff;
}
