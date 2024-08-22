package org.example.entity.animals;

import org.example.entity.Predator;

public class Bear extends Predator {

    public Bear(int x , int y){
        setName("Bear");
        setWeight(500);
        maxWeight = 580;
        speedMove = 2;
        setAge(0);
        maxLimit = 5;
    }
}
