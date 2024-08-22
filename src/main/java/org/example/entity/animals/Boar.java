package org.example.entity.animals;

import org.example.entity.Herbivore;

public class Boar extends Herbivore {

    public Boar(int x , int y){
        setName("Boar");
        setWeight(400);
        maxWeight = 450;
        speedMove = 2;
        setAge(0);
        maxLimit = 50;
    }
}
