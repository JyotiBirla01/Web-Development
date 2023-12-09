import java.util.Scanner;

class Marksheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Hindi :-");
        float hindi = sc.nextFloat();
        System.out.println("Enter the number of English :-");
        float english = sc.nextFloat();
        System.out.println("Enter the number of Maths :-");
        float maths = sc.nextFloat();
        System.out.println("Enter the number of Science :-");
        float science = sc.nextFloat();
        System.out.println("Enter the number of Sanskrit :-");
        float sanskrit = sc.nextFloat();
        float total = (hindi + english + maths + science + sanskrit);
        float per = (total / 500) * 100;
        System.out.println("The percentage is :- " + per + " %");
        String div = (per > 60) ? "You are passed with 1st division "
                : (per > 50 && per < 59) ? " Second division" : (per > 33 && per < 49) ? "Third division" : "Failed ";
        System.out.println("Division is  :- " + div);

    }

}
