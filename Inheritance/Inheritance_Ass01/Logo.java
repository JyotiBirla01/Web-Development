import java.util.Scanner;

public class Logo {
    public static void main(String[] args) {

        String resetY = "\u001B[32m";
        String set = "\u001B[0m";
        String yellow = "\u001B[0m";
        String yellowColor = "\u001B[33m";

        System.out.println(resetY + "  *****" + set);
        System.out.println(resetY + " **   **" + set);
        System.out.println(resetY + "**     **" + set);
        System.out.println(resetY + "*       *" + set);
        System.out.println(resetY + "*" + yellowColor + "DAVV" + yellow + "  *" + set);
        System.out.println(resetY + "*       *" + set);
        System.out.println(resetY + "**     **" + set);
        System.out.println(resetY + " **   **" + set);
        System.out.println(resetY + "  *****" + set);

        System.out.println(yellowColor + "  *****" + yellow);
        System.out.println(yellowColor + " **   **" + yellow);
        System.out.println(yellowColor + "**     **" + yellow);
        System.out.println(yellowColor + "*       *" + yellow);
        System.out.println(yellowColor + "*" + resetY + "  DAVV " + set + yellowColor + "*" + yellow);
        System.out.println(yellowColor + "*       *" + yellow);
        System.out.println(yellowColor + "**     **" + yellow);
        System.out.println(yellowColor + " **   **" + yellow);
        System.out.println(yellowColor + "  *****" + yellow);
        String b = "\u001B[0m";
        String bg = "\u001B[47m";
        System.out.println(bg + "Hello" + bg);

    }
}