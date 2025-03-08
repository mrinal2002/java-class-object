import java.util.Scanner;

// Item class to store item details
class Item {
    String itemCode;
    String itemName;
    double price;

    // Constructor to initialize item details
    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    public void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    // Method to calculate total cost for a given quantity
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class InventoryTracking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input item details
        System.out.print("Enter Item Code: ");
        String itemCode = scanner.nextLine();
        System.out.print("Enter Item Name: ");
        String itemName = scanner.nextLine();
        System.out.print("Enter Item Price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();
        
        // Create Item object and display details
        Item item = new Item(itemCode, itemName, price);
        item.displayDetails();
        System.out.println("Total Cost for " + quantity + " items: " + item.calculateTotalCost(quantity));
        
        scanner.close();
    }
}

/*
Input:
Enter Item Code: A123
Enter Item Name: Widget
Enter Item Price: 15.50
Enter Quantity: 3

Output:
Item Code: A123
Item Name: Widget
Price: 15.5
Total Cost for 3 items: 46.5
*/