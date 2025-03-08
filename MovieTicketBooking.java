import java.util.Scanner;

// MovieTicket class to manage movie ticket details
class MovieTicket {
    String movieName;
    String seatNumber;
    double price;

    // Constructor to initialize movie ticket details
    public MovieTicket(String movieName, String seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    // Method to book a ticket
    public void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked for " + movieName + " at seat " + seatNumber);
    }

    // Method to display ticket details
    public void displayTicketDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }
}

public class MovieTicketBooking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input movie details
        System.out.print("Enter Movie Name: ");
        String movieName = scanner.nextLine();
        System.out.print("Enter Seat Number: ");
        String seatNumber = scanner.nextLine();
        System.out.print("Enter Ticket Price: ");
        double price = scanner.nextDouble();
        
        // Create MovieTicket object and book ticket
        MovieTicket ticket = new MovieTicket(movieName, seatNumber, price);
        ticket.bookTicket(seatNumber, price);
        ticket.displayTicketDetails();
        
        scanner.close();
    }
}

/*
Input:
Enter Movie Name: Inception
Enter Seat Number: A12
Enter Ticket Price: 12.50

Output:
Ticket booked for Inception at seat A12
Movie Name: Inception
Seat Number: A12
Price: 12.5
*/