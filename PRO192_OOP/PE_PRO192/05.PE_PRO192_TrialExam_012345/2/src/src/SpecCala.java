/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NGUYEN DUC VIET
 */
public class SpecCala extends Cala{
    private int color;

    public SpecCala() {
    }

    public SpecCala(int color, String owner, int price) {
        super(owner, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + color;
    }

    public void setData() {
        String rs = "";
        char c[] = super.getOwner().toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (i == 1) {
                rs += "XX";
            } else {
                rs += c[i];
            }
        }
//        rs = super.getOwner().substring(0, 1) + "XX" + super.getOwner().substring(2);
        super.setOwner(rs);
    }
    
    public int getValue() {
        if (color %2 != 0) return super.getPrice()+3;
        return super.getPrice()+7;
    }
}
