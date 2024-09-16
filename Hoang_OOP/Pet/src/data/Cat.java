package data;

import java.util.Random;

public class Cat extends Pet {

    public static final double MAX_SPEED = 40;

    public Cat(String name, int yob, double weight) {
        super(name, yob, weight);
    }

    @Override
    public double run() {
        return new Random().nextDouble() * MAX_SPEED;
    }

    @Override
    public void showRecord() {
        System.out.printf("|%-10s|%-10s|%4d|%2.1f|%2.2f|\n",
                            "Cat", name, yob, weight, run());
    }

}
