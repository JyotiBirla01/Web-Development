
//
//Q.2 Find minimum and maximum element in array
import java.util.ArrayList;
import java.util.Scanner;

public class Ass02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
         int n=sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>(n);
        System.out.println("Enter the elemets ");

       for (int i = 0; i <n; i++) {
            al.add(sc.nextInt());
       }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i) > max)
                max = al.get(i);
            if (al.get(i) < min)
                min = al.get(i);
        }
        System.out.println(" Maximum value is " + max);
        System.out.println(" Minimum value is " + min);

    }

}
