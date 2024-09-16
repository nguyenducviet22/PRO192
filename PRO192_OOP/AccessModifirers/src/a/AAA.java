/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a;

/**
 *
 * @author NGUYEN DUC VIET
 */
public class AAA extends AA{
    public void print(){
        AA aa = new AA();
//        System.out.println("aa = " + aa.a); PRIVATE
        System.out.println("aa = " + aa.b); //PROTECTED
    }
}
