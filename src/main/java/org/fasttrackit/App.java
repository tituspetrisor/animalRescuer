package org.fasttrackit;
import java.time.LocalDateTime;
import java.lang.String;


public class App
{
    public static void main( String[] args )
    {
        Adopter firstAdopter = new Adopter("Viorel Bercea", 500.25);
//
        System.out.println("Adopter name: " + firstAdopter.adopterName);
        System.out.println("Availabe money: "+ firstAdopter.availableMoney);

        Animal firstAnimal = new Animal("Foxy", 6, 7, 9,"Junior Canin", "Running after ball");

        System.out.println("Animal name: " + firstAnimal.animalName);
        System.out.println("Health level: " + firstAnimal.healthLevel);
        System.out.println("Spirit level: " + firstAnimal.spiritLevel);
        System.out.println("Food: " + firstAnimal.food);
        System.out.println("Activities: " + firstAnimal.activities);


        AnimalFood animalFood = new AnimalFood("Royal Canin", 18.68, 2020, true);
        System.out.println("Favorite animal food name: " + animalFood.favoriteAnimalFoodName);
        System.out.println("Food price: " + animalFood.foodPrice);
        System.out.println("Epiry date: " + animalFood.year);
        System.out.println("In stock: " + animalFood.inStock);


        Veterinary firstVeterinary = new Veterinary("Mark Goldenberg","Dogs specialization" );
        System.out.println("Veterinary name: " + firstVeterinary.veterinayName);
        System.out.println("Specialization: " + firstVeterinary.specialization);


        Dog FirstDog = new Dog("Bingo", 8, 9, 9, "Royal Canin", "Washing", true,true);
        FirstDog.barking = true;
        System.out.println("The dog is barking: " + FirstDog.barking);









    }
}
