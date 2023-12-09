import java.util.Scanner;

public class CommonEleIn3Array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n1=sc.nextInt();

        int n2=sc.nextInt();
        int n3=sc.nextInt();
        int a[]= new int[n1];
        int b[]= new int[n2];
        int c[]= new int[n3];
        for (int i = 0; i < n1; i++) {
            a[i]=sc.nextInt();
        }
        for (int i = 0; i < n2; i++) {
            b[i]=sc.nextInt();
        }
        for (int i = 0; i < n3; i++) {
            c[i]=sc.nextInt();
        }

        // for (int i = 0; i < arr1.length; i++) {
        //     for (int j = 0; j < arr2.length; j++) {
        //         for (int k = 0; k < arr3.length; k++) {
        //             if ((arr1[i] == arr2[j]) && (arr2[j] == arr3[k]) && (arr1[i] == arr3[k])) {
        //                 System.out.println(arr1[i]);
 
        //                 break;
        //             }

        //         }
        //     }
        // }
        int i=0,j=0,k=0;
        while(i<n1 && j<n2 && k<n3){
            if(a[i]==b[j] && b[j]==c[k]){
                System.out.println("Common element is "+a[i]);
                i++;
                j++;
                k++;

            }
            else if(a[i]>b[j])
                j++;
            else if(b[j]>c[k])
            k++;
            else
            i++;
        }

    }

}
