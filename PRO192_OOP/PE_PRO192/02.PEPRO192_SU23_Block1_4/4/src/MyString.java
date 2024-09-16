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

    public boolean isPalindrome(String word) {
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public boolean is2chars(String word) {
        char[] chars = word.toCharArray();
        int count = 0;
        for (char c : chars) {
            count++;
        }
        if (count < 2) {
            return false;
        }
        return true;
    }

    @Override
    public int f1(String str) { //a aa ab ac bb aba abc
        int count = 0;
        String[] words = str.split(" ");
        for (String word : words) {
            if (is2chars(word) && isPalindrome(word)) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String f2(String str) { //a aa bb cc d e
        String[] words = str.split(" ");
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 1; j < words.length; j++) {
                if (words[i].length() < words[j].length()) {
                    String tem = words[i];
                    words[i] = words[j];
                    words[j] = tem;
                }
            }
        }
        return words[0];
    }
}
