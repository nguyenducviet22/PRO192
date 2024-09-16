/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package money_q41;

/**
 *
 * @author NGUYEN DUC VIET
 */
public class Money {

//    protected String country, name;
    private String country, name;

    public String getCountry() {
        return country;
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }
}

class Yen extends Money {

    public String getCountry() {
        return super.country;//country is declared as private, must use getCountry()
    }
}

class Euro extends Money {

    public String getCountry(String timeZone) {
        return super.getCountry();
    }
}
