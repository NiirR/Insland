package org.example.entity.animals;

import org.example.entity.Herbivore;

public class Rabbit extends Herbivore {

    public Rabbit(int x ,int y){
        setName("Rabbit");
        setWeight(2);
        maxWeight = 2.45;
        speedMove = 3;
        setAge(0);
        maxLimit = 150;
    }
}
