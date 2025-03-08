import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// CartItem class to manage shopping cart items
class CartItem {
    String itemName;
    double price;
    int quantity;

    // Constructor to initialize cart item details
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate total cost
    public double totalCost() {
        return price * quantity;
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<CartItem> cart = new ArrayList<>();
        
        // Input item details
        while (true) {
            System.out.print("Enter Item Name (or 'exit' to finish): ");
            String itemName = scanner.nextLine();
            if (itemName.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.print("Enter Item Price: ");
            double price = scanner.nextDouble();
            System.out.print("Enter Item Quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            // Add item to cart
            cart.add(new CartItem(itemName, price, quantity));
        }
        
        // Display total cost
        double totalCost = 0;
        for (CartItem item : cart) {
            totalCost += item.totalCost();
        }
        System.out.println("Total Cost: " + totalCost);
        
        scanner.close();
    }
}

/*
Input:
Enter Item Name (or 'exit' to finish): Apple
Enter Item Price: 0.5
Enter Item Quantity: 4
Enter Item Name (or 'exit' to finish): Banana
Enter Item Price: 0.3
Enter Item Quantity: 6
Enter Item Name (or 'exit' to finish): exit

Output:
Total Cost: 3.3
*/