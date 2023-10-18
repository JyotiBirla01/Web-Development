public class Multi1 {

    public static void main(String[] args) {
        int a[][] = new int[4][3];
        a[0][0] = 1;
        a[0][1] = 2;
        a[0][2] = 3;
        a[1][0] = 4;
        a[1][1] = 1;
        a[1][2] = 2;
        a[2][0] = 1;
        a[2][1] = 2;
        a[2][2] = 3;
        a[3][0] = 4;
        a[3][1] = 1;
        a[3][2] = 2;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}