package org.fasttrackit;

public class Game {
   private Adopter adopter ;
   private Animal dog;
   private Veterinary veterinaryName;

//    public Game(Adopter adopter, Animal dog, Veterinary veterinaryName) {
//        this.adopter = adopter;
//        this.dog = dog;
//        this.veterinaryName = veterinaryName;
//    }

    public Adopter getAdopter() {
        return adopter;
    }

    public void setAdopter(Adopter adopter) {
        this.adopter = adopter;
    }

    public Animal getDog() {
        return dog;
    }

    public void setDog(Animal dog) {
        this.dog = dog;
    }

    public Veterinary getVeterinaryName() {
        return veterinaryName;
    }

    public void setVeterinaryName(Veterinary veterinaryName) {
        this.veterinaryName = veterinaryName;
    }
}
