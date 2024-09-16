
public class MyUtilities implements IUtilities {

    @Override
    public int checkNumber(String value) {
        String pattern = "^[0-9]+$";
//        String pattern = "^0123456789$";
        if (!value.matches(pattern)) {
            return value.length();
        } else {
            int num = Integer.parseInt(value);
            return num * num;
        }
    }
    
//    public int checkNumber(String value){
//        int num;
//        try {
//            num = Integer.parseInt(value);
//        } catch (Exception e) {
//            return value.length();
//        }
//        return num * num;
//    }

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
