
import java.util.Comparator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author NGUYEN DUC VIET
 */
public class MyTaxi implements ITaxi {

    public boolean isPalindrome(String driver) {
        char[] chars = driver.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int f1(List<Taxi> t) {
        int total = 0;
        for (int i = 0; i < t.size(); i++) {
            String driver = t.get(i).getDriver();
            if (driver.length() >= 2
                    && !isPalindrome(driver)) {
                total += t.get(i).getSalary();
            }
        }
        return total;
    }

    public boolean isEvenDigit(int salary) {
        int div = salary;
        while (div != 0) {
            int mod = div % 10;
            if (mod % 2 != 0) {
                return false;
            }
            div = div / 10; 
        }
        return true;
    }

    @Override
    public void f2(List<Taxi> t) {
        for (int i = 0; i < t.size(); i++) {
            int salary = t.get(i).getSalary();
            if (salary >= 10 && salary <= 99 && isEvenDigit(salary)) {
                t.remove(i);
                break;
            }
        }
    }

    @Override
    public void f3(List<Taxi> t) {
        t.sort(new Comparator<Taxi>() {
            @Override
            public int compare(Taxi o1, Taxi o2) {
                if (o1.getSalary() < o2.getSalary()) {
                    return 1;
                } else if (o1.getSalary() > o2.getSalary()) {
                    return -1;
                } else {
                    return o1.getDriver().compareToIgnoreCase(o2.getDriver());
                }
            }
        });
    }

}
