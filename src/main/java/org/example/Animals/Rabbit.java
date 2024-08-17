package org.example.Animals;

import org.example.Herbivore;

public class Rabbit extends Herbivore {

    public Rabbit(int x ,int y){
        name = "Rabbit";
        setWeight(2);
        maxWeight = 2.45;
        speedMove = 3;
        setAge(0);
        maxLimit = 150;
        icon = "\uD83D\uDC07";
    }
}
