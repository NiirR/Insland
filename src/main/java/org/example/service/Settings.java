package org.example.service;

public final class Settings {
    public Settings settings = new Settings();

    private Settings(){
    }

    public Settings getInstance(){
        return settings;
    }

    public static final int HEIGHT = 20;
    public static final int WIDTH = 20;

    public static final double DECREASE_WEIGHT_IN_TURN = 0.9;
    public static final int AGE_OF_DEAD = 12;
    public static final int CHANCE_OF_REPRODUCTION = 20;

    public static final int quantityBear = 50;
    public static final int quantityBoar = 300;
    public static final int quantityBuffalo = 100;
    public static final int quantityCaterpillar = 10000;
    public static final int quantityDeer = 200;
    public static final int quantityDuck = 1500;
    public static final int quantityEagle = 200;
    public static final int quantityFox = 300;
    public static final int quantityGoat = 1000;
    public static final int quantityHorse = 200;
    public static final int quantityMouse = 2000;
    public static final int quantityRabbit = 3500;
    public static final int quantitySheep = 1000;
    public static final int quantitySnake = 300;
    public static final int quantityWolf = 200;
    public static final int quantityPlant = 10000;
}
