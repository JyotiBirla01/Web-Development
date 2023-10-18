import java.util.Scanner;

class NotaoddException extends Exception {
    public NotaoddException() {
        super("Given number is not even");

    }

    public NotaoddException(String msg) {
        super(msg);

    }
}

class Main {
    public static void main(String args[]) {
        try {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.println("Enter the number");
            int n = sc.nextInt();
            if (n % 2 == 1)
                System.out.println("Given number is odd...");
            else

                throw new NotaoddException();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("At the end.....");
    }
}
