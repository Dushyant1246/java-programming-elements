// MilesConversion to convert km to miles
import java.util.Scanner;
class MilesInput {
    public static void main(String[] args) {
        
        // Create Scanner object to take user input
        Scanner scan = new Scanner(System.in);
        
        // Variable to store distance in km
        System.out.print("Enter distance in kilometers: ");
        double km = scan.nextDouble();
        
        // Variable to calculate distance in miles
        double miles = km / 1.6;
        
        // Print the result in miles
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        
        scan.close(); // Close the scanner
    }
}