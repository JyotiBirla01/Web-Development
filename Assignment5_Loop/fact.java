import java.util.Scanner;

public class fact {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = sc.nextInt();
        int tempnumber = number;
        int sum = 0;
        while (tempnumber > 0) {
            int digit = tempnumber % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
            tempnumber = tempnumber / 10;
        }
        if (number == sum)
            System.out.println(sum + " is a Strong number ");
        else
            System.out.println(sum + " is not Strong number ");
    }
}