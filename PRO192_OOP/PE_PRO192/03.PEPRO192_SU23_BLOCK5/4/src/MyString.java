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

    public boolean isConsonant(char c) {
        if (c == 'u' || c == 'U' || c == 'e' || c == 'E' || c == 'o'
                || c == 'O' || c == 'a' || c == 'a' || c == 'i' || c == 'I') {
            return false;
        }
        return true;
    }

    @Override
    public int f1(String str) {
        int count = 0;
        int total = 0;
        String[] words = str.split(" ");// blue yellow red ora
        for (String word : words) {
            for (char c : word.toCharArray()) {
                if (isConsonant(c)) {
                    count++;
                }
            }
            if (count > 1) {
                total++;
            }
            count = 0;
        }
        return total;
    }

    @Override
    public String f2(String str) {
        String rs = "";
        char[] chars = str.toLowerCase().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length - 1; j++) {
                if (chars[j] == chars[i]) {
                    rs += chars[j];
                }
            }
        }
        return rs;
    }

}
