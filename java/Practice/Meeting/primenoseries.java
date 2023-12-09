import java.util.Scanner;

public class primenoseries {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
       
    for (int i = 1; i <= n; i++) {
         boolean flag= false;
        for(int j=2; j<=i/2; j++){
       if(i%j==0){
        flag=true;
        break;
       } 
    }if(flag==false && i>1)
    System.out.println(i);
}
    
    
    }
}
