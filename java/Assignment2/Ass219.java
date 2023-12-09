
//W.A.P to check whether the traingle is equilateral, scalene, or isosceles. Hint: - Isosceles triangle: In geometry,
// an isosceles triangle is a triangle that has two sides of equal length. Equilateral triangle: In geometry, an 
//equilateral triangle is a triangle in which all three sides are equal. Scalene triangle: A scalene triangle is a
// triangle that has three unequal sides. 

import java.util.Scanner;

public class Ass219 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first side of triangle");
        int firstSide = sc.nextInt();
        System.out.println("Enter the second side of triangle");
        int secondSide = sc.nextInt();
        System.out.println("Enter the third side of triangle");
        int thirdSide = sc.nextInt();
        if (firstSide == secondSide || secondSide == thirdSide || thirdSide == firstSide)
            System.out.println("isosceles triangle ");
        else if (firstSide == secondSide && secondSide == thirdSide && thirdSide == firstSide)
            System.out.println("Equilateral triagle ");
        else
            System.out.println("Scalene triangle");
    }

}
