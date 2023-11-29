

// 55555
// 4__4
// 3_3
// 22
// 1

public class Java {
    public static void main(String[] args) {
        for (int  i =1; i <= 4; i++) {
            for (int  j = 1; j <= 5; j++) {
                if((i==4)||(i==1)||(j==1)||(j==3))
               System.out.print("*");
               else
               System.out.print(" ");
            }
           System.out.println();
        }
    }
}
