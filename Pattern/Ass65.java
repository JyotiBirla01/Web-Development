public class Ass65 {
    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++) {
            int num = 1;
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            num = 1;
            for (int k = 0; k <= i; k++) {
                System.out.print(num + " ");
                num = num * (i - k) / (k + 1);

            }
            System.out.println();
        }
    }

}
