package org.fasttrackit;

public class Dog extends Pet{
    boolean barking;

    public Dog(String animalName, int healthLevel, int hungryLevel, int spiritLevel, String food, String activities, boolean inHouse, boolean barking) {
        super(animalName, healthLevel, hungryLevel, spiritLevel, food, activities, inHouse);
        this.barking = barking;
    }
}
