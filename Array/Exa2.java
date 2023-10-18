import java.util.Scanner;

public class Exa2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arr[] = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the Name ");
            arr[i] = sc.nextLine();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " Name :- " + arr[i]);
        }

    }

}
