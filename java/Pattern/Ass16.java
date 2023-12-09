
class Ass16 {
    public static void main(String[] args) {
        int n = 1;
        for (char i = 97; i <= 112; i++) {
            for (char j = 97; j <= i; j++) {
                System.out.print(i);
                n++;
            }
            System.out.println();
        }
    }
}