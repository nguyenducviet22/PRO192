/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NGUYEN DUC VIET
 */
public class SpecTaxi extends Taxi{
    private int salary;

    public SpecTaxi() {
    }

    public SpecTaxi(String driver, int age, int salary) {
        super(driver, age);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + salary;
    }
    
    public void setData(){
//        super.getDriver().charAt(1) = super.getAge();
        String str = "";
        str += super.getDriver().charAt(0);
        str += super.getAge();
        str += super.getDriver().substring(2);
        super.setDriver(str);
    }
    
    public int getValue(){
        int age = super.getAge();
        if (age %2 == 0)
            return salary;
        return salary + age;
    }
}
