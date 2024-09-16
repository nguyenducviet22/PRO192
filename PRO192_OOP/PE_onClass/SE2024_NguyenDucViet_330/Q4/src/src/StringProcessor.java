/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NGUYEN DUC VIET
 */
public class StringProcessor implements IStringOperations {

    @Override
    public int countVowels(String value) {
        int count = 0;
        char[] chars = value.toLowerCase().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'u' || chars[i] == 'e' || chars[i] == 'o'
                    || chars[i] == 'a' || chars[i] == 'i') {
                count++;
            }
        }
        return count;
    }

    @Override
    public String reverseString(String value) {
        String word = "";
        char[] chars = value.toCharArray();
        for (int i = chars.length-1; i >= 0; i--) {
            word += chars[i];
        }
        return word;
    }

}
