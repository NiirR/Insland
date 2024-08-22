package org.example.Animals;

import org.example.Herbivore;

public class Goat extends Herbivore {

    public Goat(int x , int y){
        name = "Goat";
        setWeight(60);
        maxWeight = 70;
        speedMove = 3;
        setAge(0);
        maxLimit = 140;
    }
}
