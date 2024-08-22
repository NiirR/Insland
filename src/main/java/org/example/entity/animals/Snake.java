package org.example.entity.animals;

import org.example.entity.Predator;

public class Snake extends Predator {

    public Snake(int x ,int y){
        setName("Snake");
        setWeight(15);
        maxWeight = 18;
        speedMove = 1;
        setAge(0);
        maxLimit = 30;
    }
}
