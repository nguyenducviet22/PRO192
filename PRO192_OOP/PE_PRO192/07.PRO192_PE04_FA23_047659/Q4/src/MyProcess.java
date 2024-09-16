/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NGUYEN DUC VIET
 */
public class MyProcess implements IProcess {

    @Override
    public String getReverseString(String string) {
        char[] chars = string.toCharArray();
        String rs = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            rs += chars[i];
        }
        return rs;
    }

    @Override
    public int countDigitsInString(String string) {
        char[] chars = string.toCharArray();
        int count = 0;
        for (char c : chars) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }

}
