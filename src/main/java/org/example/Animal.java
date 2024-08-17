package org.example;

import org.example.Animals.Rabbit;
import org.example.Animals.Wolf;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Animal {
    protected String name;
    private int age;
    protected static String icon;
    private double weight;
    protected double maxWeight;
    protected static int speedMove;
    protected static int maxLimit;
    private  int x;
    private  int y;
    protected boolean readyReproduce = false;


    public void eat(List<Animal> animals) {
        Iterator<Animal> animalIterator = animals.iterator();
        while (animalIterator.hasNext()) {
            Animal animal = animalIterator.next();
            if (this.getX() == animal.getX() && this.getY() == animal.getY()) {
                if (animal instanceof Rabbit && this instanceof Predator) {
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
                        case "Wolf": listIterator.add(new Wolf(this.getX(), this.getY()));
                        case "Rabbit": listIterator.add(new Rabbit(this.getX(), this.getY()));
                        case "Bear": listIterator.add(new Rabbit(this.getX(), this.getY()));
                        case "Boar": listIterator.add(new Rabbit(this.getX(), this.getY()));
                        case "Buffalo": listIterator.add(new Rabbit(this.getX(), this.getY()));
                        case "Caterpillar": listIterator.add(new Rabbit(this.getX(), this.getY()));
                        case "Deer": listIterator.add(new Rabbit(this.getX(), this.getY()));
                        case "Duck": listIterator.add(new Rabbit(this.getX(), this.getY()));
                        case "Eagle": listIterator.add(new Rabbit(this.getX(), this.getY()));
                        case "Fox": listIterator.add(new Rabbit(this.getX(), this.getY()));
                        case "Goat": listIterator.add(new Rabbit(this.getX(), this.getY()));
                        case "Horse": listIterator.add(new Rabbit(this.getX(), this.getY()));
                        case "Mouse": listIterator.add(new Rabbit(this.getX(), this.getY()));
                        case "Sheep": listIterator.add(new Rabbit(this.getX(), this.getY()));
                        case "Snake": listIterator.add(new Rabbit(this.getX(), this.getY()));
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
