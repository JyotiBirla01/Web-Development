
//import java.util.Date;
//import java.time.Month;
import java.time.LocalDate;
import java.util.Scanner;

class GFG {
    public static void getDayMonthYear(String date, String current) {
        LocalDate currentDate = LocalDate.parse(date);
        LocalDate currentDate1 = LocalDate.parse(current);
        int day = currentDate1.getDayOfMonth() - currentDate.getDayOfMonth();
        int year = currentDate1.getYear() - currentDate.getYear();
        int month = currentDate1.getMonthValue() - currentDate.getMonthValue();
        System.out.println("Day: " + day);
        System.out.println("Year: " + year);
        System.out.println("Month " + month);
    }

    // Driver Code
    public static void main(String args[]) {
        // Given Date
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the hired date ");
        String date = sc.next();
        System.out.println("Enter the current date ");
        String current = sc.next();

        // String date = "2020-07-18";
        // String current = "2023-09-12";

        getDayMonthYear(date, current);

    }

}
