/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NGUYEN DUC VIET
 */
public class UsedCarV extends CarV {

    private double numberOfYears;

    public UsedCarV() {
    }

    public UsedCarV(double numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public double getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(double numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    @Override
    public String toString() {
        calculatePrice();
        calculateWarrantyPeriod();
        return String.format("%.1f,%.1f", getPrice(), getWarrantyPeriod());
    }

    public void calculatePrice() {
        if (numberOfYears <= 9) {
            double price = getPrice() - (numberOfYears * 0.1) * getPrice();
            setPrice(price);
        }
    }

    public void calculateWarrantyPeriod() {
        if (numberOfYears <= 5) {
            double warrantyPeriod = getWarrantyPeriod() - (numberOfYears * 0.2) * getWarrantyPeriod();
            setWarrantyPeriod(warrantyPeriod);
        }
    }
}
