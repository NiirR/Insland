package org.example;


public class Hunting{

    public static int hunt(Animal hunter , Animal prey){
        int chance = 0;
        if (hunter.name.equals("Wolf")){
            chance = switch (prey.name) {
                case "Rabbit", "Goat" -> 60;
                case "Boar", "Deer" -> 15;
                case "Buffalo", "Horse" -> 10;
                case "Duck" -> 40;
                case "Mouse" -> 80;
                case "Sheep" -> 70;
                default -> chance;
            };
        }

        if (hunter.name.equals("Snake")){
            chance = switch (prey.name) {
                case "Fox" -> 15;
                case "Rabbit" -> 20;
                case "Duck" -> 10;
                case "Mouse" -> 40;
                default -> chance;
            };
        }

        if (hunter.name.equals("Fox")){
            chance = switch (prey.name) {
                case "Rabbit" -> 70;
                case "Duck" -> 60;
                case "Caterpillar" -> 40;
                case "Mouse" -> 90;
                default -> chance;
            };
        }

        if (hunter.name.equals("Bear")){
            chance = switch (prey.name) {
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

        if (hunter.name.equals("Eagle")){
            chance = switch (prey.name) {
                case "Duck" -> 80;
                case "Mouse", "Rabbit" -> 90;
                case "Fox" -> 10;
                default -> chance;
            };
        }

        if (hunter.name.equals("Boar")){
            chance = switch (prey.name) {
                case "Caterpillar" -> 60;
                case "Mouse"-> 50;
                default -> chance;
            };
        }

        if (hunter.name.equals("Mouse")){
            if(prey.name.equals("Caterpillar")) chance = 60;
        }

        if (hunter.name.equals("Duck")){
            if(prey.name.equals("Caterpillar")) chance = 60;
        }



        return chance;
    }
}
