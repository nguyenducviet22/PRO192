import java.util.ArrayList;

public class EmployeeList extends ArrayList<Employee> {

    public String getNameById(int id) {
        String rs = "Not found";
        Employee em = null;
//        for (int i = 0; i < this.size(); i++) {
//            if (this.get(i).getId() == id) {
//                em = this.get(i);
//            }
//        }
//        if (em != null) {
//            rs = em.getName();
//        }
//        return rs;

        for (Employee employee : this) {
            if (employee.getId() == id) {
                em = employee;
            }
        }
        if (em != null) {
            rs = em.getName();
        }
        return rs;
    }

    public Employee getEmployeeWithMaxSalary() {
        Employee maxSalary = this.get(0);
        for (Employee employee : this) {
            if (employee.getSalary() > maxSalary.getSalary()){
                maxSalary = employee;
            }
        }
        return maxSalary;
    }
}
