package org.fasttrackit;

public class Cat extends Pet{
    private boolean purrs;
    @Override
    public void showSpiritLevel(Animal spiritLevel){
        System.out.println(getAnimalName() + "'s pirit level is: " + spiritLevel.getSpiritLevel() + " and the cat is purrs.");

    }
}
