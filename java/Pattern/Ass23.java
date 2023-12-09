public class Ass23 {
    public static void main(String[] args) {
        int c = 97;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == j || i == 5 || j == 1) {
                    System.out.print((char) (c));
                    c++;
                } else {
                    System.out.print(" ");
                    c++;
                }
            }
            System.out.println();
        }
    }
}
