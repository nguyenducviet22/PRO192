/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package one;

/**
 *
 * @author NGUYEN DUC VIET
 */
public class Bird {
    protected static int k = 0;
    public Bird() {
        k++;
    }
    protected void fly(){}
    static int getValue(){
        return(k);
    }
}
