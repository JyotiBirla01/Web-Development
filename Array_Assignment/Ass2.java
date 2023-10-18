
// wap to ask 5 names from user and check if particular name exists in array or not .
import java.util.Scanner;

public class Ass2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String arr[] = new String[5];

        System.out.println("Enter the Name");

        for (int i = 0; i < 5; i++) {

            arr[i] = sc.nextLine();
        }

        System.out.println("Enter the name which exit in array ");
        String name = sc.nextLine();
        int ans = -1;
        for (int i = 0; i < 5; i++) {
            if (arr[i] == name) {
                ans = i;

            }

        }
        System.out.println("The name " + name + " at index " + ans);
        else
        System.out.println("Not found ");

    }

}
