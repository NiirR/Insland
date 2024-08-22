package org.example.entity.animals;

import org.example.entity.Herbivore;

public class Goat extends Herbivore {

    public Goat(int x , int y){
        setName("Goat");
        setWeight(60);
        maxWeight = 70;
        speedMove = 3;
        setAge(0);
        maxLimit = 140;
    }
}
