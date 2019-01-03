package org.fasttrackit;

public class Game {
    Adopter adopter ;
    Animal dog;
    Veterinary veterinaryName;

    public Game(Adopter adopter, Animal dog, Veterinary veterinaryName) {
        this.adopter = adopter;
        this.dog = dog;
        this.veterinaryName = veterinaryName;
    }
}
