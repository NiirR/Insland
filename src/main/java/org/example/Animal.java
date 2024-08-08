package org.example;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Animal {

    public ImageIcon icon;
    private int weight;
    static int speedMove;
    private  int x;
    private  int y;
    protected boolean readyReproduce;

    public void eat(List<Animal> herbivore) {
        Iterator<Animal> animalIterator = herbivore.iterator();
        while (animalIterator.hasNext()) {
            Animal animal = animalIterator.next();
            if (this.getX() == animal.getX() && this.getY() == animal.getY()) {
                if (animal instanceof Rabbit) {
                    this.setWeight(this.getWeight() + animal.getWeight());
                    System.out.println("Волк сьел зайца!");
                    System.out.println(this.getWeight());
                    animalIterator.remove();
                    System.out.println(herbivore.size());
                    break;
                }
            }
        }
    }



    public void reproduce(List<Animal> animals){
      if(animals.stream().filter(x -> x.getClass().getName().equals(this.getClass().getName())).filter(x -> x.getX() == this.getX()).filter(x -> x.getY() == this.getY()).count() > 0) {
          animals.add(new Wolf(this.getX(), this.getY()));
          System.out.println("Родился волк");

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

    public int getWeight() {
        return weight;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setReadyReproduce(boolean readyReproduce) {
        this.readyReproduce = readyReproduce;
    }

}
