
import java.util.Scanner;

class Ass5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entered the age of first people");
        int age1 = sc.nextInt();
        System.out.println("Entered the age of Second people");
        int age2 = sc.nextInt();
        System.out.println("Entered the age of third people");
        int age3 = sc.nextInt();
        if (age1 > age2 && age1 > age3) {
            System.out.println(age1 + " is Oldest");
        } else {
            if (age2 > age3) {
                System.out.println(age2 + " is Oldest");
            } else {
                System.out.println(age3 + " is Oldest");
            }
        }
        if (age1 < age2 && age1 < age3) {
            System.out.println(age1 + " is Youngest ");
        } else {
            if (age2 < age3) {
                System.out.println(age2 + " is Youngest ");
            } else {
                System.out.println(age3 + " is Youngest");
            }
        }

    }

}
