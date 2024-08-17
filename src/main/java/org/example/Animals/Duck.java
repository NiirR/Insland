package org.example.Animals;

import org.example.Herbivore;

public class Duck extends Herbivore {

    public Duck(int x , int y){
        name = "Duck";
        setWeight(1);
        maxWeight = 1.15;
        speedMove = 4;
        setAge(0);
        maxLimit = 200;
        icon = "\uD83E\uDD86";
    }
}
