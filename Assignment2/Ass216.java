//W.A.P to convert temperature from Fahrenheit to Celsius and Celsius to Fahrenheit.
// For given problem you have to take choice from user. If user enter choice ‘c’ or ‘C’ 
//then convert Fahrenheit to Celsius. If user enter choice ‘f’ or ‘F’ then convert Celsius to Fahrenheit. 

import java.util.Scanner;

class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature which you want to convert  //C Or F :- ");

        // float chageInC = (F - 32) * 5 / 9;
        // float chageInF;
        // chageInF = ((C * (9 / 5)) + 32);
        // System.out.println("The temperature in c is :- " + chageInC);
        // System.out.println("The temperature in F is :- " + chageInF);
        char user = sc.next().charAt(0);
        if (user == 'C' || user == 'c') {
            System.out.println("Enter the temperature ");
            float F = sc.nextFloat();
            System.out.println((F - 32) * 5.0 / 9);
        } else {
            if (user == 'F' || user == 'f') {
                System.out.println("Enter the temperature");
                float C = sc.nextFloat();
                System.out.println((C * (9.0 / 5)) + 32);
            } else {
                System.out.println("ERROR");
            }
        }

    }
}
