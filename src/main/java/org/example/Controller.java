package org.example;

import java.util.ArrayList;
import java.util.List;




public class Controller {
    public static final int WIDTH = 20;
    public static final int HEIGHT = 20;
    Animal animal;

    private List<Animal> predatorList = new ArrayList<>();
    private List<Animal> herbivoreList = new ArrayList<>();

    public Controller(){
    }


    public void spawn(){
        for (int i = 0; i < 200 ; i++) {
            int rA = (int) (Math.random() * 2);
            int rx = ((int) (Math.random() * 20 +1));
            int ry = ((int) (Math.random() * 20 +1));
            if(rA == 0){
                animal = new Wolf(rx , ry);
                getPredatorList().add(animal);
            }
            else {
                animal = new Rabbit(rx , ry);
               getHerbivoreList().add(animal);

            }
        }
    }


public  void animalPrint(){
   for (Animal animal : getPredatorList()){
       System.out.print(animal.getX() + " " + animal.getY() + " ");
       if (animal instanceof Wolf) System.out.println("Волк");
   }
    for (Animal animal : getHerbivoreList()){
        System.out.print(animal.getX() + " " + animal.getY() + " ");
        if (animal instanceof Rabbit) System.out.println("Кролик");
    }
}

    public List<Animal> getPredatorList() {
        return predatorList;
    }

    public void setPredatorList(List<Animal> predatorList) {
        this.predatorList = predatorList;
    }

    public List<Animal> getHerbivoreList() {
        return herbivoreList;
    }

    public void setHerbivoreList(List<Animal> herbivoreList) {
        this.herbivoreList = herbivoreList;
    }
}
