public class Palindrom {
    public static void main(String[] args) {
        for (int i = 101; i <= 999; i++) {
            int num = i;
            int rev = 0;
            while (num != 0) {
                int rem = num % 10;
                rev = rev * 10 + rem;

                num = num / 10;
            }
            System.out.println(rev);
            if (rev == num)
                System.out.println(i + "is Palindrom");
        }

    }
}
