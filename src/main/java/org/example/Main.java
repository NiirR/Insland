package org.example;


import java.util.*;

import static java.nio.file.Files.move;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.spawn();
        controller.animalPrint();

        while (true) {
            try {
                for (Animal animal : controller.getPredatorList()) animal.move(animal);
                for (Animal animal : controller.getHerbivoreList()) animal.move(animal);
                for (Animal animal : controller.getPredatorList()) animal.eat(controller.getHerbivoreList());
                for (Animal animal : controller.getPredatorList()) animal.reproduce(controller.getPredatorList());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }
    }
