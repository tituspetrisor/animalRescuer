package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Adopter adopter;
    private Animal dog;
    private Veterinary veterinaryName;
    private List<AnimalFood> availableFood = new ArrayList<>();
    private RecreationActivity[] availableActivities = new RecreationActivity[15];


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

    private void initFood() {

        AnimalFood animalFood = new AnimalFood();
        AnimalFood animalFood2 = new AnimalFood();

        animalFood.setFavoriteAnimalFoodName("Canin");
        availableFood.add(animalFood);

        animalFood2.setFavoriteAnimalFoodName("Meat balls");
        availableFood.add(animalFood2);
    }


    private void initActivities(int index) {
        RecreationActivity recreationActivity = new RecreationActivity();
        RecreationActivity recreationActivity1 = new RecreationActivity();

        recreationActivity.setActivityname("Sleeping");
        recreationActivity1.setActivityname("Running");

        availableActivities[0] = new RecreationActivity();
        availableActivities[index] = recreationActivity;
        availableActivities[1] = new RecreationActivity();
        availableActivities[1] = recreationActivity1;
    }

    public void start() {
        initActivities(0);
        displayAllActivities();
        initFood();
        displayFoods();

    }

    public void displayFoods() {
        for (int i = 0; i < availableFood.size(); i++) {
            if (availableFood != null) {
                System.out.println(availableFood.get(i).getFavoriteAnimalFoodName());

            }
        }
    }

    public void displayAllActivities() {
        System.out.println("All activities: ");
        for (RecreationActivity activity : availableActivities) {
            if (activity != null) {
                System.out.println(activity.getActivityname());
            }
        }
    }


}

