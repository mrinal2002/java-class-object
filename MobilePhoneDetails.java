import java.util.Scanner;

// MobilePhone class to store mobile phone details
class MobilePhone {
    String brand;
    String model;
    double price;

    // Constructor to initialize mobile phone details
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display mobile phone details
    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

public class MobilePhoneDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input mobile phone details
        System.out.print("Enter Brand: ");
        String brand = scanner.nextLine();
        System.out.print("Enter Model: ");
        String model = scanner.nextLine();
        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();
        
        // Create MobilePhone object and display details
        MobilePhone mobilePhone = new MobilePhone(brand, model, price);
        mobilePhone.displayDetails();
        
        scanner.close();
    }
}

/*
Input:
Enter Brand: Samsung
Enter Model: Galaxy S21
Enter Price: 799.99

Output:
Brand: Samsung
Model: Galaxy S21
Price: 799.99
*/