/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NGUYEN DUC VIET
 */
public class Professor extends Worker {

    private int tenure;

    public Professor() {
    }

    public Professor(int tenure, int numOfChild, String name, int age) {
        super(name, age, numOfChild);
        this.tenure = tenure;
    }

    @Override
    public double getGrossIncome() {
        if (tenure >= 1 && tenure <= 3){
            return 3000;
        } else {
            return 5000;
        }
    }

    @Override
    public double getTax(double salary) {
        int deduction = getNumOfChild()*900;
        double income = salary - deduction;
        double tax;
        if (income < 0){
            return 0;
        } else if (income <= 1000){
            return tax = 0.1*income;
        } else {
            return tax = 0.2*income;
        }
    }

    @Override
    public String toString() {
        return String.format("%s, %d, %d, %d", getName(), getAge(), getNumOfChild(), tenure);
    }
    
    

}
