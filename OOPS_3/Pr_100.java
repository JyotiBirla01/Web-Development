//. Write a Java program to create a class called "Student" with a name, grade, and courses attributes, and methods to add and remove courses.

// 10. Write a Java program to create a class called "Student" with a name, grade, and courses attributes, and methods to add and remove courses.
import java.util.Scanner;

class Student {
    private String name;
    private int grade;
    private String course[] = new String[100];

    public Student(String courses[], String name, int grade) {
        this.name = name;
        this.grade = grade;
        for (int i = 0; i < courses.length; i++)
            course[i] = courses[i];
    }

    public void add(String addcourse) {
        for (int i = 0; i < course.length; i++)
            if (course[i] == null) {
                course[i] = addcourse;
                break;
            }
    }

    public void remove(String removecourse) {
        int k = 0;
        for (int i = 0; i < course.length; i++)
            if (course[i] != removecourse) {
                course[k] = course[i];
                k++;
            } else if (course[i] == null) {
                break;
            }
    }

    public void print() {
        System.out.println("Name of Student : " + name);
        System.out.println("Grades : " + grade);
        System.out.println("Subject Names are : ");
        for (int i = 0; i < course.length; i++) {
            if (course[i] == null)
                break;
            System.out.println(course[i]);
        }
        System.out.println();
    }

}

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String books[] = new String[100];
        books[0] = "Hindi";
        books[1] = "English";
        books[2] = "Science";
        Student obj = new Student(books, "Raghav", 10);
        System.out.println("Collection of courses");
        obj.print();
        obj.add("Maths");
        System.out.println("After adding new course in syllabus ");
        obj.print();
        obj.remove("Science");
        System.out.println("After removing book from syllabus ");
        obj.print();

    }
}