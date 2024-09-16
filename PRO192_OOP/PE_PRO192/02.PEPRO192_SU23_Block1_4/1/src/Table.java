/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NGUYEN DUC VIET
 */
public class Table {
    private String name;
    private int leg;

    public Table() {
    }

    public Table(String name, int leg) {
        this.name = name;
        this.leg = leg;
    }

    public String getName() {
        String str = "";
        str += name.charAt(name.length()-3);
//        str += Character.toLowerCase(name.charAt(name.length()-2));
        str += name.substring(name.length()-2, name.length()-1).toLowerCase();
        str += name.charAt(name.length()-1);
        return str;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }
    
    
}
