/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NGUYEN DUC VIET
 */
public class Medicine {

    private String name;
    private String indication;
    private int expirationYear;

    public Medicine() {
    }

    public Medicine(String name, String indication, int expirationYear) {
        this.name = name;
        this.indication = indication;
        this.expirationYear = expirationYear;
    }

    public String getName() {
        return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIndication() {
        return indication.substring(0, 1).toUpperCase() + indication.substring(1).toLowerCase();
    }

    public void setIndication(String indication) {
        this.indication = indication;
    }

    public int getExpirationYear() {
        return expirationYear;
    }

    public void setExpirationYear(int expirationYear) {
        this.expirationYear = expirationYear;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %d", getName(), getIndication(), getExpirationYear()); //To change body of generated methods, choose Tools | Templates.
    }

}
