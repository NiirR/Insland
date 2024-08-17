package org.example;


import java.util.*;

import static java.nio.file.Files.move;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.spawn();


        while (true) {
            try {
                for (Animal animal : controller.getAnimals()) animal.move(animal);

                controller.temp = new ArrayList<>(controller.getAnimals());
                for (Animal animal : controller.temp) animal.eat(controller.getAnimals());

                controller.temp = new ArrayList<>(controller.getAnimals());
                for (Animal animal : controller.temp) animal.reproduce(controller.getAnimals());

                controller.nextTurn();
                controller.animalPrint();

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }
    }
