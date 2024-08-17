package org.example;

import org.example.Animals.Rabbit;
import org.example.Animals.Snake;
import org.example.Animals.Wolf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;


public class Controller {

    Animal animal;

    private List<Animal> animals = new ArrayList<>();
    public List<Animal> temp = new ArrayList<>();

    public Controller(){
    }



    public void spawn(){
        for (int i = 0; i < 100 ; i++) {

            int rx = ThreadLocalRandom.current().nextInt(0 , Settings.HEIGHT);
            int ry = ThreadLocalRandom.current().nextInt(0 , Settings.WIDTH);

            }
        }


    public void nextTurn(){
        Iterator<Animal> animalIterator = animals.iterator();
        while (animalIterator.hasNext()) {
            Animal animal = animalIterator.next();

            if(animal.getAge() > Settings.AGE_OF_DEAD) animalIterator.remove();
            animal.setAge(animal.getAge() + 1);
            animal.setWeight(animal.getWeight() * Settings.DECREASE_WEIGHT_IN_TURN);
            animal.setReadyReproduce(true);
        }
    }

public  void animalPrint(){
    System.out.println(Snake.icon + " "  );
    // System.out.println(Rabbit.icon + " " );
}

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }
}
