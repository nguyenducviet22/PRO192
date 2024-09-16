package data;

import java.util.Random;

public class Motor implements Race {
    public static final double MAX_SPEED = 150;
    private String name;
    private String licensePlate;

    public Motor(String name, String licensePlate) {
        this.name = name;
        this.licensePlate = licensePlate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public String toString() {
        return "Motor{" + "name=" + name + ", licensePlate=" + licensePlate + '}';
    }
    
    public double run() {
        return new Random().nextDouble() * MAX_SPEED;
    }
    
    public void showRecord() {
        System.out.printf("|%-10s|%-10s|%-10s|%5.1f|\n",
                "Motor", name, licensePlate, run());
    }

    @Override
    public double runToRace() {
        return run() * 2;
    }

    @Override
    public void showRecordOfRace() {
        System.out.printf("|%-10s|%-10s|%-5s|  -  |%5.1f|%5.1f|\n",
                "Motor Race", name, licensePlate, run(), runToRace());
    }
}
