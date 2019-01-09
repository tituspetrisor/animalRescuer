package org.fasttrackit;

public class Adopter {
   private String adopterName;
   private Double availableMoney;

//    public Adopter(String adopterName, Double availableMoney) {
//        this.adopterName = adopterName;
//        this.availableMoney = availableMoney;
//    }

    public String getAdopterName() {
        return adopterName;
    }

    public void setAdopterName(String adopterName) {
        this.adopterName = adopterName;
    }

    public Double getAvailableMoney() {
        return availableMoney;
    }

    public void setAvailableMoney(Double availableMoney) {
        this.availableMoney = availableMoney;
    }

    public void feding(Animal animal, AnimalFood animalFood){

        System.out.println(getAdopterName() + " just gave some " + animalFood.getFavoriteAnimalFoodName()+ " food to " + animal.getAnimalName() + ".");
    }
    public void recreation(Animal animal, RecreationActivity activity){
        System.out.println(getAdopterName() + " go out with " + animal.getAnimalName() + " to " + activity.getActivityname() + ".");
    }
}
