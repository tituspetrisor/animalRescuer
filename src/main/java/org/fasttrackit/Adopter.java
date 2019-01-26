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

    public void feding(Animal animal, AnimalFood animalFood) {


        if (animal.food.equals(animalFood.favoriteAnimalFoodName)) {
            animal.spiritLevel++;
            System.out.println("After he eated his favorite food the spirit level is: " + animal.getSpiritLevel());
        } else System.out.println("The animal wants his favorite food!!!");

        System.out.println("Initial hungry level is: " + animal.getHungryLevel());
        animal.hungryLevel--;
        System.out.println(getAdopterName() + " just gave some " + animalFood.getFavoriteAnimalFoodName() + " food to " + animal.getAnimalName() + "and " +
                " and the current level is: " + animal.getHungryLevel() + ".");
        animal.hungryLevel--;
    }

    public void recreation(Animal animal, RecreationActivity activity) {

        System.out.println("Initial happines level is: " + animal.getSpiritLevel());
        if (animal.activities.equals(activity.activityname)) {
            animal.spiritLevel = animal.spiritLevel + 2;
            System.out.println("The new spirit level after his favorite activity is: " + animal.getSpiritLevel());
        } else {
            animal.spiritLevel++;
            System.out.println("The new spirit level after he did something that it is not interesting is " + animal.getSpiritLevel());
        }

        System.out.println(getAdopterName() + " go out with " + animal.getAnimalName() + " to " + activity.getActivityname() + " and the current " +
                "spirit level is: " + animal.getSpiritLevel() + ".");
    }
}
