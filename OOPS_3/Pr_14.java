/*14. Write a Java program to create a class called "School" with attributes for students, teachers, and classes, and 
methods to add and remove students and teachers, and to create classes.
 */

import java.util.Scanner;

class School {
    private String teachers[];
    private String students[];
    private String classes[];
    private int studentsCount=0,teachersCount=0 , classesCount=0;
    
public School(int noStudents, int noTeachers, int noclasses){
students= new String[noStudents];
teachers= new String[noTeachers];
classes= new String[noclasses];
}
public void addStudents(String studentName){
    if(studentsCount<students.length){
        students[studentsCount]=studentName;
        studentsCount++;
        System.out.println(studentName+" addded as a student name ");

    }

}
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int noStudents = sc.nextInt();
        System.out.println("Enter the number of teachers ");
        int noTeachers = sc.nextInt();
        System.out.println("Enter the number of classes");
        int noclasses = sc.nextInt();
        School school = new School(noStudents, noTeachers, noclasses);
        boolean flag= true;
        while (true) {
            System.out.println(" \n Options : ");
            System.out.println(" 1. Add a Student ");
            System.out.println(" 2. Remove  a Student ");
            System.out.println(" 3. Add a Teacher  ");
            System.out.println(" 4. Remove a Teacher  ");
            System.out.println(" 5. Create a class  ");
            System.out.println(" 6. Exit ");
            System.out.println("Enter your choice ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Student name ");
                    String studentName = sc.next();
                    break;
                case 2:
                    System.out.println("Enter Student name  to remove ");
                    String removeStudentName = sc.next();
                    break;
                case 3:
                    System.out.println("Enter  Teacher name ");
                    String TeacherName = sc.next();
                    break;
                case 4:
                    System.out.println("Entert Teacher name to remove ");
                    String removeTeacherName = sc.next();
                    break;
                case 5:
                    System.out.println("Enter the class name ");
                    String className = sc.next();
                    break;
                case 6:
                    flag= false;

                    System.out.println("Exit ");
                    default :
                    System.out.println("Inalide option");
            }
        }
    }
}