import java.util.Scanner;

class Semester {
    private int t[] = new int[6];
    private int p[] = new int[2];
    private int ti[] = new int[4];
    private String s[] = new String[6];
    private String sp[] = new String[2];
    private String si[] = new String[4];
    private String status = "Pass";
    private String back[] = new String[2];
    private int ind = 0;
    private int total = 0;
    private int attempt = 1;
    private String sem;

    public Semester(int t[], int p[], int ti[], String s[], String sp[], String si[], String sem) {
        this.sem = sem;
        for (int i = 0; i < 2; i++) {
            this.p[i] = p[i];
            this.sp[i] = sp[i];
            total += p[i];
        }
        for(int i=0; i<4; i++){
            this.si[i]=si[i];
            this.ti[i]=ti[i];
            total +=ti[i];
        }
        for (int i = 0; i < 6; i++) {
            this.t[i] = t[i];
            this.s[i] = s[i];
            total += t[i];
            if ((s[i].equals(sp[0]) || s[i].equals(sp[1])) && t[i] < 17) {
                if (ind == 2) {
                    status = "Fail";
                    continue;
                }
                status = "ATKT";
                back[ind] = s[i];
                ind++;
            }
            if ((!s[i].equals(sp[0]) && !s[i].equals(sp[1])) && t[i] < 13) {
                if (ind == 2) {
                    status = "Fail";
                    continue;
                }
                status = "ATKT";
                back[ind] = s[i];
                ind++;

            }

        }
    }

    public int numberOfBacks() {
        return ind;
    }

    public String[] backSubjects() {
        return back;
    }

    public void setMarks(int marks[]) {
        attempt++;
        for (int j = 0; j < ind; j++) {
            for (int i = 0; i < 6; i++) {
                if (back[j].equals(s[i])) {
                    if ((s[i].equals(sp[0]) || s[i].equals(sp[1])) && marks[j] >= 17) {
                        status = "Pass";
                    }
                    if ((!s[i].equals(sp[0]) && !s[i].equals(sp[1])) && marks[j] >= 13) {
                        status = "Pass";

                    }

                    total -= t[i];
                    t[i] = marks[j];
                    total += t[i];
                }
            }
        }
    }

    public String status() {
        return status;
    }
    public void showHeader(){
        System.out.println(
                "------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t  RESULT");
        System.out.println(
                "------------------------------------------------------------------------------------------------------");
        System.out.println(
                "______________________________________________________________________________________________________");

        System.out.println("|Exam Name:     |" + "B.C.A. "+sem+"  |" + "Enrollment No:     |" + "DX2006463          |"
                + "Roll No.:       10325462" + " |");
        System.out.println("|Name:          |" + "Kum Shruti Jaiswal" + "                |" + "Father's Name:     |"
                + "ANIL JAISWAL" + "             |");
        System.out.println("|Status:        |" + "REGULAR       |"
                + "College:           |IDYLLIC INSTITUTE OF MANAGEMENT" + "              |");
        System.out.println(
                "______________________________________________________________________________________________________");
                System.out.println();
    }
    public void showMiddle(){
        String ANSI_RED = "\u001B[31m";
        String ANSI_RESET = "\u001B[0m";
        System.out.print("|\t\tSubject\t\t");
        
        System.out.println("|\tMax Marks\t|\tMarks Obtained\t|");
        System.out.println("|\t\t\t\t\t   __________________________________________________________");
        System.out.println("|\t\t\t\t\t   | I | II | III | Total | I | II | III | Total |");
        
       
       
        for (int i = 0; i < 6; i++) {
            System.out.print(s[i]);
            for (int x = s[i].length(); x < 24; x++) {
                System.out.print(" ");
            }
            if (s[i].equals(sp[0]) || s[i].equals(sp[1])) {
                System.out.print("T\t50\t\t" + t[i] + "    ");
            } else {
                System.out.print("T\t40\t\t" + t[i] + "    ");
            }
            if (status.equals("ATKT") && (s[i] == back[0] || s[i] == back[1])) {
                System.out.print(ANSI_RED + "ATKT" + ANSI_RESET);
            }
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            System.out.print(si[i]);
            for (int x = si[i].length(); x < 24; x++) {
                System.out.print(" ");
            }
            System.out.println("P\t10\t\t" + ti[i]);
        }
        for (int i = 0; i < 2; i++) {
            System.out.print(sp[i]);
            for (int x = sp[i].length(); x < 24; x++) {
                System.out.print(" ");
            }
            System.out.println("P\t25\t\t" + p[i]);
        }
    }



