package org.example.entity.animals;

import org.example.entity.Herbivore;

public class Caterpillar extends Herbivore {

    public Caterpillar(int x , int y){
        setName("Caterpillar");
        setWeight(0.01);
        speedMove = 0;
        setAge(0);
        maxLimit = 1000;
    }
}
