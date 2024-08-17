package org.example.Animals;

import org.example.Herbivore;

public class Boar extends Herbivore {

    public Boar(int x , int y){
        name = "Boar";
        setWeight(400);
        maxWeight = 450;
        speedMove = 2;
        setAge(0);
        maxLimit = 50;
        icon = "\uD83D\uDC17";
    }
}
