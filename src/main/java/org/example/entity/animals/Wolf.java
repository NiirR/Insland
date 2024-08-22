package org.example.entity.animals;

import org.example.entity.Predator;

public class Wolf extends Predator {

    public Wolf(int x , int y){
        setName("Wolf");
        setWeight(50);
        maxWeight = 58;
        speedMove = 3;
        setAge(0);
        maxLimit = 30;
    }

}
