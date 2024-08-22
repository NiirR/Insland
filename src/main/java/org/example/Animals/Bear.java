package org.example.Animals;

import org.example.Predator;

public class Bear extends Predator {

    public Bear(int x , int y){
        name = "Bear";
        setWeight(500);
        maxWeight = 580;
        speedMove = 2;
        setAge(0);
        maxLimit = 5;
    }
}
