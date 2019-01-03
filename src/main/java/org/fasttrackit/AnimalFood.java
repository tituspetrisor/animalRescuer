package org.fasttrackit;

import java.time.LocalDateTime;
import java.util.Date;

public class AnimalFood {
    String favoriteAnimalFoodName;
    double foodPrice;
    int year;
    boolean inStock;

    public AnimalFood(String favoriteAnimalFoodName, double foodPrice, int year, boolean inStock) {
        this.favoriteAnimalFoodName = favoriteAnimalFoodName;
        this.foodPrice = foodPrice;
        this.year = year;
        this.inStock = inStock;
    }
}
