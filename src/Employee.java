public class Employee {
    private String Employeename;
    private double Employeesalary;
    public Employee(String name, double salary) {
        Employeename = name;
        Employeesalary = salary;
    }
    public String getName() {
        return Employeename;
    }
    public double getSalary() {
        return Employeesalary;
    }
}
