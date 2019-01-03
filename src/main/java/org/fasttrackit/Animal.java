package org.fasttrackit;

public class Animal {
    String animalName;
    int healthLevel;
    int  hungryLevel;
    int spiritLevel;
    String food;

    public Animal(String animalName, int healthLevel, int hungryLevel, int spiritLevel, String food, String activities) {
        this.animalName = animalName;
        this.healthLevel = healthLevel;
        this.hungryLevel = hungryLevel;
        this.spiritLevel = spiritLevel;
        this.food = food;
        this.activities = activities;
    }

    String activities;
}
