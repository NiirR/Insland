package org.example.entity;

public class Plant {
    int x;
    int y;
    private final int weight ;

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
