package org.example.entity.animals;

import org.example.entity.Herbivore;

public class Deer extends Herbivore {

    public Deer(int x , int y){
        setName("Deer");
        setWeight(300);
        maxWeight = 350;
        speedMove = 4;
        setAge(0);
        maxLimit = 20;
    }
}
