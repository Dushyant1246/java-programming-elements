//DoubleOperations class to perform double operations (a + b * c, a * b + c, c + a / b, and a % b + c)

import java.util.Scanner;

class DoubleOperations {
    public static void main(String[] args) {
        
        // Create a Scanner object to take user input
        Scanner scan = new Scanner(System.in);
        
        // Variables to store the values of a, b, and c as double
        System.out.print("Enter value for a: ");
        double a = scan.nextDouble();
        
        System.out.print("Enter value for b: ");
        double b = scan.nextDouble();
        
        System.out.print("Enter value for c: ");
        double c = scan.nextDouble();
        
        // Perform the double operations and store the results
        double result1 = a + b * c;   // First operation: a + (b * c)
        double result2 = a * b + c;   // Second operation: (a * b) + c
        double result3 = c + a / b;   // Third operation: c + (a / b)
        double result4 = a % b + c;   // Fourth operation: (a % b) + c
        
        // Print the results of the double operations
        System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
        
        scan.close(); // Close the scanner
    }
}
