import java.util.Scanner;

class Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :-");
        int num1 = sc.nextInt();
        System.out.println("Enter the second  number :-");
        int num2 = sc.nextInt();
        String x = num1 == num2 ? "Equal" : "Not equal";
        System.out.println(x);
        int max = num1 > num2 ? num1 : num2;
        System.out.println("The maximum number is :- " + max);
    }

}
