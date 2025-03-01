// DiscountedFee class to calculate the discounted price for the university fee
class DiscountedFee {
    public static void main(String[] args) {
        
        // Variable to store course fee and discount percentage
        int fee = 125000;
        int discountPercent = 10;
        
        // Variable to calculate discount amount
        double discount = (fee * discountPercent) / 100.0;
        
        // Variable to calculate discounted fee
        double discountedFee = fee - discount;
        
        // Print the discount and discounted fee
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
    }
}