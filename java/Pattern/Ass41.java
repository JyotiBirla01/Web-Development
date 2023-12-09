public class Ass41 {
    public static void main(String[] args) {
        char ch = 65;
        for (char i = 65; i <= 68; i++) {
            for (char j = 65; j <= 2 * i - 65; j++) {
                System.out.print(ch);
                ch++;

            }
            System.out.println();
        }
    }

}
