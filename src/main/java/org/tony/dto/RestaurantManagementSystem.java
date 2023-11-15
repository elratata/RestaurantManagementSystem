package org.tony.dto;

import java.util.Arrays;

public class RestaurantManagementSystem {

    private Combo[] combos;
    private static final int MAX_COMBO_NUM = 20;

    public RestaurantManagementSystem() {
        this.combos = new Combo[MAX_COMBO_NUM];
    }


    @Override
    public String toString() {
        return "RestaurantManagementSystem{" +
                "combos=" + Arrays.toString(combos) +
                '}';
    }
}
