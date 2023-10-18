public class Ass22 {
    public static void main(String[] args) {

        // for (char i = 65; i <= 69; i++) {
        // for (char j = 65; j <= i; j++) {
        // if (i == 65 || i == 66 || i == 69 || (i == 67 && j == 65) || (i == 67 && j ==
        // 67)
        // || (i == 68 && j == 65) || (i == 68 && j == 68))
        // System.out.print(j);
        // else
        // System.out.print(" ");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i == 3 && j == 2))
                    System.out.print(" ");
                else if (i == 4 && (j == 2 || j == 3))
                    System.out.print((" "));
                else
                    System.out.print((char) (j + 64));

            }
            System.out.println();
        }

    }
}
