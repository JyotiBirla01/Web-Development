//Write a Java program to input basic salary of an employee and calculate its Gross salary according to following:
// Basic Salary <= 10000 : HRA = 20%, DA = 80% 
//Basic Salary <= 20000 : HRA = 25%, DA = 90% 
//Basic Salary > 20000 : HRA = 30%, DA = 95% 

import java.util.Scanner;

public class Ass227 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float hra, dra;
        System.out.println("Enter your basic salary ");
        float basicSalary = sc.nextInt();
        if (basicSalary <= 10000) {
            hra = basicSalary * (20 / 100f);
            dra = basicSalary * (80 / 100f);
            System.out.println("HRA is " + hra);
            System.out.println("DRA is " + dra);
            System.out.println(basicSalary + hra + dra);
        } else if (basicSalary <= 20000) {
            hra = basicSalary * (25 / 100f);
            dra = basicSalary * (90 / 100f);
            System.out.println("HRA is " + hra);
            System.out.println("DRA is " + dra);

        } else if (basicSalary > 20000) {
            hra = basicSalary * (30 / 100f);
            dra = basicSalary * (95 / 100f);
            System.out.println("HRA is " + hra);
            System.out.println("DRA is " + dra);
        }

    }

}
