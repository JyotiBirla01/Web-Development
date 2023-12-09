public class Ass73 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 5; k >= 6 - i; k--) {
                System.out.print(i + " ");
            }
            System.out.println();

        }
    }

}
