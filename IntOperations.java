// IntOperations class to perform integer operations (a + b * c, a * b + c, c + a / b, and a % b + c)

import java.util.Scanner;

class IntOperations {
    public static void main(String[] args) {
        
        // Create a Scanner object to take user input
        Scanner scan = new Scanner(System.in);
        
        // Variables to store the values of a, b, and c
        System.out.print("Enter value for a: ");
        int a = scan.nextInt();
        
        System.out.print("Enter value for b: ");
        int b = scan.nextInt();
        
        System.out.print("Enter value for c: ");
        int c = scan.nextInt();
        
        // Perform the integer operations and store the results
        int result1 = a + b * c;   // First operation: a + (b * c)
        int result2 = a * b + c;   // Second operation: (a * b) + c
        int result3 = c + a / b;   // Third operation: c + (a / b)
        int result4 = a % b + c;   // Fourth operation: (a % b) + c
        
        // Print the results of the integer operations
        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", and " + result4);
        
        scan.close(); // Close the scanner
    }
}
