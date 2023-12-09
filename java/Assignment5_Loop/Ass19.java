import java.util.Scanner;

class Ass19 {
    public static void main(String [] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n= sc.nextInt();
        float sum=0;
        for(int i=1; i<=n; i++){
        sum=sum+(1/i);


        }
        System.out.println("The sum of series is "+sum);
    }
}