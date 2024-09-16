/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NGUYEN DUC VIET
 */
public class Lake {
    private String name;
    private String address;
    private double area;

    public Lake() {
    }

    public Lake(String name, String address, double area) {
        this.name = name;
        this.address = address;
        this.area = area;
    }

    public String getName() {
        return name.toUpperCase();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%.2f", getName(), getAddress(), getArea());
    }
    
    
}
