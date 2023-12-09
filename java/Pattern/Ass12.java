public class Ass12 {
    public static void main(String[] args) {
        // for (char i = 97; i <= 101; i++) {
        // for (char j = 97; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (j + 96));

            }
            System.out.println();
        }
    }

}
