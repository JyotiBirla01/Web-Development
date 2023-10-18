import java.util.Scanner;

class Notapositivenumber extends Exception {
    public Notapositivenumber() {
        super("Given number is not postive");

    }

    public Notapositivenumber(String msg) {
        super(msg);

    }
}

class Main {
    public static void main(String args[]) {
        try {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.println("Enter the number");
            int n = sc.nextInt();
            if (n < 0)
                throw new Notapositivenumber();
            else
                System.out.println("Given number is positive...");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("At the end.....");
    }
}