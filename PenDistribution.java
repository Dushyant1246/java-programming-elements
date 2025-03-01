// PenDistribution class to divide 14 pens among 3 students
class PenDistribution {
    public static void main(String[] args) {
        
        // Variables to indicate total number of pens and students
        int totalPens = 14, students = 3;
        
        // Variable to calculate number of pens each student will get
        int pensPerStudent = totalPens / students;
        
        // Variable to calculate remaining pens after distribution
        int remainingPens = totalPens % students;
        
        // Print the result
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}