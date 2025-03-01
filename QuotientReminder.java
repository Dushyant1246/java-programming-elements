//QuotientRemainder class to take 2 numbers and print their quotient and remainder

import java.util.Scanner;

class QuotientReminder {
    public static void main(String[] args) {
        
        // Create a Scanner object to take user input
        Scanner scan = new Scanner(System.in);
        
        // Variables to store the two numbers
        System.out.print("Enter first number: ");
        int num1 = scan.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();
        
        // Calculate quotient and remainder
        int quotient = num1 / num2;
        int remainder = num1 % num2;
        
        // Print the quotient and remainder
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two number " + num1 + " and " + num2);
        
        scan.close(); // Close the scanner
    }
}
