/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author NGUYEN DUC VIET
 */
public class Child extends Parent {
    private String car;
    
//    public Child(String asset, double money) {
//        super(asset, money);
//    }

    public Child(String asset, double money, String car) {
        super(asset, money);
        this.car = car;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }
    
    
    @Override
    public void showProfile(){
        System.out.println("Child has " + asset + ", $" + money + " and " + car);
    }
    
    public void sayHi(){
        System.out.println("Hello from Child");
    }
    
}
