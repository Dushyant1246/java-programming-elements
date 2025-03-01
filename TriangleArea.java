// TriangleArea class to find area of a triangle in square inches and square centimeters
import java.util.Scanner;
class TriangleArea {
    public static void main(String[] args) {
        
        // Create Scanner object to take user input
        Scanner scan = new Scanner(System.in);
        
        // Variables to store base and height of the triangle
        System.out.print("Enter base of triangle: ");
        double base = scan.nextDouble();
        
        System.out.print("Enter height of triangle: ");
        double height = scan.nextDouble();
        
        // Variable to calculate area in square inches
        double areaInches = 0.5 * base * height;
        
        // Variable to convert area to square centimeters
        double areaCm = areaInches * 6.4516; // converting square inches to square centimeters
        
        // Print the area in both square inches and square centimeters
        System.out.println("The area of the triangle is " + areaInches + " square inches and " + areaCm + " square centimeters.");
        
        scan.close(); // Close the scanner
    }
}