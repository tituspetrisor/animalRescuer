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

        System.out.println(adopterName + " just gave some " + animalFood.favoriteAnimalFoodName+ " food to " + animal.animalName + ".");
    }
    public void recreation(Animal animal, RecreationActivity activity){
        System.out.println(adopterName + " go out with " + animal.animalName + " to " + activity.activityname + ".");
    }
}
