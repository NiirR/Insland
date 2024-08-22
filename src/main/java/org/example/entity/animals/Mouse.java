package org.example.entity.animals;

import org.example.entity.Herbivore;

public class Mouse extends Herbivore {

    public Mouse(int x , int y){
        setName("Mouse");
        setWeight(0.05);
        maxWeight = 0.06;
        speedMove = 1;
        setAge(0);
        maxLimit = 500;
    }
}
