package org.fasttrackit;
import java.time.LocalDateTime;
import java.lang.String;


public class App
{
    public static void main( String[] args )
    {
        Adopter firstAdopter = new Adopter();
        firstAdopter.adopterName = "Viorel Bercea";
        firstAdopter.availableMoney = 500.25;
        System.out.println("Adopter name: " + firstAdopter.adopterName);
        System.out.println("Availabe money: "+ firstAdopter.availableMoney);

        Animal firstAnimal = new Animal();
        firstAnimal.animalName = "Foxy";
        firstAnimal.healthLevel = 6;
        firstAnimal.spiritLevel = 9;
        firstAnimal.food = "Junior Canin";
        firstAnimal.activities = "Running after ball";
        System.out.println("Animal name: " + firstAnimal.animalName);
        System.out.println("Health level: " + firstAnimal.healthLevel);
        System.out.println("Spirit level: " + firstAnimal.spiritLevel);
        System.out.println("Food: " + firstAnimal.food);
        System.out.println("Activities: " + firstAnimal.activities);


        AnimalFood animalFood = new AnimalFood();
        animalFood.favoriteAnimalFoodName = "Royal Canin";
        animalFood.foodPrice = 18.68;
        animalFood.year = LocalDateTime.now();


        System.out.println("Favorite animal food name: " + animalFood.favoriteAnimalFoodName);
        System.out.println("Food price: " + animalFood.foodPrice);
        System.out.println("In stock: " + animalFood.inStock);


        Veterinary firstVeterinary = new Veterinary();
        firstVeterinary.veterinayName = "Mark Goldenberg";
        firstVeterinary.specialization = "Dogs specialization";
        System.out.println("Veterinary name: " + firstVeterinary.veterinayName);
        System.out.println("Specialization" + ": " + firstVeterinary.specialization);


        Game game = new Game();
        game.adopter = firstAdopter ;
        System.out.println(game.adopter);
        game.veterinaryName = firstVeterinary;
        game.dog = firstAnimal;


        Pet firstPet = new Pet();
        firstPet.inHouse = true;

        
        Dog FirstDog = new Dog();
        FirstDog.barking = true;
        System.out.println("The dog is barking: " + FirstDog.barking);









    }
}
