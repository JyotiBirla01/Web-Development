import java.util.Scanner;

class Ass11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Enter  your Gender M/F ");
        char gender = sc.next().charAt(0);
        System.out.println("Enter your Maritial status Y/N");
        char married = sc.next().charAt(0);
        // char m = 'M';
        // char f = 'F';

        System.out.println("Age " + age);
        System.out.println("Gender " + gender);
        System.out.println("Married " + married);
        if (gender == 'F') {
            System.out.println("She will work only in urbon areas");
        } else if (gender == 'M' && (age >= 20 && age < 40)) {
            System.out.println("He may work anywhere");
        } else if (gender == 'M' && (age >= 40 && age <= 60)) {
            System.out.println("he will work only in urbon areas");
        } else {
            System.out.println("ERROR");
        }
    }

}
