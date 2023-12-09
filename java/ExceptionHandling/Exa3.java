import java.util.Scanner;

public class Exa3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {

            String s = "example";
            String substring = s.substring(2, 8);

            System.out.println(s.charAt(9));
        }

        catch (StringIndexOutOfBoundsException s) {
            System.out.println("String index is out of size ");

        }

    }

}