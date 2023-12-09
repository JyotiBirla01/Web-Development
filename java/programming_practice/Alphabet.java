
import java.util.Scanner;

class Alphabet {
    public void check(char letter) {
        switch (letter) {
            case 'a':

            case 'e':

            case 'i':

            case 'o':

            case 'u':

            case 'A':

            case 'E':

            case 'I':

            case 'O':

            case 'U':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }

    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the letter");
        char letter = sc.next().charAt(0);
        Alphabet obj = new Alphabet();
        obj.check(letter);

    }
}
