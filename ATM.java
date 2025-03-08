import java.util.Scanner;

// BankAccount class to manage bank account details
class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;

    // Constructor to initialize bank account details
    public BankAccount(String accountHolder, String accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Method to display current balance
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input account details
        System.out.print("Enter Account Holder Name: ");
        String accountHolder = scanner.nextLine();
        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter Initial Balance: ");
        double initialBalance = scanner.nextDouble();
        
        // Create BankAccount object
        BankAccount account = new BankAccount(accountHolder, accountNumber, initialBalance);
        
        // Perform operations
        account.deposit(1000);
        account.withdraw(500);
        account.displayBalance();
        
        scanner.close();
    }
}

/*
Input:
Enter Account Holder Name: John Doe
Enter Account Number: 123456
Enter Initial Balance: 2000

Output:
Deposited: 1000.0
Withdrawn: 500.0
Current Balance: 2500.0
*/