    public void show2(int total[]) {
        for (int i = 0; i < 5; i++) {
            System.out.print("SEMESTER-" + (i + 1));
            for (int x = 10; x < 24; x++) {
                System.out.print(" ");
            }
            System.out.println("T\t350\t\t" + total[i]);
        }
    }
    }



class Marksheet {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t[] = new int[6];
        int p[] = new int[2];
        int ti[] = new int[4];
        System.out.println("Enter marks for 1st semester : ");
        String s[] = { "Mathematics-1", "Statistics-1", "Programming C-1", "PC Software", "English", "Digital C.O." };
        String sp[] = { "Programming C-1", "PC Software" };
        String si[] = { "Mathematics-1", "Statistics-1", "English", "Digital C.O." };
        System.out.println("Enter marks of theory exams : ");
        for (int i = 0; i < 6; i++) {
            System.out.println(s[i] + " : ");
            t[i] = sc.nextInt();
            if ((s[i].equals(sp[0]) || s[i].equals(sp[1])) && (t[i] < 0 || t[i] > 50)) {
                System.out.println("Invalid Input : ");
                i--;
            } else if ((!s[i].equals(sp[0]) && (!s[i].equals(sp[1]))) && (t[i] < 0 || t[i] > 40)) {
                System.out.println("Invalid Input : ");
                i--;
            }
        }
        System.out.println("Enter marks of practical exam : ");
        for (int i = 0; i < 2; i++) {
            System.out.println(sp[i] + " : ");
            p[i] = sc.nextInt();
            if ((p[i] < 0) || (p[i] > 25)) {
                System.out.println("Invalid Input : ");
                i--;
            }
        }
        System.out.println("Enter marks of Internal exam :  ");
        for (int i = 0; i < 4; i++) {
            System.out.println(si[i] + " : ");
            ti[i] = sc.nextInt();
            if ((ti[i] < 0) || (ti[i] > 10)) {
                System.out.println("Invalid Input : ");
                i--;
            }
        }
        Semester sem1 = new Semester(t, p, ti, s, sp, si, "SEM-1");
        sem1.showHeader();
        sem1.showMiddle();

        System.out.println("Enter marks for 2nd semester : ");

        String s2[] = { "Mathematics-II", "P & P through C-II", "Statistics-II", "Operating System", "Hindi",
                "Intro to info system" };
        String sp2[] = { "P & P through C-II", "Intro to info system" };
        String si2[] = { "Mathematics-II", "Statistics-II", "Operating System", "Hindi" };
        System.out.println("Enter marks of theory exams : ");
        for (int i = 0; i < 6; i++) {
            System.out.println(s2[i] + " : ");
            t[i] = sc.nextInt();
            if ((s2[i].equals(sp2[0]) || s2[i].equals(sp2[1])) && (t[i] < 0 || t[i] > 50)) {
                System.out.println("Invalid Input : ");
                i--;
            } else if ((!s2[i].equals(sp2[0]) && (!s2[i].equals(sp2[1]))) && (t[i] < 0 || t[i] > 40)) {
                System.out.println("Invalid Input : ");
                i--;
            }
        }
        System.out.println("Enter marks of practical exam : ");
        for (int i = 0; i < 2; i++) {
            System.out.println(sp2[i] + " : ");
            p[i] = sc.nextInt();
            if ((p[i] < 0) || (p[i] > 25)) {
                System.out.println("Invalid Input : ");
                i--;
            }
        }
        System.out.println("Enter marks of Internal exam :  ");
        for (int i = 0; i < 4; i++) {
            System.out.println(si2[i] + " : ");
            ti[i] = sc.nextInt();
            if ((ti[i] < 0) || (ti[i] > 10)) {
                System.out.println("Invalid Input : ");
                i--;
            }
        }
        Semester sem2 = new Semester(t, p, ti, s2, sp2, si2, "SEM-2");
        sem2.showHeader();

