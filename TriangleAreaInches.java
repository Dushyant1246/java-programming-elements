//class TriangleArea to find the area of a triangle in square inches and square centimeters

import java.util.Scanner;

class TriangleAreaInches {
    public static void main(String[] args) {
        
        // Create a Scanner object to take user input
        Scanner scan = new Scanner(System.in);
        
        // Variables to store base and height in centimeters
        System.out.print("Enter base of the triangle in cm: ");
        double baseCm = scan.nextDouble();
        
        System.out.print("Enter height of the triangle in cm: ");
        double heightCm = scan.nextDouble();
        
        // Calculate area in square centimeters (Area = 1/2 * base * height)
        double areaCm2 = 0.5 * baseCm * heightCm;
        
        // Convert area to square inches (1 inch = 2.54 cm, so 1 cm = 1/2.54 inch)
        double areaInches2 = areaCm2 / (2.54 * 2.54);
        
        // Print the area in square inches and square centimeters
        System.out.println("The Area of the triangle in sq in is " + areaInches2 + " and sq cm is " + areaCm2);
        
        scan.close(); // Close the scanner
    }
}
