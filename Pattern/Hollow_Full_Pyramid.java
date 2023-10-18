public class Hollow_Full_Pyramid {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                if (i == 6 || i + k == 7 || k - i == 5)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}