        System.out.println("Enter marks for 3rd Semester : ");
        String s3[] = { "Descrete Math", "Unix Ope Sys", "OOPS & C++", "ACC & Finan MGM", "Data Structure",
                "Comm Skill" };
        String sp3[] = { "Data Structure", "Unix Ope Sys" };
        String si3[] = { "Descrete Math", "OOPS & C++", "ACC & Finan MGM", "Comm Skill" };
        System.out.println("Enter marks of theory exams : ");
        for (int i = 0; i < 6; i++) {
            System.out.println(s3[i] + " : ");
            t[i] = sc.nextInt();
            if ((s3[i].equals(sp3[0]) || s3[i].equals(sp3[1])) && (t[i] < 0 || t[i] > 50)) {
                System.out.println("Invalid Input : ");
                i--;
            } else if ((!s3[i].equals(sp3[0]) && (!s3[i].equals(sp3[1]))) && (t[i] < 0 || t[i] > 40)) {
                System.out.println("Invalid Input : ");
                i--;
            }
        }
        System.out.println("Enter marks of practical exam : ");
        for (int i = 0; i < 2; i++) {
            System.out.println(sp3[i] + " : ");
            p[i] = sc.nextInt();
            if ((p[i] < 0) || (p[i] > 25)) {
                System.out.println("Invalid Input : ");
                i--;
            }
        }
        System.out.println("Enter marks of Internal exam :  ");
        for (int i = 0; i < 4; i++) {
            System.out.println(si3[i] + " : ");
            ti[i] = sc.nextInt();
            if ((ti[i] < 0) || (ti[i] > 10)) {
                System.out.println("Invalid Input : ");
                i--;
            }
        }
        Semester sem3 = new Semester(t, p, ti, s3, sp3, si3, "SEM-3");
        sem3.showHeader();

        System.out.println("Enter marks for 4th semester : ");
        String s4[] = { "CONM.", "Software Eng.", "DBMS", "Prog. With Java", "Env. Awareness", "Enterpreniurship" };
        String sp4[] = { "CONM", "DBMS" };
        String si4[] = { "Software Eng.", "Prog. With Java", "Env. Awareness", "Enterpreniurship" };
        System.out.println("Enter marks of theory exams : ");
        for (int i = 0; i < 6; i++) {
            System.out.println(s4[i] + " : ");
            t[i] = sc.nextInt();
            if ((s4[i].equals(sp4[0]) || s4[i].equals(sp4[1])) && (t[i] < 0 || t[i] > 50)) {
                System.out.println("Invalid Input : ");
                i--;
            } else if ((!s4[i].equals(sp4[0]) && (!s4[i].equals(sp4[1]))) && (t[i] < 0 || t[i] > 40)) {
                System.out.println("Invalid Input : ");
                i--;
            }
        }
        System.out.println("Enter marks of practical exam : ");
        for (int i = 0; i < 2; i++) {
            System.out.println(sp4[i] + " : ");
            p[i] = sc.nextInt();
            if ((p[i] < 0) || (p[i] > 25)) {
                System.out.println("Invalid Input : ");
                i--;
            }
        }
        System.out.println("Enter marks of Internal exam :  ");
        for (int i = 0; i < 4; i++) {
            System.out.println(si4[i] + " : ");
            ti[i] = sc.nextInt();
            if ((ti[i] < 0) || (ti[i] > 10)) {
                System.out.println("Invalid Input : ");
                i--;
            }
        }
        Semester sem4 = new Semester(t, p, ti, s4, sp4, si4, "SEM-4");
        sem4.showHeader();

