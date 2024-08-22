package org.example;

import org.example.Animals.*;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Animal {
    protected String name;
    private int age;
    private double weight;
    protected double maxWeight;
    protected static int speedMove;
    protected static int maxLimit;
    private  int x;
    private  int y;
    protected boolean readyReproduce = false;




    public void eat(List<Animal> animals , List<Plant> plants) {
        int random = ThreadLocalRandom.current().nextInt(1 , 101);
        Iterator<Animal> animalIterator = animals.iterator();
        Iterator<Plant> plantIterator = plants.iterator();
        if(this instanceof Herbivore && !(this.name.equals("Caterpillar"))){
           while (plantIterator.hasNext()){
               Plant plant = plantIterator.next();
                if(this.getX() == plant.getX() && this.getY() == plant.getY()){
                    plantIterator.remove();
                    break;
                }
            }
        }
        while (animalIterator.hasNext()) {
            Animal animal = animalIterator.next();
            if (this.getX() == animal.getX() && this.getY() == animal.getY()) {
                if (Hunting.hunt(this , animal) >= random) {
                    this.setWeight(this.getWeight() + animal.getWeight());
                    animalIterator.remove();
                    break;
                    }
                }
        }
    }



    public void reproduce(List<Animal> animals){
        ListIterator<Animal> listIterator = animals.listIterator();
        int success = ThreadLocalRandom.current().nextInt(1 , 101);
        while (listIterator.hasNext()){
            Animal animal = listIterator.next();
            if(this.readyReproduce && animal.readyReproduce ){
            if(this.name.equals(animal.name) && this != animal) {
                if (this.getX() == animal.getX() && this.getY() == animal.getY() && success <= Settings.CHANCE_OF_REPRODUCTION) {
                    switch (animal.name){
                        case "Wolf": listIterator.add(new Wolf(this.getX(), this.getY())); break;
                        case "Rabbit": listIterator.add(new Rabbit(this.getX(), this.getY())); break;
                        case "Bear": listIterator.add(new Bear(this.getX(), this.getY())); break;
                        case "Boar": listIterator.add(new Boar(this.getX(), this.getY())); break;
                        case "Buffalo": listIterator.add(new Buffalo(this.getX(), this.getY())); break;
                        case "Caterpillar": listIterator.add(new Caterpillar(this.getX(), this.getY())); break;
                        case "Deer": listIterator.add(new Deer(this.getX(), this.getY())); break;
                        case "Duck": listIterator.add(new Duck(this.getX(), this.getY())); break;
                        case "Eagle": listIterator.add(new Eagle(this.getX(), this.getY())); break;
                        case "Fox": listIterator.add(new Fox(this.getX(), this.getY())); break;
                        case "Goat": listIterator.add(new Goat(this.getX(), this.getY())); break;
                        case "Horse": listIterator.add(new Horse(this.getX(), this.getY())); break;
                        case "Mouse": listIterator.add(new Mouse(this.getX(), this.getY())); break;
                        case "Sheep": listIterator.add(new Sheep(this.getX(), this.getY())); break;
                        case "Snake": listIterator.add(new Snake(this.getX(), this.getY())); break;
                    }
                    this.setReadyReproduce(false);
                    animal.setReadyReproduce(false);
                    break;
                }
            }
            }
        }
    }


    public void move(Animal animal){
        int move = ThreadLocalRandom.current().nextInt(0 , animal.getSpeedMove() + 1);
        int directions = ThreadLocalRandom.current().nextInt(0 , 4);
        if(directions == 0 && animal.getX() - move >= 0) setX(animal.getX() - move);
        else if(directions == 0 && animal.getX() - move < 0) setX(0);
        else if(directions == 1 && animal.getY() + move <= Settings.HEIGHT) setY(animal.getY() + move);
        else if (directions == 1 && animal.getY() + move > Settings.HEIGHT) setY(Settings.HEIGHT);
        else if(directions == 2 && animal.getX() + move <= Settings.WIDTH) setX(animal.getX() + move);
        else if (directions == 2 && animal.getX() + move > Settings.WIDTH) setX(Settings.WIDTH);
        else if (directions == 3 && animal.getY() - move >= 0) setY(animal.getY() -move);
        else if (directions == 3 && animal.getY() - move < 0) setY(0);
    }


    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public int getSpeedMove() {
        return speedMove;
    }

    public double getWeight() {
        return weight;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setReadyReproduce(boolean readyReproduce) {
        this.readyReproduce = readyReproduce;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
