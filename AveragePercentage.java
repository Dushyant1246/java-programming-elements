// AveragePercentage class to calculate average percentage marks in PCM

class AveragePercentage{
	public static void main(String[] args){
		
		// Variable to indicate person's name
		String name = "Sam";
		
		// Variables to indicate person's marks in all subjects
		int mathsMarks = 94, physicsMarks = 95, chemistryMarks = 96;
		
		// Variable to indicate average marks percentage
		int averageMarks = (mathsMarks + physicsMarks + chemistryMarks) / 3;
		
		// Print the average marks
		System.out.println(name + "'s average mark in PCM is " + averageMarks);
	}
}