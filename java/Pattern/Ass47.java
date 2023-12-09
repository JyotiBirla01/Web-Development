import javax.lang.model.util.ElementScanner14;

public class Ass47 {
    public static void main(String[] args) {

        int i, j;

        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                if (i == 3 && k == 2)
                    System.out.print("*");
                else if (i == 4 && (k == 2 || k == 3))
                    System.out.print("*");
                else
                    System.out.print("1");
            }
            System.out.println();
        }

    }
}
