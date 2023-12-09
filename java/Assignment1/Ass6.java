import java.util.Scanner;

class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number  :-");
        float num1 = sc.nextFloat();
        System.out.println("Enter the  second number  :-");
        float num2 = sc.nextFloat();
        System.out.println("Enter the third  number  :-");
        float num3 = sc.nextFloat();
        System.out.println("Enter the fourth  number :-");
        float num4 = sc.nextFloat();
        System.out.println("Enter the  fifth number  :-");
        float num5 = sc.nextFloat();
        float ave = (num1 + num2 + num3 + num4 + num5) / 5;
        System.out.println("The average of number  is :- " + ave);

    }

}
