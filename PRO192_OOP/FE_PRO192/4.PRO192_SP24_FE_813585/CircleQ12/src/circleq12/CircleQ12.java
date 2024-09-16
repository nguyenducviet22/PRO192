/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circleq12;

/**
 *
 * @author NGUYEN DUC VIET
 */
abstract class Shape {
    int x, y;
    public abstract void draw();
    public void setAnch(int x, int y){
        this.x = x;
        this.y = y;
    }
}
public class CircleQ12 extends Shape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shape s1 = new CircleQ12();
        s1.setAnch(10, 10);
        s1.draw();
    }

    @Override
    public void draw() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
