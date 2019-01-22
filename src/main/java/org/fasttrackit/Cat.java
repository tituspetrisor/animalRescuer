package org.fasttrackit;

public class Cat extends Pet{
    private boolean purrs;
    @Override
    public void showSpiritLevel(int spiritLevel, Animal animal){
        System.out.println(animal.getAnimalName() + "'s pirit level is: " + spiritLevel + " and the cat is purrs.");

    }
}
