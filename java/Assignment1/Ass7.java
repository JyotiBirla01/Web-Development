import java.util.Scanner;

class SI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rate :- ");
        float rate = sc.nextFloat();
        System.out.println("Enter the principle :- ");
        float principle = sc.nextFloat();
        System.out.println("Enter the time :- ");
        float time = sc.nextFloat();
        float si = (rate * principle * time) / 100;
        System.out.println("The Simple interest is " + si);

    }

}
