/**
**
****
*******
***********
*/



class Ass40 {
    public static void main(String[] args) {
        int s = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= s; j++) {
                System.out.print("*");

            }

            System.out.println();
            s = s + i;
        }
        //byte x =256;
       // System.out.println((byte)(256));
    }
}