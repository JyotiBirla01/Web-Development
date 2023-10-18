//7 wap to search a particular number in given array and print its position.
public class Ass7 {
    public static void main(String[] args) {
        int arr[] = { 1, 76, 54, 89, 43, 56 };
        int x = 76;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                System.out.println("The number found at index " + i);
            }

        }

    }

}
