package org.tony.dto;

import lombok.Getter;

@Getter
public class Dish {

    private static int nextId = 1;
    private String id;
    private String name;
    private double price;
    private FoodType foodType;


    public Dish(String name, double price, FoodType foodType) {
        this.id = String.format("B%03d", nextId++);
        this.name = name;
        this.price = price;
    }
}
