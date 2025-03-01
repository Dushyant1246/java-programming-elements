// SquareSide class to find the side of a square
import java.util.Scanner;
class SquareSide {
    public static void main(String[] args) {
        
        // Create Scanner object to take user input
        Scanner scan = new Scanner(System.in);
        
        // Variable to store perimeter of the square
        System.out.print("Enter perimeter of the square: ");
        double perimeter = scan.nextDouble();
        
        // Variable to calculate side of the square
        double side = perimeter / 4;
        
        // Print the result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
        
        scan.close(); // Close the scanner
    }
}