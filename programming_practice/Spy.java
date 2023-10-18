import java.util.Scanner;
public class Spy {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

    System.out.println("Enter the number  ");
    int n= sc.nextInt();
    int rem;
    int rev=0;
int sum=0;
int mul=1;
    while(n!=0){
        
        rem=n%10;
       sum=sum+rem;
        mul=mul*rem;
        n=n/10;
       
    }
     if(sum==mul)
 System.out.println("spy number");
    else
    System.out.println("Not spy");
     }
    
}
