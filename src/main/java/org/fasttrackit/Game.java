package org.fasttrackit;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

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


    private void initAnimal() {
        System.out.println("Please select your favorite animal: dog or cat ");

        Animal doggy = new Dog();
//        doggy.setAnimalName("Pitu");

        Animal catty = new Cat();
//        catty.setAnimalName("Elvis");

        Scanner scanner = new Scanner(System.in);
        String chosenAnimal = scanner.next();
        if (chosenAnimal.equals("dog")) {
            System.out.println("Your selected animal is: " + chosenAnimal);
        } else {
            if (chosenAnimal.equals("cat")) {
                System.out.println("Your selected animal is: " + chosenAnimal);
            } else {
                System.out.println("Please try again");
                initAnimal();

            }

        }


    }

    private void nameAnimal() {
        System.out.println("Now please choose a name for yout pet");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Your animal's name is: " + name);
    }


    private void initFood() {

        AnimalFood animalFood = new AnimalFood();
        AnimalFood animalFood2 = new AnimalFood();
        AnimalFood animalFood3 = new AnimalFood();


        animalFood.setFavoriteAnimalFoodName("1 - Canin");
        availableFood.add(animalFood);

        animalFood2.setFavoriteAnimalFoodName("2 - Meat balls");
        availableFood.add(animalFood2);

        animalFood3.setFavoriteAnimalFoodName("3 - Junior Canin");
        availableFood.add(animalFood3);

    }

    private void requireFeeding() {
//        System.out.println(animalFood.getFavoriteAnimalFoodName() + "\n" + animalFood2.getFavoriteAnimalFoodName() + "\n" + animalFood3.getFavoriteAnimalFoodName());
        displayFoods();
        System.out.println("Please choose your pets favorie food from above (choose the number associate with the food) " +
                "or you can type his favorite food: ");
        Scanner scanner = new Scanner(System.in);
        String userInputFood = scanner.next();

        if (userInputFood.equals("1") || userInputFood.equals("2") || userInputFood.equals("3")) {
            if (userInputFood.equals("1")) {
                System.out.println("Your pet's favorite food will be: Canin. ");
            }
            if (userInputFood.equals("2")) {
                System.out.println("Your pet's favorite food will be: Meat balls. ");
            }
            if (userInputFood.equals("3")) {
                System.out.println("Your pet's favorite food will be: Junior Canin");
            }
        } else {
            AnimalFood food = new AnimalFood();
            initFood();
            food.setFavoriteAnimalFoodName(userInputFood);
            availableFood.add(food);
            System.out.println("His favorie food will be: " + food.getFavoriteAnimalFoodName());


        }


    }


    public static boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c))
                return false;
        }
        return true;
    }

    private void initRescuer() {
        Adopter name = new Adopter();
        System.out.println("Please insert your name: ");

        Scanner scanner = new Scanner(System.in);
        String adopterName = scanner.next();
        name.setAdopterName(adopterName);

        if (!isNumeric(adopterName))
            System.out.println("Your name is: " + name.getAdopterName());
        else {
            System.out.println("Please try again (expected string)");
            initRescuer();
        }

    }


    private void initActivities() {
        RecreationActivity recreationActivity = new RecreationActivity();
        RecreationActivity recreationActivity1 = new RecreationActivity();

        recreationActivity.setActivityname("Sleeping");
        recreationActivity1.setActivityname("Running");

        availableActivities[0] = new RecreationActivity();
        availableActivities[0] = recreationActivity;
        availableActivities[1] = new RecreationActivity();
        availableActivities[1] = recreationActivity1;
    }


    public void start() {
        initActivities();
//            displayAllActivities();
        initAnimal();
        nameAnimal();
        initRescuer();
        initFood();
        requireFeeding();
//        displayFoods();


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

