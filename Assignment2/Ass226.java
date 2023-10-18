
//Write a Java program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer.
// Calculate percentage and grade according to following: 
//Percentage >= 90% : Grade A 
//Percentage >= 80% : Grade B 
//Percentage >= 70% : Grade C 
//Percentage >= 60% : Grade D 
//Percentage >= 40% : Grade E 
//Percentage < 40% : Grade F
import java.util.Scanner;

public class Ass226 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of Physics :-");
        float physics = sc.nextInt();
        System.out.println("Enter the marks of Chemistry :-");
        float Chemistry = sc.nextInt();
        float Biology = sc.nextInt();
        System.out.println("Enter the marks of Biology :-");
        float Mathematics = sc.nextInt();
        System.out.println("Enter the marks of Mathematics :-");
        float Computer = sc.nextInt();
        System.out.println("Enter the marks of Computer :-");

        float total = (physics + Chemistry + Biology + Mathematics + Computer);
        float per = (total / 500) * 100;
        System.out.println("The percentage of student is :- ");
        if (per >= 90)
            System.out.println(" GradeA");
        else if (per >= 80)
            System.out.println(" GradeB");
        else if (per >= 70)
            System.out.println(" GradeC");
        else if (per >= 60)
            System.out.println(" GradeD");
        else if (per >= 40)
            System.out.println(" GradeE");
        else if (per <= 40)
            System.out.println("Grade F ");

    }

}
