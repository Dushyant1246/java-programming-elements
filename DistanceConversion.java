// DistanceConversion class to find the distance in yards and miles for distance in feet
import java.util.Scanner;
class DistanceConversion {
    public static void main(String[] args) {
        
        // Create Scanner object to take user input
        Scanner scan = new Scanner(System.in);
        
        // Variable to store distance in feet
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = scan.nextDouble();
        
        // Variable to calculate distance in yards
        double distanceInYards = distanceInFeet / 3;
        
        // Variable to calculate distance in miles
        double distanceInMiles = distanceInYards / 1760;
        
        // Print the result in yards and miles
        System.out.println("The distance is " + distanceInYards + " yards and " + distanceInMiles + " miles for the given " + distanceInFeet + " feet.");
        
        scan.close(); // Close the scanner
    }
}