package org.fasttrackit;

public class Pet extends Animal{
    boolean inHouse;

    public Pet(String animalName, int healthLevel, int hungryLevel, int spiritLevel, String food, String activities, boolean inHouse) {
        super(animalName, healthLevel, hungryLevel, spiritLevel, food, activities);
        this.inHouse = inHouse;
    }
}

