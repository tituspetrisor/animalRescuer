package org.fasttrackit;

import java.time.LocalDate;

public class AnimalFood {
   private  String favoriteAnimalFoodName;
   private double foodPrice;
   private LocalDate year;
   private boolean inStock;

//    public AnimalFood(String favoriteAnimalFoodName, double foodPrice, int year, boolean inStock) {
//        this.favoriteAnimalFoodName = favoriteAnimalFoodName;
//        this.foodPrice = foodPrice;
//        this.year = year;
//        this.inStock = inStock;
//    }

    public String getFavoriteAnimalFoodName() {
        return favoriteAnimalFoodName;
    }

    public void setFavoriteAnimalFoodName(String favoriteAnimalFoodName) {
        this.favoriteAnimalFoodName = favoriteAnimalFoodName;
    }

    public double getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(double foodPrice) {
        this.foodPrice = foodPrice;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public boolean getInInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }
}
