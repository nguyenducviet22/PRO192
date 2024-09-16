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
    public int f1(String str) {//ab c2 d1 e1 b4 u8
        int count = 0;
        String[] words = str.split("\\s+");
        for (String word : words) {
            char[] chars = word.toCharArray();
            for (char c : chars) {
                if (Character.isDigit(c) && Character.getNumericValue(c) % 2 == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public boolean isPalindrome(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String f2(String str) {//ab abc abcba 12321 uv
        String[] words = str.split("\\s+");
        String rs = "";
        int count = 0;
        for (String word : words) {
            if (isPalindrome(word)) {
                if (count == 0) {
                    word = "YY";
                }
                count++;
            }
            rs += word + " ";
        }
        return rs;
    }

}
