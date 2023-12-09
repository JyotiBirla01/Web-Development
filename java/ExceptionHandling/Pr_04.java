import java.util.Scanner;

class NotaPrimenumberException extends Exception {
  public NotaPrimenumberException() {
    super("Given number is not even");

  }

  public NotaPrimenumberException(String msg) {
   super(msg);
  // System.out.println("Enter only prime number");

  }
}

class Main {
  public static void main(String args[]) {
  
      java.util.Scanner sc = new java.util.Scanner(System.in);
      System.out.println("Enter the number..");
      int n = sc.nextInt();
      int c = 0;
      boolean flag = false;
      try{
      for (int i = 2; i <= n / 2; i++) {
        if (n % i == 0) {
        throw new NotaPrimenumberException();
        
    }
      }
      if (c == 0)
        System.out.println("Given number is prime");
  
    } 
  
    catch (Exception e) {
      e.printStackTrace();
}
}
}