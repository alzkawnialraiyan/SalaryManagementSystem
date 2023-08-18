import java.util.ArrayList;
import java.util.List;

public class SalaryManagementSystem {
    private List<Employee> employees = new ArrayList<>();
    public void addEmployee(String name, double salary) {
        Employee employee = new Employee(name, salary);
        employees.add(employee);
    }
    public void showAllSalaries() {
        System.out.println("Employees and their salaries:");
        for (Employee employee : employees) {
            System.out.println(employee.getName() + ": " + employee.getSalary());
        }
    }
}
