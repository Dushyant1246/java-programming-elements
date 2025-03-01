// PurchasePrice class to calculate total price based on unit price and quantity
import java.util.Scanner;
class PurchasePrice {
    public static void main(String[] args) {
        
        // Create Scanner object to take user input
        Scanner scan = new Scanner(System.in);
        
        // Variables to store unit price and quantity
        System.out.print("Enter unit price: ");
        double unitPrice = scan.nextDouble();
        
        System.out.print("Enter quantity: ");
        int quantity = scan.nextInt();
        
        // Variable to calculate total price
        double totalPrice = unitPrice * quantity;
        
        // Print the result
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and unit price is INR " + unitPrice);
        
        scan.close(); // Close the scanner
    }
}