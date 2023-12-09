import java.util.Scanner;

class Student {
    private String ExamName;
    private String StudentName;
    private String Status;
    private String EnrollNo;
    private String FatherName;
    private String CollageName;
    String result;

    public Student() {

    }

    public Student(String examName, String studentName, String status, String enrollNo, String fatherName,
            String collageName) {
        ExamName = examName;
        StudentName = studentName;
        Status = status;
        EnrollNo = enrollNo;
        FatherName = fatherName;
        CollageName = collageName;
    }

    public String getExamName() {
        return ExamName;
    }

    public String getStudentName() {
        return StudentName;
    }

    public String getStatus() {
        return Status;
    }

    public void setExamName(String examName) {
        ExamName = examName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public void setEnrollNo(String enrollNo) {
        EnrollNo = enrollNo;
    }

    public void setFatherName(String fatherName) {
        FatherName = fatherName;
    }

    public void setCollageName(String collageName) {
        CollageName = collageName;
    }

    public String getEnrollNo() {
        return EnrollNo;
    }

    public String getFatherName() {
        return FatherName;
    }

    public String getCollageName() {
        return CollageName;
    }

    Scanner sc = new Scanner(System.in);

    public void displayMarksheet() {
        int n = 8;
        // System.out.println("enter the total subject count");
        // int n = sc.nextInt();
        System.out.println("enter the subject");
        String Subject[] = new String[n];

        // user enter the SUBJECT;
        for (int i = 0; i < n; i++) {
            System.out.println("enter the SUBJECT " + (i + 1) + "name");
            Subject[i] = sc.next();
        }

        // user enter the marks:
        System.out.println("enter the Maxmarks");
        int Maxmark[] = new int[n];
        for (int i = 0; i < Maxmark.length; i++) {
            System.out.println("MaxMArk" + (i + 1) + "mark");
            Maxmark[i] = sc.nextInt();
        }

        // ENTER THE PASSING MARKS.
        System.out.println("enter the passing_Mark");
        int passing_Mark[] = new int[n];
        for (int i = 0; i < passing_Mark.length; i++) {
            System.out.println("passing_mark" + (i + 1));
            passing_Mark[i] = sc.nextInt();
        }

        System.out.println("enter the Examname");
        String ExamName = sc.nextLine();
        String ExamName1 = sc.nextLine();

        System.out.println("enter the Student name");
        String StudentName = sc.nextLine();

        System.out.println("enter the Status");
        String Status = sc.nextLine();

        System.out.println("enter the enrollNo");
        String EnrollNo = sc.nextLine();

        System.out.println("ENTER FATHERS NAME");
        String FatherName = sc.next();

        System.out.println("enter the collage name");
        String CollageName = sc.next();

        int totalMark = 0;
        int passingMark = 0;

        for (int i = 0; i < Maxmark.length; i++) {
            totalMark += Maxmark[i];
            passingMark += passing_Mark[i];
        }

        String red = "\u001B[31m";
        String reset = "\u001B[0m";
        String blue = "\u001B[33";
        String bluelast = "\u001B[0m";

        boolean hasATKT = false;

        // condition checks if mark is between 0 and 17 inclusive
        for (int mark : passing_Mark) {
            if (mark >= 0 && mark <= 17) {
                hasATKT = true;
                break;
            }
        }

        result = hasATKT ? red + "ATKT" + reset : "PASS";
    }
}