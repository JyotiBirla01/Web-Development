
//19) Make list of Students having name, roll no., age, score. Write a program to accept 10 
// students record and arrange the Students based on the score group [0-50], [50-65],[65-80],
// [80-100].
import java.util.Scanner;

class Students {
    private int rollNo, age, score;
    private String name;

    public Students(String name, int rollNo, int age, int score) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.score = score;
    }

    public void display() {
        System.out.println("Name " + name + "");
    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students ");
        int n = sc.nextInt();
        Students s[] = new Students[n];
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            int rollNo = sc.nextInt();
            int age = sc.nextInt();
            int Score = sc.nextInt();

        }

    }
}