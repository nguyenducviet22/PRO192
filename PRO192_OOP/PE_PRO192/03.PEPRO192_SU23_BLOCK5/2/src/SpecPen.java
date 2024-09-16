/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NGUYEN DUC VIET
 */
public class SpecPen extends Pen {

    private int price;

    public SpecPen() {
    }

    public SpecPen(String name, String color, int price) {
        super(name, color);
        this.price = price;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + price;
    }

    public void setData() {
        setName(super.getName() + price);
    }

    public int getValue() {
        char[] chars = super.getColor().toCharArray();
        for (char c : chars) {
            if (c == 'y' || c == 'o' || c == 'Y' || c == 'O') {
                return price;
            }
        }
        return price * 2;
    }
}
