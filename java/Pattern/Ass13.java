
public class Ass13 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                // if ((i == j) || (i == 3 && j == 1) || (i == 4 && j == 2) || (i == 5 && j ==
                // 1) || (i == 5 && j == 3))
                if ((i + j) % 2 == 0)
                    System.out.print("1");
                else
                    System.out.print("0");
            }

            System.out.println();
        }

    }

}
