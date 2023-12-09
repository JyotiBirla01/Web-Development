import java.util.Scanner;

class NotaevenException extends Exception{
   public NotaevenException(){
    super("Given number is not even");

   }
   public NotaevenException(String msg){
    super(msg);
    
   }
}

class Main
{
    public static void main(String args[]){
      try{ 
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if(n%2==1)
          throw new NotaevenException();
        else
          System.out.println("Given number is even...");               
      }
      catch(Exception e){
        e.printStackTrace();
      }
      System.out.println("At the end.....");
    }
}

