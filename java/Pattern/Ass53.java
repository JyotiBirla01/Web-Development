
public class Ass53 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 5; k >= 6 - i; k--) {
                if (i == 4 && (k == 3 || k == 4))
                    System.out.print("_");
                else if (i == 3 && k== 4)
                    System.out.print("_");
                else
                    System.out.print(i);
            }
            System.out.println();
        }
    }

}
