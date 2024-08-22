package org.example.Animals;

import org.example.Predator;

public class Snake extends Predator {

    public Snake(int x ,int y){
        name = "Snake";
        setWeight(15);
        maxWeight = 18;
        speedMove = 1;
        setAge(0);
        maxLimit = 30;
    }
}
