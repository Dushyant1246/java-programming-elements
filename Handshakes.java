// Handshakes class to find the maximum number of handshakes among N number of students
import java.util.Scanner;
class Handshakes {
    public static void main(String[] args) {
        
        // Create Scanner object to take user input
        Scanner scan = new Scanner(System.in);
        
        // Variable to store number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = scan.nextInt();
        
        // Variable to calculate maximum number of handshakes
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        
        // Print the result
        System.out.println("The maximum number of handshakes is " + handshakes);
        
        scan.close(); // Close the scanner
    }
}