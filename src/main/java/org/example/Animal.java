package org.example;

import javax.swing.*;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public abstract class Animal {
    private int age;
    public ImageIcon icon;
    private double weight;
    static int speedMove;
    private  int x;
    private  int y;
    protected boolean readyReproduce;


    public void eat(List<Animal> animals) {
        Iterator<Animal> animalIterator = animals.iterator();
        while (animalIterator.hasNext()) {
            Animal animal = animalIterator.next();
            if (this.getX() == animal.getX() && this.getY() == animal.getY()) {
                if (animal instanceof Rabbit && this instanceof Predator) {
                    this.setWeight(this.getWeight() + animal.getWeight());
                    System.out.println("Волк сьел зайца!");
                    System.out.println(this.getWeight());
                    animalIterator.remove();
                    System.out.println(animals.size());
                    break;
                }
            }
        }
    }



    public void reproduce(List<Animal> animals){
        ListIterator<Animal> listIterator = animals.listIterator();
        int success = (int) (Math.random() * 5);
        while (listIterator.hasNext()){
            Animal animal = listIterator.next();
            if(this.readyReproduce && animal.readyReproduce )
            if(this.getClass().getName().equals(animal.getClass().getName()) && this != animal){
                if(this.getX() == animal.getX() && this.getY() == animal.getY() && success > 3){
                    listIterator.add(new Wolf(this.getX() , this.getY()));
                    this.setReadyReproduce(false);
                    animal.setReadyReproduce(false);
                    System.out.println("В " + animals.stream().filter(x -> x instanceof Wolf).count());
                    System.out.println("З " + animals.stream().filter(x -> x instanceof Rabbit).count());
                    break;
                }
            }
        }
    }



    public void move(Animal animal){
        int move = (int) (Math.random()* (animal.getSpeedMove() +1));
        int directions = (int) (Math.random() * 4);
        if(directions == 0 && animal.getX() - move >= 0) setX(animal.getX() - move);
        else if(directions == 0 && animal.getX() - move < 0) setX(0);
        else if(directions == 1 && animal.getY() + move <= 20) setY(animal.getY() + move);
        else if (directions == 1 && animal.getY() + move > 20) setY(20);
        else if(directions == 2 && animal.getX() + move <= 20) setX(animal.getX() + move);
        else if (directions == 2 && animal.getX() + move > 20) setX(20);
        else if (directions == 3 && animal.getY() - move >= 0) setY(animal.getY() -move);
        else if (directions == 3 && animal.getY() - move < 0) setY(0);

    //    System.out.println(animal.getX() + " " + animal.getY());

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
