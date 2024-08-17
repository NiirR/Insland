package org.example.Animals;

import org.example.Herbivore;

public class Buffalo extends Herbivore {

    public Buffalo(int x , int y){
        name = "Buffalo";
        setWeight(700);
        maxWeight = 800;
        speedMove = 3;
        setAge(0);
        maxLimit = 10;
        icon = "\uD83D\uDC03";
    }
}
