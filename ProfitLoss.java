// ProfitLoss class to calculate profit and loss in number and percentage
class ProfitLoss {
    public static void main(String[] args) {
        
        // Variables to indicate cost price and selling price
        int costPrice = 129, sellingPrice = 191;
        
        // Variable to calculate profit
        int profit = sellingPrice - costPrice;
        
        // Variable to calculate profit percentage
        double profitPercentage = (double) profit / costPrice * 100;
        
        // Print the profit and profit percentage
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice);
        System.out.println("The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage + "%");
    }
}