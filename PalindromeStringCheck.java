import java.util.Scanner;

// PalindromeChecker class to check if a string is a palindrome
class PalindromeChecker {
    String text;

    // Constructor to initialize text
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }

    // Method to display the result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println(text + " is a palindrome.");
        } else {
 System.out.println(text + " is not a palindrome.");
        }
    }
}

public class PalindromeStringCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input text
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        // Create PalindromeChecker object and display result
        PalindromeChecker checker = new PalindromeChecker(text);
        checker.displayResult();
        
        scanner.close();
    }
}

/*
Input:
Enter a string: Madam

Output:
Madam is a palindrome.
*/