import java.util.Scanner;

class ThreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first  number n1:-  ");
        int n1 = sc.nextInt();
        System.out.println("Enter the Second  number n2:- ");
        int n2 = sc.nextInt();
        if (n1 == n2) {
            System.out.println("n1 and n2 are equal");
        } else if (n1 != n2) {
            System.out.println("n1 and n2 are not equal");
            if (n1 > n2) {
                System.out.println("n1 is greater than n2");
            } else {
                System.out.println("n2 is greater than n1");
            }
        }
    }

}
