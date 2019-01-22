package org.fasttrackit;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.lang.String;


public class App
{
    public static void main( String[] args )
    {
        Adopter firstAdopter = new Adopter();
        firstAdopter.setAdopterName("Viorel Bercea");
        firstAdopter.setAvailableMoney(500.25    );

        System.out.println("Adopter name: " + firstAdopter.getAdopterName());
        System.out.println("Availabe money: "+ firstAdopter.getAvailableMoney());

        Animal firstAnimal = new Animal();

        firstAnimal.setAnimalName("Foxy");
        firstAnimal.setHealthLevel(6);
        firstAnimal.setSpiritLevel(7);
        firstAnimal.setFood("Junior Canin");
        firstAnimal.setActivities("Running after ball");

        System.out.println("Animal name: " + firstAnimal.getAnimalName());
        System.out.println("Health level: " + firstAnimal.getHealthLevel());
        System.out.println("Spirit level: " + firstAnimal.getSpiritLevel());
        System.out.println("Food: " + firstAnimal.getFood());
        System.out.println("Activities: " + firstAnimal.getActivities());


        AnimalFood animalFood = new AnimalFood();

        animalFood.setFavoriteAnimalFoodName("Royal Canin");
        animalFood.setFoodPrice(18.68);
        animalFood.setYear(LocalDate.of(2020, 12, 12));
        animalFood.setInStock(true);

        System.out.println("Favorite animal food name: " + animalFood.getFavoriteAnimalFoodName());
        System.out.println("Food price: " + animalFood.getFoodPrice());
        System.out.println("Expiry date: " + animalFood.getYear());
        System.out.println("It is in stock: " + animalFood.getInInStock());


        Veterinary firstVeterinary = new Veterinary();

        firstVeterinary.setVeterinayName("Mark Goldenberg");
        firstVeterinary.setSpecialization("Dogs specialization");
        System.out.println("Veterinary name: " + firstVeterinary.getVeterinayName());
        System.out.println("Specialization: " + firstVeterinary.getSpecialization());


        RecreationActivity firstActivity =new RecreationActivity();
        firstActivity.setActivityname("playing with balls");


        Dog firstDog = new Dog();

        firstDog.setAnimalName("Bingo");
        firstDog.setHealthLevel(8);
        firstDog.setHealthLevel(9);
        firstDog.setSpiritLevel(8);
        firstDog.setFood("Royal Canin");
        firstDog.setActivities("Washing");
        firstDog.setBarking(true);
        firstDog.setInHouse(true);

        System.out.println("Dogs name: " + firstDog.getAnimalName());
        System.out.println("Health level: " + firstDog.getHealthLevel());

        firstAdopter.feding(firstAnimal, animalFood);
        firstAdopter.recreation(firstAnimal, firstActivity);

        Animal secondAnimal = new Animal();
        secondAnimal.setAnimalName("Frufru");
        secondAnimal.showSpiritLevel(7, secondAnimal);

        firstDog.setAnimalName("Pitu");
        firstDog.showSpiritLevel(6, firstDog);

        Cat firstCat = new Cat();
        firstCat.setAnimalName("Elvi");
        firstCat.showSpiritLevel(9, firstCat);



























    }
}
