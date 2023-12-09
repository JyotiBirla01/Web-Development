import java.util.ArrayList;
import java.util.Scanner;

public class SubArray {
    static void subArray(ArrayList<Integer > al ) {
for (int i = 0; i < al.size(); i++) {
    for (int j = i; j < al.size(); j++) {
        for (int j2 = i; j2 <= j; j2++) {
         System.out.print(al.get(j2)+" ");   
        }
        System.out.println();
    }
}
    }

    public static void main(String[] args) {
        System.out.println("Enter the elements ");
        ArrayList<Integer> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("To exit enter 0 ");
        while (true) {

            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            al.add(n);

        }
        subArray(al);
    }
}
