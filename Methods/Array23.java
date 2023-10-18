// Q.22) C program to find nearest lesser and greater element in array
// Given an array of N elements and we have to find nearest lesser and nearest greater 
//element using C program.
// Example:
//     Input:
//     Enter the number of elements for the arrray : 3  

//     Enter the elements for array_1.. 
//     array_1[0] : 1   
//     array_1[1] : 2   
//     array_1[2] : 3   

//     Enter the number : 2 

//     Output:
//     Element lesser than 2 is : 1 
//     Element greater than 2 is : 3

import java.util.Scanner;

public class Array23 {
    public void NearestLesserAndGre(int n, int a[], int number) {
        for (int i = 1; i < a.length; i++) {
            if (a[i] == number) {
                if (a[i] > a[i - 1] || a[i] < a[i + 1]) {
                    System.out.println("Element lesser than " + number + " is : " + a[i - 1]);
                    System.out.println("Element Greater than " + number + " is : " + a[i + 1]);
                } else
                    System.out.println("Enter the correct number ");

            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements in array ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the number ");
        int number = sc.nextInt();
        Array23 obj = new Array23();
        obj.NearestLesserAndGre(n, a, number);

    }
}
