package org.example;


import org.example.entity.Animal;
import org.example.service.Service;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(4);
        Service service = new Service();
        service.spawn();

        Thread thread1 = new Thread(() -> {
            while (true){
                for (int i = 0; i < 3000; i++) {
                    service.spawnPlant();
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread1.start();

        executor.execute(()->{
            while (true) {
                for (Animal animal : service.getAnimals()) animal.move(animal);

                service.temp = new ArrayList<>(service.getAnimals());
                service.tempPlant = new ArrayList<>(service.getPlants());
                for (Animal animal : service.temp) animal.eat(service.getAnimals(), service.tempPlant);
                service.setPlants(service.tempPlant);

                service.temp = new ArrayList<>(service.getAnimals());
                for (Animal animal : service.temp) animal.reproduce(service.getAnimals());

                service.nextTurn();
                service.animalPrint();

            }
        });



    }
    }
