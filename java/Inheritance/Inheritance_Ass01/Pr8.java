 
/*8) Create a class Student with two members : rollno and percentage.
	Create default and parameterized constructors. Create method show() to 	display information.
	Create another class CollegeStudent inherits Student class. Add a new membersemester to it.
     Create default and parameterized constructors. Also override show() method.
	Create another class SchoolStudent inherits Student class. Add a new memberclassname
    (eg 12 th ,10 th etc.) to it. Create default and parameterized 	constructors. Also override 
    show() method.
	Create a class(say XYZ) with main method that carries out the operation of the project :
has array to store objects of any class(Student or CollegeStudent, SchoolStudent).
create two CollegeStudent and three SchoolStudent record objects and store 	them inside the array.
display all record from the array.
search record on the basic of rollno and check given rollno is of SchoolStudent or of 
CollegeStudent.count how many students are having A grade,if for A grade percentage >75.
 */
import java.util.Scanner;

class Student {
    private int rollno;
    private float percentage;

    public Student() {

    }

    public Student(int rollno, float percentage) {
        this.rollno = rollno;
        this.percentage = percentage;

    }

    public void show() {
        System.out.println("Roll Number " + rollno);
        System.out.println("Percentage " + percentage);
    }

}

class CollegeStudent extends Student {
    private int semester;

    public CollegeStudent() {

    }

    public CollegeStudent(int rollno, float percentage, int semester) {
        super(rollno, percentage);
        this.semester = semester;

    }

    public void show() {
        super.show();
        System.out.println("Semester " + semester);
    }
}

class SchoolStudent extends Student {
    private int className;

    public SchoolStudent() {

    }

    public SchoolStudent(int rollno, float percentage, int semester, int className) {
        super(rollno, percentage);
        this.className = className;
    }

    public void show() {
        super.show();
        System.out.println("Class Name" + className);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        SchoolStudent obj[] = new SchoolStudent[n];
        for (int i = 0; i < obj.length; i++) {
            System.out.println("Enter ther roll number  ");
            int rollno = sc.nextInt();
            System.out.println("Enter the percentage");
            float percentage = sc.nextFloat();
            System.out.println("Enter the semester");
            int semester = sc.nextInt();
            System.out.println("Enter the class name ");
            int className = sc.nextInt();
            obj[i] = new SchoolStudent(rollno, percentage, semester, className);
        }

    }
}