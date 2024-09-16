public class WS1 {
    public static void main(String[] args) {
        boolean rs = isPime(7);
        System.out.println(rs);
        
        printPrimeList();
    }
    
    public static void printPrimeList(){
        for (int i = 1; i < 1000; i++) {
            if (isPime(i) == true)
                System.out.print(i + " ");
        }
    }
    
    public static boolean isPime(int n){
        if (n < 2)
            return false;
        if (n == 2)
            return true;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
