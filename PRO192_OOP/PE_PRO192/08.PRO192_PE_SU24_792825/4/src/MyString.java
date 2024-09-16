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
    public int f1(String string) {//a1 b2c3 d21e 3c12
        int sum = 0;
        String[] words = string.split("\\s+");
        String numStr = "";
        for (String word : words) {
            char[] chars = word.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (Character.isDigit(chars[i])) {
                    numStr += chars[i];
                } else {
                    if (numStr.length() > 0) {
                        int num = Integer.parseInt(numStr);
                        if (num % 2 != 0) {
                            sum += num;
                        }
                        numStr = "";
                    }
                }
            }
            if (numStr.length() > 0) {
                int num = Integer.parseInt(numStr);
                if (num % 2 != 0) {
                    sum += num;
                }
                numStr = "";
            }
        }
        return sum;
    }

    @Override
    public String f2(String string) {
        String[] words = string.split("\\s+");
        int l = 0;
        String rs = "";
        String reStr = "";
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > l) {
                l = words[i].length();
            }
        }
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == l && count < 1) {
//                either
//                char[] chars = words[i].toCharArray();
//                for (int j = chars.length - 1; j >= 0; j--) {
//                    reStr += chars[j];
//                }
//                rs += reStr + " ";
//                or
                StringBuilder sb = new StringBuilder();
                sb.append(words[i]);
                rs += sb.reverse() + " ";
                count++;
            } else {
                rs += words[i] + " ";
            }
        }
        return rs.trim();
    }
}
