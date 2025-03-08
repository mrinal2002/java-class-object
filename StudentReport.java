import java.util.Scanner;

// Student class to store student details and calculate grade
class Student {
    String name;
    int rollNumber;
    double marks;

    // Constructor to initialize student details
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate grade based on marks
    public String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to display student details and grade
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}

public class StudentReport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input student details
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Roll Number: ");
        int rollNumber = scanner.nextInt();
        System.out.print("Enter Marks: ");
        double marks = scanner.nextDouble();
        
        // Create Student object and display details
        Student student = new Student(name, rollNumber, marks);
        student.displayDetails();
        
        scanner.close();
    }
}

/*
Input:
Enter Student Name: Alice
Enter Roll Number: 12
Enter Marks: 85

Output:
Student Name: Alice
Roll Number: 12
Marks: 85.0
Grade: B
*/