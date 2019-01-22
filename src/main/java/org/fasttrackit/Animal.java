package org.fasttrackit;

public class Animal {
   protected String animalName;
   protected int healthLevel;
   protected int  hungryLevel;
   protected int spiritLevel;
   protected String food;
   protected String activities;



//    public Animal(String animalName, int healthLevel, int hungryLevel, int spiritLevel, String food, String activities) {
//        this.animalName = animalName;
//        this.healthLevel = healthLevel;
//        this.hungryLevel = hungryLevel;
//        this.spiritLevel = spiritLevel;
//        this.food = food;
//        this.activities = activities;
//
//
//    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public int getHungryLevel() {
        return hungryLevel;
    }

    public void setHungryLevel(int hungryLevel) {
        this.hungryLevel = hungryLevel;
    }

    public int getSpiritLevel() {
        return spiritLevel;
    }

    public void setSpiritLevel(int spiritLevel) {
        this.spiritLevel = spiritLevel;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getActivities() {
        return activities;
    }

    public void setActivities(String activities) {
        this.activities = activities;
    }
    public void showSpiritLevel(int spiritLevel, Animal animal){
             System.out.println("Spirit level is: " + spiritLevel +" and his name is " + animal.getAnimalName());
    }


}
