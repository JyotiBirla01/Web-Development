class Ass60 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 6 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                if (i == 3 && k == 2)
                    System.out.print("_ ");
                else if (i == 4 && (k == 2 || k == 3))
                    System.out.print("_ ");
                else
                    System.out.print("X ");
            }
            System.out.println();
        }
    }

}