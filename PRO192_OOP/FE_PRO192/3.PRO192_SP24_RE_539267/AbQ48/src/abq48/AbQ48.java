/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abq48;

/**
 *
 * @author NGUYEN DUC VIET
 */
class Base{
    protected int i = 99;
}
public class AbQ48 {

    private int i = 1;
    public static void main(String[] args) {
        AbQ48 a = new AbQ48();
        a.hallow();
    }
    
//    abstract void hallow(){ // cannot abstract Class
    void hallow(){
        System.out.println("Hello " + i);
    }
}
