import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

class per {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the percentage");
        int p = sc.nextInt();

        if (p > 60) {
            System.out.println("You are passed with first division");
        } else if (p > 50 && p < 60) {
            System.out.println("2nd division");

        } else if (p > 33 && p > 49) {
            System.out.println("3rd division");

        } else {
            System.out.println("Fail");
        }
    }

}