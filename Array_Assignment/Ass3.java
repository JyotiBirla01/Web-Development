//3 wap to define an array of integer and assign value in program and print sum of all values.
public class Ass3 {
    public static void main(String[] args) {
        int sum = 0;
        int arr[] = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }
        System.out.println("The sum of number is " + sum);
    }

}
