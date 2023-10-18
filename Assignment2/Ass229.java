//Write a program to input choice from user. If user enter ‘+’ as choice then calculate addition of 2 number. 
//If Choice ‘>’ then check which number is greaterst. If choice is ‘==’ then check both number is equal or not.

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Ass229 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number ");
        int n2 = sc.nextInt();
        System.out.println("Enter the operator of your choice");
        char operator = sc.next().charAt(0);
        if (operator == '+') {
            System.out.println("Addition of two nubmer is " + (n1 + n2));
        } else if (operator == '>') {
            if (n1 > n2)
                System.out.println(n1 + " is greater than " + n2);
            else
                System.out.println(n2 + " is greater than " + n1);
        } else if (operator == '=') {
            if (n1 == n2)
                System.out.println(n1 + " and " + n2 + " are euqal");
            else
                System.out.println(n1 + " and " + n2 + " are not  euqal");
        } else {
            System.out.println("Not  operator find");
        }

    }

}
