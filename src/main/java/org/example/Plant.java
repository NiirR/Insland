package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Plant {
    int x;
    int y;
    private final int weight ;
    int maxLimit = 200;

    public Plant(int x , int y){
        weight = 1;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWeight() {
        return weight;
    }
}
