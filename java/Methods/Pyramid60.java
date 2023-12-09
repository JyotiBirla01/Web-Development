//     X 
//    X X 
//   X__X
//  X____X
// X X X X X

import java.util.Scanner;

public class Pyramid60 {
    public static void hollowPyramid(int n) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                if (i == 3 && k == 2)
                    System.out.print("_ ");
                else if (i == 4 && (k == 2 || k == 3))
                    System.out.print("_ ");
                else
                    System.out.print("X" + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();

        hollowPyramid(n);
    }

}
