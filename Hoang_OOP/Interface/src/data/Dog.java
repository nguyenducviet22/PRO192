package data;

import java.util.Random;

public class Dog extends Pet implements Race {

    public static final double MAX_SPEED = 50;

    public Dog(String name, int yob, double weight) {
        super(name, yob, weight);
    }
    
    //Extends from Pet Class (super Class)
    @Override
    public double run() {
        return new Random().nextDouble() * MAX_SPEED;
    }

    @Override
    public void showRecord() {
        System.out.printf("|%-10s|%-10s|%4d|%2.1f|%2.2f|\n",
                "Dog", name, yob, weight, run());
    }
    
    //Implement from Race Interface
    @Override
    public double runToRace() {
        return run() * 3;
    }

    @Override
    public void showRecordOfRace() {
        System.out.printf("|%-10s|%-10s|%5d|%5.1f|%5.1f|%5.1f|\n",
                "Dog Race", name, yob, weight, run(), runToRace());
    }

}
