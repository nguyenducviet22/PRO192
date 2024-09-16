package main;

import data.*;
import java.util.Random;

public class Interface {

    public static void main(String[] args) {
        runRace();
    }

    public static void runRace() {
        Race one = new Race() {
            public static final double MAX_SPEED = 70;
            
            public double swim(){
                return new Random().nextDouble() * MAX_SPEED;
            }
            
            @Override
            public double runToRace() {
                return swim() * 3;
            }

            @Override
            public void showRecordOfRace() {
                System.out.printf("|%-10s|%-10s|%-5s|%-5s|%5.1f|%5.1f|\n",
                "One Race", " ", " ", " ", swim(), runToRace());
            }

        };
        Dog dog = new Dog("Dog1", 2022, 10);
        Pet dogP = new Dog("Dog2", 2023, 5);
        Race dogR = new Dog("Dog3", 2024, 7);

        Motor motor = new Motor("Motor1", "61-F1");
        Race motorR = new Motor("Motor2", "62-L2");

        Race race[] = {dog, (Dog) dogP, dogR, motor, motorR, one};

        for (Race race1 : race) {
            race1.showRecordOfRace();
        }
    }

}
