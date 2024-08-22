package org.example;

import org.example.Animals.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class Service {

    private List<Animal> animals = new ArrayList<>();
    private List<Plant> plants = new ArrayList<>();
    public List<Plant> tempPlant = new ArrayList<>();
    public List<Animal> temp = new ArrayList<>();

    public Service(){
    }


    public void spawnAnimal(String animal){
        int rx = ThreadLocalRandom.current().nextInt(0 , Settings.HEIGHT);
        int ry = ThreadLocalRandom.current().nextInt(0 , Settings.WIDTH);
        switch (animal){
            case "Wolf": animals.add(new Wolf(rx, ry)); break;
            case "Rabbit": animals.add(new Rabbit(rx, ry)); break;
            case "Bear": animals.add(new Bear(rx, ry)); break;
            case "Boar": animals.add(new Boar(rx, ry)); break;
            case "Buffalo": animals.add(new Buffalo(rx, ry)); break;
            case "Caterpillar": animals.add(new Caterpillar(rx, ry)); break;
            case "Deer": animals.add(new Deer(rx, ry)); break;
            case "Duck": animals.add(new Duck(rx, ry)); break;
            case "Eagle": animals.add(new Eagle(rx, ry)); break;
            case "Fox": animals.add(new Fox(rx, ry)); break;
            case "Goat": animals.add(new Goat(rx, ry)); break;
            case "Horse": animals.add(new Horse(rx, ry)); break;
            case "Mouse": animals.add(new Mouse(rx, ry)); break;
            case "Sheep": animals.add(new Sheep(rx, ry)); break;
            case "Snake": animals.add(new Snake(rx, ry));
        }
    }


    public void spawnPlant(){
        int rx = ThreadLocalRandom.current().nextInt(0 , Settings.HEIGHT);
        int ry = ThreadLocalRandom.current().nextInt(0 , Settings.WIDTH);
        plants.add(new Plant(rx , ry));
    }


    public void spawn(){
        for (int i = 0; i < Settings.quantityBear ; i++) spawnAnimal("Bear");
        for (int i = 0; i < Settings.quantityBoar ; i++) spawnAnimal("Boar");
        for (int i = 0; i < Settings.quantityBuffalo ; i++) spawnAnimal("Buffalo");
        for (int i = 0; i < Settings.quantityCaterpillar ; i++) spawnAnimal("Caterpillar");
        for (int i = 0; i < Settings.quantityDeer ; i++) spawnAnimal("Deer");
        for (int i = 0; i < Settings.quantityDuck; i++) spawnAnimal("Duck");
        for (int i = 0; i < Settings.quantityEagle ; i++) spawnAnimal("Eagle");
        for (int i = 0; i < Settings.quantityFox ; i++) spawnAnimal("Fox");
        for (int i = 0; i < Settings.quantityGoat ; i++) spawnAnimal("Goat");
        for (int i = 0; i < Settings.quantityHorse ; i++) spawnAnimal("Horse");
        for (int i = 0; i < Settings.quantityRabbit ; i++) spawnAnimal("Rabbit");
        for (int i = 0; i < Settings.quantitySheep ; i++) spawnAnimal("Sheep");
        for (int i = 0; i < Settings.quantitySnake ; i++) spawnAnimal("Snake");
        for (int i = 0; i < Settings.quantityMouse ; i++) spawnAnimal("Mouse");
        for (int i = 0; i < Settings.quantityWolf ; i++) spawnAnimal("Wolf");
        for (int i = 0; i < Settings.quantityPlant ; i++) spawnPlant();
        Collections.shuffle(animals);
        }


    public void nextTurn(){
        Iterator<Animal> animalIterator = animals.iterator();
        while (animalIterator.hasNext()) {
            Animal animal = animalIterator.next();

            if(animal.getAge() > Settings.AGE_OF_DEAD) animalIterator.remove();
            animal.setAge(animal.getAge() + 1);
            if(!(animal.name.equals("Caterpillar"))) {
                animal.setWeight(animal.getWeight() * Settings.DECREASE_WEIGHT_IN_TURN);
            }
            animal.setReadyReproduce(true);
        }
    }

public  void animalPrint(){
    System.out.println("<<<ХИЩЬНИКИ>>");
    System.out.println("\uD83D\uDC3A " + animals.stream().filter(x -> x.name.equals("Wolf")).count());
    System.out.println("\uD83D\uDC0D " + animals.stream().filter(x -> x.name.equals("Snake")).count());
    System.out.println("\uD83E\uDD8A " + animals.stream().filter(x -> x.name.equals("Fox")).count());
    System.out.println("\uD83D\uDC3B " + animals.stream().filter(x -> x.name.equals("Bear")).count());
    System.out.println("\uD83E\uDD85 " + animals.stream().filter(x -> x.name.equals("Eagle")).count());
    System.out.println("<<Травоядные>>");
    System.out.println("\uD83D\uDC0E " + animals.stream().filter(x -> x.name.equals("Horse")).count());
    System.out.println("\uD83E\uDD8C " + animals.stream().filter(x -> x.name.equals("Deer")).count());
    System.out.println("\uD83D\uDC07 " + animals.stream().filter(x -> x.name.equals("Rabbit")).count());
    System.out.println("\uD83D\uDC01 " + animals.stream().filter(x -> x.name.equals("Mouse")).count());
    System.out.println("\uD83D\uDC10 " + animals.stream().filter(x -> x.name.equals("Goat")).count());
    System.out.println("\uD83D\uDC11 " + animals.stream().filter(x -> x.name.equals("Sheep")).count());
    System.out.println("\uD83D\uDC17 " + animals.stream().filter(x -> x.name.equals("Boar")).count());
    System.out.println("\uD83D\uDC03 " + animals.stream().filter(x -> x.name.equals("Buffalo")).count());
    System.out.println("\uD83E\uDD86 " + animals.stream().filter(x -> x.name.equals("Duck")).count());
    System.out.println("\uD83D\uDC1B " + animals.stream().filter(x -> x.name.equals("Caterpillar")).count());
    System.out.println("<<Растение>>");
    System.out.println("\uD83C\uDF3F " + plants.size());
}

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public List<Plant> getPlants() {
        return plants;
    }

    public void setPlants(List<Plant> plants) {
        this.plants = plants;
    }
}
