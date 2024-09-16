/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NGUYEN DUC VIET
 */
public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee() {
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public int getNameLength(){
        int count = 0;
        char[] chars = name.toCharArray();
        for (char c : chars) {
            count++;
        }
        return count;
    }
    
    public double getNetSalary(){
        double salary = this.salary*0.9;
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%d, %s, %.2f", id, name, salary);
    }
    
    
}
