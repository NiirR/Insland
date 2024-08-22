package org.example.entity.animals;

import org.example.entity.Herbivore;

public class Sheep extends Herbivore {

    public Sheep(int x , int y){
        setName( "Sheep");
        setWeight(70);
        maxWeight = 85;
        speedMove = 3;
        setAge(0);
        maxLimit = 140;
    }
}
