package org.example.entity.animals;

import org.example.entity.Herbivore;

public class Buffalo extends Herbivore {

    public Buffalo(int x , int y){
        setName("Buffalo");
        setWeight(700);
        maxWeight = 800;
        speedMove = 3;
        setAge(0);
        maxLimit = 10;
    }
}
