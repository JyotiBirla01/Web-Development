public class Ass19 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                // if (i == 1 || i == 2 || i == 5 || (i == 3 && j == 1) || (i == 3 && j == 3) ||
                // (i == 4 && j == 1)
                // || (i == 4 && j == 4))
                // System.out.print("*");
                // else
                // System.out.print(" ");
                if ((i == 3 && j == 2))
                    System.out.print(" ");
                else if (i == 4 && (j == 2 || j == 3))
                    System.out.print(" ");
                else
                    System.out.print("*");

            }
            System.out.println();
        }
    }
}
