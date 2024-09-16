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
    public int f1(String str) {
        String words[] = str.split("\\s+");
        int count = 0;
        for (String word : words) {
            char c[] = word.toCharArray();
            for (int i = 0; i < c.length; i++) {
                if (Character.isDigit(c[i]) && Character.getNumericValue(c[i]) % 2 != 0) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public boolean isPalindrom(String word) {
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String f2(String str) { //ab 12321 uv 12321 xy
        String rs = "";
        String[] words = str.split("\\s+");
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (count == 0 && isPalindrom(words[i])) {
                words[i] = "XX";
                count++;
            }
            rs += words[i] + " ";
        }
        return rs.trim();
    }
}
