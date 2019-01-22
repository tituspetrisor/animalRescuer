package org.fasttrackit;

public class Pet extends Animal{
   private boolean inHouse;

//    public Pet(String animalName, int healthLevel, int hungryLevel, int spiritLevel, String food, String activities, boolean inHouse) {
//        super(animalName, healthLevel, hungryLevel, spiritLevel, food, activities);
//        this.inHouse = inHouse;
//    }

    public boolean isInHouse() {
        return inHouse;
    }

    public void setInHouse(boolean inHouse) {
        this.inHouse = inHouse;
    }
    @Override
    public void showSpiritLevel(int spiritLevel, Animal animal){
        System.out.println(animal.getAnimalName() + " spirit level is: " + spiritLevel);
    }
}

