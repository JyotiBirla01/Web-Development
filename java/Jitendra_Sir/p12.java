public class p12 {
    public static void main(String[] args) {
        boolean s = true;

        int n = 12345;
        while (n != 0) {
            int ld = n % 10;
            int n1 = n / 10;
            while (n1 != 0) {
                int t = n1 % 10;
                if (t == ld) {
                    s = false;

                    break;
                }
                n1=n/10;

            }
            if(s==false){
                System.out.println("No");
                break;
            }
            n=n/10;

        }
        if(s){
            System.out.println("YES");
        }
    }
}
