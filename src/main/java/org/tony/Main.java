package org.tony;

import org.tony.dto.*;

public class Main{
    public static void main(String[] args) {
        RestaurantManagementSystem restaurantManagementSystem = new RestaurantManagementSystem();

        Dish dish1 = new Dish("French Fries", 2.99, FoodType.VEGE);
        Beverage coke = new Beverage("Coke", 35, true);

        Combo combo1 = new Combo("Coke and fries");

        combo1.addDish(dish1);
        combo1.addBeverage(coke);

        System.out.println(combo1.calcPrice());
    }
}