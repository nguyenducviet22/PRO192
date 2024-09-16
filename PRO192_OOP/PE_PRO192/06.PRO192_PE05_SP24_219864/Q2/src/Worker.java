/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NGUYEN DUC VIET
 */
public abstract class Worker {

    protected String name;
    protected int age;
    protected int numOfChild;

    public Worker() {
    }

    public Worker(String name, int age, int numOfChild) {
        this.name = name;
        this.age = age;
        this.numOfChild = numOfChild;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumOfChild() {
        return numOfChild;
    }

    public void setNumOfChild(int numOfChild) {
        this.numOfChild = numOfChild;
    }

    public abstract double getGrossIncome();

    public abstract double getTax(double salary);
}
