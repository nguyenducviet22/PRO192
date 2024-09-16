/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NGUYEN DUC VIET
 */
public class MyString implements IString {

    @Override
    public int f1(String string) { //a a1 2b cd 1 12 b
        int count = 0;
        String words[] = string.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            char c[] = words[i].toCharArray();
            for (int j = 0; j < c.length; j++) {
                if (Character.isLetter(c[j])) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    @Override
    public String f2(String string) {
        String words[] = string.split("\\s+");
        String rs = "";
        for (int i = 0; i < words.length-1; i++) {
            rs += words[i] + " ";
        }
        return rs.trim();
    }

}
