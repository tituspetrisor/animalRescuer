package org.fasttrackit;

public class Cat extends Pet{
    private boolean purrs;
    @Override
    public void showSpiritLevel(int spiritLevel){
        System.out.println("Spirit level is: " + spiritLevel + " and the cat is purrs.");

    }
}
