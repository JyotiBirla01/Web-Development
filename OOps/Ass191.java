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

    public void studentArrange() {
        if (this.score >= 0 && this.score >= 50)
            System.out.println(this.name);
    }

    public void display() {
        System.out.println("Name  " + name + "\nRoll Number " + rollNo + "\nAge " + age + "\nScore " + score);
    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Students a[] = new Students[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the " + (i + 1) + " name");
            String name = sc.next();
            System.out.println("Enter the " + (i + 1) + " rollNo");
            int rollNo = sc.nextInt();
            System.out.println("Enter the " + (i + 1) + " age");
            int age = sc.nextInt();
            System.out.println("Enter the " + (i + 1) + " score");
            int score = sc.nextInt();
            a[i] = new Students(name, rollNo, age, score);
        }
        for (int j = 0; j < a.length; j++) {
            a[j].display();

        }
    }
}
