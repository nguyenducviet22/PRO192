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
    private int seniority;

    public Employee() {
    }

    public Employee(int id, String name, double salary, int seniority) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.seniority = seniority;
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

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        if (seniority <= 0) {
            this.seniority = 1;
        } else {
            this.seniority = seniority;
        }
    }

    public void updateSalary() {
        if (seniority >= 3 && seniority <= 5) {
            setSalary(this.salary * 1.3);
        } else if (seniority >= 6 && seniority <= 10) {
            setSalary(this.salary * 1.5);
        } else {
            setSalary(this.salary * 2);
        }
    }

    @Override
    public String toString() {
        return String.format("%d,%s,%.2f,%d", id, name, salary, seniority);
    }

}
