import java.util.Scanner;

// Book class to store book details
class Book {
    String title;
    String author;
    double price;

    // Constructor to initialize book details
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class BookDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input book details
        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Author Name: ");
        String author = scanner.nextLine();
        System.out.print("Enter Book Price: ");
        double price = scanner.nextDouble();
        
        // Create Book object and display details
        Book book = new Book(title, author, price);
        book.displayDetails();
        
        scanner.close();
    }
}

/*
Input:
Enter Book Title: Java Programming
Enter Author Name: John Smith
Enter Book Price: 29.99

Output:
Book Title: Java Programming
Author: John Smith
Price: 29.99
*/