package org.example.Animals;

import org.example.Herbivore;

public class Sheep extends Herbivore {

    public Sheep(int x , int y){
        name = "Sheep";
        setWeight(70);
        maxWeight = 85;
        speedMove = 3;
        setAge(0);
        maxLimit = 140;
    }
}
