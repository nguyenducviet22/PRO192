/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NGUYEN DUC VIET
 */
public class Wood {
    private String source;
    private int year;

    public Wood() {
    }

    public Wood(String source, int year) {
        this.source = source;
        this.year = year;
    }

    public String getSource() {
        char c[] = source.toCharArray();
        String str = "";
        for (int i = 0; i < source.length()-1; i++) {
            str += c[i];
        }
        return str;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year - getYear();
    }
    
    
}
