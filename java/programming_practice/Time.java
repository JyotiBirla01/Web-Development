import java.util.Scanner;

public class Time {
    private int hours, minutes, seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;

    }

    public Time() {

    }

    public void addtime(Time obj1, Time obj2) {
        this.hours = obj1.hours + obj2.hours;
        this.minutes = obj1.minutes + obj2.minutes;
        this.seconds = obj1.seconds + obj2.seconds;
        if (seconds >= 60) {
            minutes++;
            seconds--;
        }
        if (minutes >= 60) {
            hours++;
            minutes--;
        }
        // return null;

    }

    public void display() {
        System.out.println("Hours :" + hours);
        System.out.println("Minutes " + minutes);
        System.out.println("Seconds " + seconds);
    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the time in hours ");
        int hours = sc.nextInt();
        System.out.println("Enter the time in minutes ");
        int minutes = sc.nextInt();
        System.out.println("Enter the time in seconds ");
        int seconds = sc.nextInt();
        System.out.println("Enter the time in hours ");
        int hours1 = sc.nextInt();
        System.out.println("Enter the time in minutes ");
        int minutes1 = sc.nextInt();
        System.out.println("Enter the time in seconds ");
        int seconds1 = sc.nextInt();
        Time obj1 = new Time(hours, minutes, seconds);
        Time obj2 = new Time(hours1, minutes1, seconds1);
        Time obj3 = new Time();
        obj3.addtime(obj1, obj2);
        obj3.display();

    }

}
