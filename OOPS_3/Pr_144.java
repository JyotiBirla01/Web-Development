import java.util.Scanner;

class School {
    private String[] students;
    private String[] teachers;
    private String[] classes;
    private int studentCount;
    private int teacherCount;
    private int classCount;

    public School(int maxStudents, int maxTeachers, int maxClasses) {
        students = new String[maxStudents];
        teachers = new String[maxTeachers];
        classes = new String[maxClasses];
        studentCount = 0;
        teacherCount = 0;
        classCount = 0;
    }

    public void addStudent(String studentName) {
        if (studentCount < students.length) {
            students[studentCount] = studentName;
            studentCount++;
            System.out.println("Student " + studentName + " added successfully!");
        } else {
            System.out.println("The student list is full. Cannot add more students.");
        }
    }

    public void removeStudent(String studentName) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].equals(studentName)) {
                for (int j = i; j < studentCount - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[studentCount - 1] = null;
                studentCount--;
                System.out.println("Student " + studentName + " removed successfully!");
                return;
            }
        }
        System.out.println("Student " + studentName + " not found.");
    }

    public void addTeacher(String teacherName) {
        if (teacherCount < teachers.length) {
            teachers[teacherCount] = teacherName;
            teacherCount++;
            System.out.println("Teacher " + teacherName + " added successfully!");
        } else {
            System.out.println("The teacher list is full. Cannot add more teachers.");
        }
    }

    public void removeTeacher(String teacherName) {
        for (int i = 0; i < teacherCount; i++) {
            if (teachers[i].equals(teacherName)) {
                for (int j = i; j < teacherCount - 1; j++) {
                    teachers[j] = teachers[j + 1];
                }
                teachers[teacherCount - 1] = null;
                teacherCount--;
                System.out.println("Teacher " + teacherName + " removed successfully!");
                return;
            }
        }
        System.out.println("Teacher " + teacherName + " not found.");
    }

    public void createClass(String className) {
        if (classCount < classes.length) {
            classes[classCount] = className;
            classCount++;
            System.out.println("Class " + className + " created successfully!");
        } else {
            System.out.println("The class list is full. Cannot create more classes.");
        }
    }

    public void printData() {
        System.out.println("\nSchool Data:");
        System.out.println("Students:");
        for (int i = 0; i < studentCount; i++) {
            System.out.println(students[i]);
        }
        System.out.println("\nTeachers:");
        for (int i = 0; i < teacherCount; i++) {
            System.out.println(teachers[i]);
        }
        System.out.println("\nClasses:");
        for (int i = 0; i < classCount; i++) {
            System.out.println(classes[i]);
        }
    }
}

 class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the maximum number of students: ");
        int maxStudents = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter the maximum number of teachers: ");
        int maxTeachers = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter the maximum number of classes: ");
        int maxClasses = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        School school = new School(maxStudents, maxTeachers, maxClasses);

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Add a student");
            System.out.println("2. Remove a student");
            System.out.println("3. Add a teacher");
            System.out.println("4. Remove a teacher");
            System.out.println("5. Create a class");
            System.out.println("6. Print school data");
            System.out.println("7. Quit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String studentName = scanner.nextLine();
                    school.addStudent(studentName);
                    break;
                case 2:
                    System.out.print("Enter student name to remove: ");
                    String removeStudentName = scanner.nextLine();
                    school.removeStudent(removeStudentName);
                    break;
                case 3:
                    System.out.print("Enter teacher name: ");
                    String teacherName = scanner.nextLine();
                    school.addTeacher(teacherName);
                    break;
                case 4:
                    System.out.print("Enter teacher name to remove: ");
                    String removeTeacherName = scanner.nextLine();
                    school.removeTeacher(removeTeacherName);
                    break;
                case 5:
                    System.out.print("Enter class name: ");
                    String className = scanner.nextLine();
                    school.createClass(className);
                    break;
                case 6:
                    school.printData();
                    break;
                case 7:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }}
}