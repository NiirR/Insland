package org.example.entity.animals;

import org.example.entity.Predator;

public class Fox extends Predator {

    public Fox(int x , int y){
        setName("Fox");
        setWeight(8);
        maxWeight = 10;
        speedMove = 2;
        setAge(0);
        maxLimit = 30;
    }
}
