
public class Ass36 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 6 - i; j++) {
                if ((i == 2 && j == 2) || (i == 2 && j == 3) || (i == 3 && j == 2))
                    System.out.print(" ");
                else
                    System.out.print((char) (j + 64));
            }
            System.out.println();
        }
    }

}
