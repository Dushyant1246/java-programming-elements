// CalculateAge class to calculate age given current year and birth year

class CalculateAge{
	public static void main(String[] args){
		
		// Variable to indicate person's name
		String name = "Harry";
		
		// Variable to indicate person's birth year and current year
		int birthYear = 2000, currentYear = 2024;
		
		// Variable to indicate the age of the person
		int age = currentYear - birthYear;
		
		// Print the person's age
		System.out.println(name + "'s age in " + currentYear + " is " + age);
	}
}