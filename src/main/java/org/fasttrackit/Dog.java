package org.fasttrackit;

public class Dog extends Pet{
   private boolean barking;

//    public Dog(String animalName, int healthLevel, int hungryLevel, int spiritLevel, String food, String activities, boolean inHouse, boolean barking) {
//        super(animalName, healthLevel, hungryLevel, spiritLevel, food, activities, inHouse);
//        this.barking = barking;
//    }

    public boolean isBarking() {
        return barking;
    }

    public void setBarking(boolean barking) {
        this.barking = barking;
    }
    @Override
    public void showSpiritLevel(Animal spiritLevel){
        System.out.println(getAnimalName() + "'s level is: " + spiritLevel.getSpiritLevel() + " and the dog is fawn.");
    }



}
