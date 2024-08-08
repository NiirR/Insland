package org.example;

public class Rabbit extends Herbivore{
    public Rabbit(int x ,int y){
        setWeight(2);
        speedMove = 3;
        setX((int) (Math.random() * 20 +1));
        setY((int) (Math.random() * 20 +1));

    }
}
