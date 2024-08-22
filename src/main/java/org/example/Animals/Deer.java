package org.example.Animals;

import org.example.Herbivore;

public class Deer extends Herbivore {

    public Deer(int x , int y){
        name = "Deer";
        setWeight(300);
        maxWeight = 350;
        speedMove = 4;
        setAge(0);
        maxLimit = 20;
    }
}
