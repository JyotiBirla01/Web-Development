class Ass38 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= (6 - i); j--) {

                if ((i == 2 && j == 2) || (i == 2 && j == 3) || (i == 3 && j == 2))
                    System.out.print(" ");
                else
                    System.out.print(i);

            }
            System.out.println();
        }
    }
}