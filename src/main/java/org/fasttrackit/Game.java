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

//
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

    Animal chosenAnimal = new Animal();


    public void initAnimal() {
        System.out.println("Please select your favorite animal: dog or cat ");

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
        chosenAnimal.setAnimalName(name);
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
        initFood();
        displayFoods();
        System.out.println("Please choose your pets food from above (choose the number associate with the food) " +
                "or you can type his favorite food: ");
        Scanner scanner = new Scanner(System.in);
        String userInputFood = scanner.next();

        if (userInputFood.equals("1") || userInputFood.equals("2") || userInputFood.equals("3")) {
            if (userInputFood.equals("1")) {
                System.out.println("Your pets food will be: Canin. ");
            }
            if (userInputFood.equals("2")) {
                System.out.println("Your pets  food will be: Meat balls. ");
            }
            if (userInputFood.equals("3")) {
                System.out.println("Your pets food will be: Junior Canin");
            }
        } else {
            AnimalFood food = new AnimalFood();
            initFood();
            food.setFavoriteAnimalFoodName(userInputFood);
            availableFood.add(food);
            System.out.println("His food will be: " + food.getFavoriteAnimalFoodName());
        }
    }

    private void requireActivity() {
        initActivities();
        displayAllActivities();
        System.out.println("Please choose activity for your pet from above or you can type an activity for your per: ");

        Scanner scanner = new Scanner(System.in);
        String userInputActivity = scanner.next();
        if (userInputActivity.equals("Sleeping")) {
            System.out.println("Pets activity will be " + availableActivities[0]);
        }
        if (userInputActivity.equals("Running")) {
            System.out.println("Pets activity will be: " + availableActivities[1]);
        } else {
            RecreationActivity recreationActivity = new RecreationActivity();
            initActivities();
            recreationActivity.setActivityname(userInputActivity);
            availableActivities[2] = new RecreationActivity();
            availableActivities[2] = recreationActivity;
            System.out.println("Pets activity will be: " + recreationActivity.getActivityname());
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


    public void displayFoods() {
        for (int i = 0; i < availableFood.size(); i++) {
            if (availableFood != null) {
                System.out.println(availableFood.get(i).getFavoriteAnimalFoodName());
            }
        }
    }

    public void displayAllActivities() {
        System.out.println("All activities are: ");
        for (RecreationActivity activity : availableActivities) {
            if (activity != null) {
                System.out.println(activity.getActivityname());
            }
        }
    }

    public void entireGame() {
        Animal chosenAnimal = new Animal();
        chosenAnimal.setSpiritLevel(0);
        chosenAnimal.setHungryLevel(0);
        System.out.println("After you choose your pets charactisitc you have to play with him :) ");
        System.out.println("Initial spirit level is " + chosenAnimal.getSpiritLevel() + " and you have to make him happy until 9 spirit level");
        System.out.println("Initial hunger level is " + chosenAnimal.getHungryLevel() + " and you have to make him happy until 8 hunger level");
        while (chosenAnimal.spiritLevel <= 9 && chosenAnimal.hungryLevel <= 8) {
            requireActivity();
            requireFeeding();
            chosenAnimal.spiritLevel++;
            chosenAnimal.hungryLevel++;
            System.out.println("YOU WON THE GAME AND THE PET LOVES YOU");
        }
    }

    public void start() {
        initAnimal();
        nameAnimal();
        initRescuer();
        entireGame();
    }
}

