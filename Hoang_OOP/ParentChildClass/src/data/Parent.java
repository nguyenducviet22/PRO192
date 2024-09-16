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
public class Parent {
    protected String asset;
    protected double money;

    public Parent(String asset, double money) {
        this.asset = asset;
        this.money = money;
    }

    public String getAsset() {
        return asset;
    }

    public void setAsset(String asset) {
        this.asset = asset;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Parent{" + "asset=" + asset + ", money=" + money + '}';
    }
    
    public void showProfile(){
        System.out.println("Parents have " + asset + " and $" + money);
    }
}
