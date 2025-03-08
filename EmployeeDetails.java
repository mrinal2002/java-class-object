import java.util.Scanner;

// Employee class to store employee details
class Employee {
    String name;
    int id;
    double salary;

    // Constructor to initialize employee details
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input employee details
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter Employee Salary: ");
        double salary = scanner.nextDouble();
        
        // Create Employee object and display details
        Employee employee = new Employee(name, id, salary);
        employee.displayDetails();
        
        scanner.close();
    }
}

/*
Input:
Enter Employee Name: John Doe
Enter Employee ID: 101
Enter Employee Salary: 50000

Output:
Employee Name: John Doe
Employee ID: 101
Employee Salary: 50000.0
*/