package pet;

import data.Cat;
import data.Dog;
import data.Pet;
import java.util.Random;

public class main {

    public static void main(String[] args) {
        showRecord();
    }

    public static void showRecord() {

        Pet ufo = new Pet("UFO", 0000, 100) {
            @Override
            public double run() {
                return new Random().nextDouble() * 100;
            }

            @Override
            public void showRecord() {
                System.out.printf("|%-10s|%-10s|%4d|%2.1f|%2.2f|\n",
                        "UFO", name, yob, weight, run());
            }
        };
        Dog dog = new Dog("Lulu", 2023, 1.5);
        Pet dogP = new Dog("Dodo", 2023, 2);
        Cat cat = new Cat("Mimi", 2022, 1);
        Pet catP = new Cat("Lala", 2022, 1.2);

        Pet pet[] = new Pet[]{new Dog("Fafa", 2022, 1.7),
            dog, dogP, cat, catP, ufo};
//        pet[0] = new Dog("Fafa", 2022, 1.7);
        for (Pet p : pet) {
            p.showRecord();

        }
    }

}
