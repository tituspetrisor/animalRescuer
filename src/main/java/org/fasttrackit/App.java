package org.fasttrackit;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.lang.String;


public class App 
{
    public static void main( String[] args )
    {
        Adopter adopter = new Adopter();
        adopter.adopterName = "Viorel Bercea";
        adopter.availableMoney = 500.25;
        System.out.println("Adopter name: " + adopter.adopterName);
        System.out.println("Availabe money: "+ adopter.availableMoney);

        Animal animal = new Animal();
        animal.animalName = "Foxy";
        animal.healthLevel = 6;
        animal.spiritLevel = 9;
        animal.food = "Junior Canin";
        animal.activities = "Running after ball";
        System.out.println("Animal name: " + animal.animalName);
        System.out.println("Health level: " + animal.healthLevel);
        System.out.println("Spirit level: " + animal.spiritLevel);
        System.out.println("Food: " + animal.food);
        System.out.println("Activities: " + animal.activities);






        AnimalFood animalFood = new AnimalFood();
        animalFood.favoriteAnimalFoodName = "Royal Canin";
        animalFood.foodPrice = 18.68;
//        SimpleDateFormat date = new SimpleDateFormat("ddmm/yyyy");
//        date = "25/12/2020";
        animalFood.inStock = true;
        System.out.println("Favorite animal food name: " + animalFood.favoriteAnimalFoodName);
        System.out.println("Food price: " + animalFood.foodPrice);
        System.out.println("In stock: " + animalFood.inStock);

        Veterinary veterinary = new Veterinary();
        veterinary.veterinayName = "Mark Goldenberg";
        veterinary.specialization = "Dogs specialization";
        System.out.println("Veterinary name: " + veterinary.veterinayName);
        System.out.println("Specialization" +
                ": " + veterinary.specialization);

        Game game = new Game();
        game.name = "Vlad Pop";
        System.out.println(game.name);

        adopter.adopterrrr = game;
        ((Game) adopter.adopterrrr).name=





    }
}
