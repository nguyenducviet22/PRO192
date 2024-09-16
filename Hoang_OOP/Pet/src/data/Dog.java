package data;

import java.util.Random;

public class Dog extends Pet {

    public static final double MAX_SPEED = 50;

    public Dog(String name, int yob, double weight) {
        super(name, yob, weight);
    }

    @Override
    public double run() {
//        Random r = new Random();
        return new Random().nextDouble() * MAX_SPEED;
    }

    @Override
    public void showRecord() {
        System.out.printf("|%-10s|%-10s|%4d|%2.1f|%2.2f|\n",
                            "Dog", name, yob, weight, run());
    }

}
