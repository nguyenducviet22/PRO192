
public class MyUtilities implements IUtilities {
    
    @Override
    public int checkNumber(String value) {
        String str = "^[0-9]+$";
        if (value.matches(str)) {
            int num = Integer.parseInt(value);
            return num * num;
        } else {
            return value.length();
        }
    }
    
    @Override
    public int sumNumber(String value) {
        int sum = 0;
        for (char c : value.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }
        return sum;
    }
    
}
