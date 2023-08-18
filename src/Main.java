import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SalaryManagementSystem salarySystem = new SalaryManagementSystem();
        Scanner read = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Create a new employee and assign their salary.");
            System.out.println("2. Show all salaries and employees.");
            System.out.println("3. Exit");

            int choice = read.nextInt();
            read.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter the employee's name:");
                    String name = read.nextLine();
                    System.out.println("Enter the employee's salary:");
                    double salary = read.nextDouble();
                    salarySystem.addEmployee(name, salary);
                    System.out.println("Employee added successfully.");
                    break;
                case 2:
                    salarySystem.showAllSalaries();
                    break;
                case 3:
                    System.out.println("Thank you.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        }
    }
}
