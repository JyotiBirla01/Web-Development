import java.util.Scanner;
 class Test {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

    System.out.println("Enter the number  ");
    int n= sc.nextInt();
    int temp=n;
    int mul= n*n;
    int last=0;
    
        last=mul%10;
        System.out.println(last);
    
    if(last==temp){
        System.out.println("Automorphism");

    }
    else
    System.out.println("Not automorphism");
   


    }
    
}