        System.out.println("Enter marks for 5th semester : ");
        String s5[] = { "Linear Alzebra", "Computer Networks", "Human Values", "Info. Technology", "Cloud Computing",
                "Data Science" };
        String sp5[] = { "Data Science", "Cloud Computing" };
        String si5[] = { "Linear Alzebra", "Computer Networks", "Human Values", "Info. Technology" };
        System.out.println("Enter marks of theory exams : ");
        for (int i = 0; i < 6; i++) {
            System.out.println(s5[i] + " : ");
            t[i] = sc.nextInt();
            if ((s5[i].equals(sp5[0]) || s5[i].equals(sp5[1])) && (t[i] < 0 || t[i] > 50)) {
                System.out.println("Invalid Input : ");
                i--;
            } else if ((!s5[i].equals(sp5[0]) && (!s5[i].equals(sp5[1]))) && (t[i] < 0 || t[i] > 40)) {
                System.out.println("Invalid Input : ");
                i--;
            }
        }
        System.out.println("Enter marks of practical exam : ");
        for (int i = 0; i < 2; i++) {
            System.out.println(sp5[i] + " : ");
            p[i] = sc.nextInt();
            if ((p[i] < 0) || (p[i] > 25)) {
                System.out.println("Invalid Input : ");
                i--;
            }
        }
        System.out.println("Enter marks of Internal exam :  ");
        for (int i = 0; i < 4; i++) {
            System.out.println(si5[i] + " : ");
            ti[i] = sc.nextInt();
            if ((ti[i] < 0) || (ti[i] > 10)) {
                System.out.println("Invalid Input : ");
                i--;
            }
        }
        Semester sem5 = new Semester(t, p, ti, s5, sp5, si5, "SEM-5");
        sem5.showHeader();

        System.out.println("Enter marks for 6th semester : ");
        String s6[] = { "PR.Intr&Web TE. ", "Operation Research", "Project", "Internet & Web TE", "Computer Graphics",
                "Principal & Prac." };
        String sp6[] = { "Operation Research", "Principal & Prac." };
        String si6[] = { "PR.Intr&Web TE.", "Project", "Internet & Web TE", "Computer Graphics" };
        System.out.println("Enter marks of theory exams : ");
        for (int i = 0; i < 6; i++) {
            System.out.println(s6[i] + " : ");
            t[i] = sc.nextInt();
            if ((s6[i].equals(sp6[0]) || s6[i].equals(sp6[1])) && (t[i] < 0 || t[i] > 50)) {
                System.out.println("Invalid Input : ");
                i--;
            } else if ((!s6[i].equals(sp6[0]) && (!s6[i].equals(sp6[1]))) && (t[i] < 0 || t[i] > 40)) {
                System.out.println("Invalid Input : ");
                i--;
            }
        }
        System.out.println("Enter marks of practical exam : ");
        for (int i = 0; i < 2; i++) {
            System.out.println(sp6[i] + " : ");
            p[i] = sc.nextInt();
            if ((p[i] < 0) || (p[i] > 25)) {
                System.out.println("Invalid Input : ");
                i--;
            }
        }
        System.out.println("Enter marks of Internal exam :  ");
        for (int i = 0; i < 4; i++) {
            System.out.println(si6[i] + " : ");
            ti[i] = sc.nextInt();
            if ((ti[i] < 0) || (ti[i] > 10)) {
                System.out.println("Invalid Input : ");
                i--;
            }
        }
        Semester sem6 = new Semester(t, p, ti, s6, sp6, si6, "SEM-6");
        sem6.showHeader();
    }
}
