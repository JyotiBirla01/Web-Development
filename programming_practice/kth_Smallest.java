import java.util.Arrays;
import java.util.Scanner;

class A{
   static  int min=Integer.MAX_VALUE;
    public  void  m1(int arr[], int n,int k){
        Arrays.sort(arr);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Array"+arr[i]);
            if(arr[i]<min){
                min=arr[i];

            }
        }
      //  return arr[k];
      System.out.println(arr[k]);

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size");
        int n=sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the elements ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value of k");
        int k=sc.nextInt();
        //System.out.println(m1(arr,n,k));
        A obj= new A();
        obj.m1(arr, n, k);
        //System.out.println(obj.m1(arr,n,k));
    }
}