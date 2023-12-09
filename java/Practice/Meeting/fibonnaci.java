import java.util.Scanner;

public class fibonnaci  {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
       int a=-1,b=1;
       int c;
      for(int i=0; i<n; i++) {
        c=a+b;
        a=b;
        b=c;
        System.out.println(c);
      }
    }
}