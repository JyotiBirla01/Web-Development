class Ass68 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {
                if (i == k)
                    System.out.print("#");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }

}