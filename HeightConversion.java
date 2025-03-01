// HeightConversion class to convert height in cm to feet and inches
import java.util.Scanner;
class HeightConversion {
    public static void main(String[] args) {
        
        // Create Scanner object to take user input
        Scanner scan = new Scanner(System.in);
        
        // Variable to store height in cm
        System.out.print("Enter your height in centimeters: ");
        double heightCm = scan.nextDouble();
        
        // Variable to calculate height in inches
        double heightInches = heightCm / 2.54;
        
        // Variable to calculate height in feet
        double heightFeet = heightInches / 12;
        
        // Variable to calculate remaining inches
        double remainingInches = heightInches % 12;
        
        // Print the result in feet and inches
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + (int) heightFeet + " and inches is " + (int) remainingInches);
        
        scan.close(); // Close the scanner
    }
}