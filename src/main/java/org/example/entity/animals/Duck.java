package org.example.entity.animals;

import org.example.entity.Herbivore;

public class Duck extends Herbivore {

    public Duck(int x , int y){
        setName("Duck");
        setWeight(1);
        maxWeight = 1.15;
        speedMove = 4;
        setAge(0);
        maxLimit = 200;
    }
}
