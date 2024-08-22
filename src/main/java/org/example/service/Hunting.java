package org.example.service;


import org.example.entity.Animal;


public class Hunting{

    public static int hunt(Animal hunter , Animal prey){
        int chance = 0;
        if (hunter.getName().equals("Wolf")){
            chance = switch (prey.getName()) {
                case "Rabbit", "Goat" -> 60;
                case "Boar", "Deer" -> 15;
                case "Buffalo", "Horse" -> 10;
                case "Duck" -> 40;
                case "Mouse" -> 80;
                case "Sheep" -> 70;
                default -> chance;
            };
        }

        if (hunter.getName().equals("Snake")){
            chance = switch (prey.getName()) {
                case "Fox" -> 15;
                case "Rabbit" -> 20;
                case "Duck" -> 10;
                case "Mouse" -> 40;
                default -> chance;
            };
        }

        if (hunter.getName().equals("Fox")){
            chance = switch (prey.getName()) {
                case "Rabbit" -> 70;
                case "Duck" -> 60;
                case "Caterpillar" -> 40;
                case "Mouse" -> 90;
                default -> chance;
            };
        }

        if (hunter.getName().equals("Bear")){
            chance = switch (prey.getName()) {
                case "Deer", "Rabbit" , "Snake" -> 80;
                case "Horse" -> 40;
                case "Buffalo" -> 20;
                case "Duck" -> 10;
                case "Mouse" -> 90;
                case "Sheep" , "Goat" -> 70;
                case "Boar" -> 50;
                default -> chance;
            };
        }

        if (hunter.getName().equals("Eagle")){
            chance = switch (prey.getName()) {
                case "Duck" -> 80;
                case "Mouse", "Rabbit" -> 90;
                case "Fox" -> 10;
                default -> chance;
            };
        }

        if (hunter.getName().equals("Boar")){
            chance = switch (prey.getName()) {
                case "Caterpillar" -> 60;
                case "Mouse"-> 50;
                default -> chance;
            };
        }

        if (hunter.getName().equals("Mouse")){
            if(prey.getName().equals("Caterpillar")) chance = 60;
        }

        if (hunter.getName().equals("Duck")){
            if(prey.getName().equals("Caterpillar")) chance = 60;
        }



        return chance;
    }
}
