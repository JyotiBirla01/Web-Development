//The total number of students in a class are 90 out of which 45 are boys. If 50% of the total students 
//secured grade 'A' out of which 20 are boys, then write a program to calculate the total number of girls
// getting grade 'A'.
package OperatorOfJava;

public class Problem8 {
    public static void main(String[] args) {
        int totalStudents = 90, boys = 45, girls, , gradeABoys = 20, gradeAGirls;
        girls = totalStudents - boys;
        gradeAGirls = girls - gradeABoys;
        System.out.println(gradeAGirls);

    }
}
