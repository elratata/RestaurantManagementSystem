package org.tony.dto;

public class Combo {

    private static int nextId = 1;
    private String id;
    private String name;
    private double price;

    private Dish[] dishes;
    private Beverage[] beverages;
    private static final int MAX_BEVERAGE_NUM = 3;
    private static final int MAX_DISH_NUM = 3;


    public Combo(String name) {
        this.id = String.format("B%03d", nextId++);
        this.name = name;
        this.dishes = new Dish[MAX_DISH_NUM];
        this.beverages = new Beverage[MAX_BEVERAGE_NUM];
    }

    public void addDish(Dish dish) {
        if (dishes[0] == null) {
            dishes[0] = dish;
        } else if (dishes[1] == null) {
            dishes[1] = dish;
        } else {
            System.out.println("There are already 2 dishes, fatty");
        }
    }

    public void addBeverage(Beverage beverage) {
        if (beverages[0] == null) {
            beverages[0] = beverage;
        } else if (beverages[1] == null) {
            beverages[1] = beverage;
        } else {
            System.out.println("There are already 2 drinks, fatty");
        }
    }

    public double calcPrice(){
        double price = 0;

        for (Beverage beverage: beverages){
            if(beverage == null){
                break;
            }
            price += beverage.getPrice();
        }

        for (Dish dish: dishes){
            if(dish == null){
                break;
            }
            price += dish.getPrice();
        }

        double discountRatio = 0.95;
        return discountRatio * price;
    }
}
