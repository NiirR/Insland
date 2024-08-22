package org.example.entity.animals;

import org.example.entity.Predator;

public class Eagle extends Predator {

    public Eagle(int x , int y){
        setName("Eagle");
        setWeight(6);
        maxWeight = 7;
        speedMove = 3;
        setAge(0);
        maxLimit = 20;
    }
}
