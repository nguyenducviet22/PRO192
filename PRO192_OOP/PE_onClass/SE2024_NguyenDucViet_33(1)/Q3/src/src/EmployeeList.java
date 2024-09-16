
import java.util.ArrayList;

public class EmployeeList extends ArrayList<Employee> {
    public String getNameById(int id) {
        String rs = "Not found";
        Employee em = null;
        for (Employee employee : this) {
            if (employee.getId() == id) {
                em = employee;
            }
        }
        if (em != null) {
            rs = em.getName().toUpperCase();
        }
        return rs;
    }

    public Employee getEmployeeWithMaxSalary() {
        Employee maxSalary = this.get(0);
        for (int i = 0; i < this.size(); i++) {
            if (maxSalary.getSalary() < this.get(i).getSalary()){
                maxSalary = this.get(i);
            }
        }
        return maxSalary;
    }
}
