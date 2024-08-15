package org.example;

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
            int rA =  ThreadLocalRandom.current().nextInt(0 , 2);
            int rx = ThreadLocalRandom.current().nextInt(0 , Settings.HEIGHT);
            int ry = ThreadLocalRandom.current().nextInt(0 , Settings.WIDTH);
            if(rA == 0){
                animal = new Wolf(rx , ry);
                getAnimals().add(animal);
            }
            else {
                animal = new Rabbit(rx , ry);
               getAnimals().add(animal);

            }
        }
    }

    public void nextTurn(){
        Iterator<Animal> animalIterator = animals.iterator();
        while (animalIterator.hasNext()) {
            Animal animal = animalIterator.next();

            if(animal.getAge() > Settings.AGE_OF_DEAD) {animalIterator.remove();
                System.out.println("Умер от старости");}
            animal.setAge(animal.getAge() + 1);
            animal.setWeight(animal.getWeight() * Settings.DECREASE_WEIGHT_IN_TURN);
            animal.setReadyReproduce(true);
        }
    }

public  void animalPrint(){
   for (Animal animal : getAnimals()){
       System.out.print(animal.getX() + " " + animal.getY() + " ");
       if (animal instanceof Wolf) System.out.println("Волк");
   }
    for (Animal animal : getAnimals()){
        System.out.print(animal.getX() + " " + animal.getY() + " ");
        if (animal instanceof Rabbit) System.out.println("Кролик");
    }
}

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }
}
