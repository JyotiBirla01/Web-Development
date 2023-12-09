public class Ass45 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= 5 - i; j--) {
                System.out.print(" ");
            }
            for (int k = 5; k >= i; k--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

}
