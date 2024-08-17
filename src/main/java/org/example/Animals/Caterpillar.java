package org.example.Animals;

import org.example.Herbivore;

public class Caterpillar extends Herbivore {

    public Caterpillar(int x , int y){
        name = "Caterpillar";
        setWeight(0.01);
        speedMove = 0;
        setAge(0);
        maxLimit = 1000;
        icon = "\uD83D\uDC1B";
    }
}
