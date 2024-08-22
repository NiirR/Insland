package org.example.entity.animals;

import org.example.entity.Herbivore;

public class Horse extends Herbivore {

    public Horse(int x , int y){
        setName("Horse");
        setWeight(400);
        maxWeight = 460;
        speedMove = 4;
        setAge(0);
        maxLimit = 20;
    }
}
