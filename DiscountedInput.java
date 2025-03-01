// DiscountedInput to input Student Fee and University Discount
import java.util.Scanner;
class DiscountedInput {
    public static void main(String[] args) {
        
        // Create Scanner object to take user scan
        Scanner scan = new Scanner(System.in);
        
        // Variable to store course fee and discount percentage
        System.out.print("Enter course fee: ");
        double fee = scan.nextDouble();
        
        System.out.print("Enter discount percentage: ");
        double discountPercent = scan.nextDouble();
        
        // Variable to calculate discount
        double discount = (fee * discountPercent) / 100.0;
        
        // Variable to calculate discounted fee
        double discountedFee = fee - discount;
        
        // Print the discount and discounted fee
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
        
        scan.close(); // Close the scanner
    }
}