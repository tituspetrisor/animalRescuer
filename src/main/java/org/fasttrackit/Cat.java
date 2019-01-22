package org.fasttrackit;

public class Cat extends Pet{
    private boolean purrs;
    @Override
    public void showSpiritLevel(Animal spiritLevel, Animal animal){
        System.out.println(animal.getAnimalName() + "'s pirit level is: " + animal.getSpiritLevel() + " and the cat is purrs.");

    }
}
