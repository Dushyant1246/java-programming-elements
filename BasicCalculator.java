// Scanner class imported to take input
import java.util.Scanner;

//BasicCalculator class to perform basic arithmetic calculations

class BasicCalculator{
	public static void main(String[] args){
		// Scanner object to take input data
		Scanner scan = new Scanner(System.in);
		
		// Variables to take input from user of two numbers
		System.out.print("Enter first number : ");
		int number1 = scan.nextInt();
		System.out.print("Enter second number : ");
		int number2 = scan.nextInt();
		
		// Calculate all the values using arithmetic operators
		int addition = number1 + number2;
		int subtraction = number1 - number2;
		int multiplication = number1 * number2;
		float division = (float) number1 / (float) number2;
		
		// Print the result
		System.out.print("The addition, subtraction, multiplication, and division value of 2 numbers " + number1 + " and " + number2 + " is " + addition + ", " + subtraction + ", " + multiplication + ", and " + division);
	}
}