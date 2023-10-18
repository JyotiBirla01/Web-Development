//Q.12 a) Write a statement that declares a string array initialized with the following strings:
//"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" and "Saturday".

import java.util.Scanner;

class Ass12_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr[] = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

        System.out.println("The data you entered ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}