
public class MyString implements IString {

    @Override
    public int f1(String string) {
        int count = 0;
        for (String word : string.split(" ")) {
            if (Character.isLetter(word.charAt(0))
                    && Character.isLetter(word.charAt(word.length() - 1))) {
                for (int i = 1; i <= word.length() - 2; i++) {
                    if (Character.isDigit(word.charAt(i))) {
                        count++;
                        break;
                    }
                }
            }
        }
        return count;
    }

    @Override
    public String f2(String string) {
        char c[] = string.toCharArray();
        String str = "";
        int count = 0;
        for (int i = 0; i < c.length; i++) {
            if (Character.isDigit(c[i])
                && Character.getNumericValue(c[i]) % 2 != 0) {
                count++;
                if (count > 1) {
                    c[i] = c[0];
                }
            }
            str += c[i];
        }

        return str;
    }

}
