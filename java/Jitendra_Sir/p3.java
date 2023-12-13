//     1
//    3 2
//   5 4 3
//  7 6 5 4
// 9 8 7 6 5

public class p3 {
    public static void main(String[] args) {
        int temp = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(temp + " ");
                temp--;

            }
            temp = 2 * i + 1;
            System.out.println();
        }
    
        }

   }

