//      1 
//    1 2 1
//  1 2 3 2 1
// 1 2 3 4 3 2 1

class p1 {
    public static void main(String[] args) {
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= 5 - i; j++) {
        // System.out.print(" ");
        // }
        // for (int k = 1; k <= i; k++) {
        // System.out.print(k+" ");
        // }
        // for (int k = i-1; k >= 1; k--) {
        // System.out.print(k+" ");
        // }
        // System.out.println();
        // }
        int temp = 0;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) 
                System.out.print(++temp);
               temp=temp-1;
            
            for(int j=1; j<=i-1; j++)
                System.out.print(temp--);
                
            
            System.out.println();
        }
    }
}