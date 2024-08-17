package org.example.Animals;

import org.example.Herbivore;

public class Horse extends Herbivore {

    public Horse(int x , int y){
        name = "Horse";
        setWeight(400);
        maxWeight = 460;
        speedMove = 4;
        setAge(0);
        maxLimit = 20;
        icon = "\uD83D\uDC0E";
    }
}
