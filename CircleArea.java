import java.util.Scanner;

// Circle class to calculate area and circumference
class Circle {
    double radius;

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display area and circumference
    public void displayDetails() {
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }
}

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input radius
        System.out.print("Enter radius of the circle: ");
        double radius = scanner.nextDouble();
        
        // Create Circle object and display details
        Circle circle = new Circle(radius);
        circle.displayDetails();
        
        scanner.close();
    }
}

/*
Input:
Enter radius of the circle: 5

Output:
Area: 78.53981633974483
Circumference: 31.41592653589793
*/