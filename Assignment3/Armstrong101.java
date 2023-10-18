public class Armstrong101 {
    public static void main(String[] args) {
        for (int i = 101; i <= 999; i++) {
            int num = i;
            int sum = 0, cube;
            while (num != 0) {
                int rem = num % 10;
                cube = rem * rem * rem;
                sum = sum + cube;
                num = num / 10;
            }
            if (sum == i)
                System.out.println(i + "is armstrong");
        }
    }

}
