import java.util.Scanner;

import java.text.DecimalFormat;

class ProjectMarksheet {
    public static final String RESET = "\u001B[0m";
    public static final String YELLOW = "\u001B[33m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String BLUE = "\u001B[34m";

    // 1.DEGREE
    static void degree(String name, String date, String division) {
        System.out.printf(
                "\t\t__________________________________________________________________________________\n");
        System.out.printf("\t\t|\t\t\t\t\t\t\t\t\t\t |\n");
        System.out.printf("\t\t|\t\t\t\t\t\t\t\t\t\t |\n");
        System.out.printf(" \t\t|\t\t      DEVI AHILYA VISHWA VIDYALAYA, INDORE (M.P.)\t\t |\n");
        System.out.printf("\t\t|\t\t\t\t\t\t\t\t\t\t |\n\n\n");
        System.out.printf("\t\t\t\t\tBachelor Of Computer Application \n");
        System.out.printf("\n\t\t\t\tCertified that %-20s\n", name);
        System.out.printf("\t\t\tobtained the Degree of BACHELOR OF COMPUTER APPLICATION in this\n");
        System.out.printf("\t\t\tUniversity at the Examination held in %-8s and was placed in\n", date);
        System.out.printf("\t\t\tthe %-6s Division.\n\n\n\n", division);
        System.out.printf("\t\t\tDated : %-8s\t\t\t\tVice-Chancellor\n", date);
        System.out.printf("\t\t|\t\t\t\t\t\t\t\t\t\t |\n");
        System.out.printf("\t\t|\t\t\t\t\t\t\t\t\t\t |\n");
        System.out.printf("\t\t|\t\t\t\t\t\t\t\t\t\t |\n");
        System.out.printf(
                "\t\t|________________________________________________________________________________|\n");
    }

    // 2.MIGRATION
    static void migrationC(String sname, String roll_num, String entN, String status, String session, String date) {
        String sutR = "passed";
        System.out.printf(
                "\t\t__________________________________________________________________________________\n");
        System.out.printf("\t\t|\t\t\t\t\t\t\t\t\t\t |\n");
        System.out.printf("\t\t|\t\t  DEVI AHILYA VISHWA VIDYALAYA, INDORE (M.P.)\t\t\t |\n");
        System.out.printf("\t\t|\t\t\t\t\t\t\t\t\t\t |\n");
        System.out.printf("\t\t|\t\t\tMIGRATION CERTIFICATE - %s\t\t\t\t |\n", session);
        System.out.printf("\t\t|\t\t\t\t\t\t\t\t\t\t |\n");
        System.out.printf("\t\t|\t Shri/ku./Shrimati %-20s Entrolment No. %-10s \t |\n", sname, entN);
        System.out.printf("\t\t|\t is informed that this University has no Objection to his/ her\t\t |\n");
        System.out.printf("\t\t|\t migrating to another University.He/ She has %-6s as a %-8s\t |\n", sutR,
                status);
        System.out.printf("\t\t|\t student  at Bachelor of Computer Application  Examination.\t\t |\n");
        System.out.printf("\t\t|\t\t\t\t\t\t\t\t\t\t |\n");
        System.out.printf("\t\t|\t\t\t\t\t\t\t\t\t\t |\n");
        System.out.printf("\t\t|\t\t\t\t\t\t\t\t\t\t |\n");
        System.out.printf("\t\t|\t University House\t\t\t\t\tsing\t\t |\n");
        System.out.printf("\t\t|\t Indore-452001\t\t\t\t\t\t\t\t |\n\t\t|\t Date:%-8s\t\t\t\t\t\t\t\t |\n",
                date);
        System.out.printf("\t\t|\t\t\t\t\t\t\t\t\t\t |\n");
        System.out.printf("\t\t|\t\t\t\t\t\t\t\t\t\t |\n");
        System.out.printf("\t\t|\t\t\t\t\t\t\t\t\t\t |\n");
        System.out.printf(
                "\t\t|________________________________________________________________________________|\n");
    }

    /* Semester Result */

    static void semesterResult(String subjects[], String sname, String fname, String roll_num, String course,
            int sem,
            int marks[], int atkt) {
        String entN = "DS2010814";
        String status1 = "Regular";
        String mname1 = "Jyoti Birla";
        System.out.printf(" \n\n\t\t\t\t      DEVI AHILYA VISHWA VIDYALAYA, INDORE (M.P.)\n");
        System.out.printf(" \t\t\t\t\t\t\tRESULT \n");
        System.out.printf(" \t\t\t\t\t  MAIN EXAMINATION  B.C.A Sem- %d \n", sem);
        System.out.printf(
                "  __________________________________________________________________________________________________________________\n");
        System.out.printf("  |\t\t\t\t\t\t\t\t\t\t\t\t\t\t   |\n");
        System.out.printf("  |\tEnrollment No. : %-9s\t\t\t\t\t\tRoll No. : %-8s\t \t   |\n", entN, roll_num);
        System.out.printf("  |\tStudent Name : %-20s\t\t\t\t\tFather's Name : %-19s|\n", sname, fname);
        System.out.printf("  |\tMother's Name : %-20s\t\t\t\t\tStatus : %-8s   \t\t   |\n", mname1, status1);
        System.out.printf(
                "  |________________________________________________________________________________________________________________|\n");
        System.out.printf(
                "\n  __________________________________________________________________________________________________________________\n");
        System.out.printf("  |\t\t\t\t\t\t\t\t\t\t\t\t\t\t   |\n");
        System.out.println(BLUE
                + "  |\tSubject_Name\t\t         Type_Paper        MaxMarks      MinMarks       ObtMark\t   |"
                + RESET);
        System.out.println(
                "  |----------------------------------------------------------------------------------------------------------------|");
        int total_marks = 0;
        for (int i = 0; i < 6; i++) {
            System.out.printf("  |\t%-33s      T\t\t 50            17            %02d\t\t\t   |\n",
                    subjects[i],
                    marks[i]);
            System.out.println(
                    "  |----------------------------------------------------------------------------------------------------------------|");
            total_marks += marks[i];
        }
        for (int i = 6; i < 8; i++) {
            System.out.printf("  |\t%-33s      P\t\t 25            08            %02d\t\t\t   |\n",
                    subjects[i],
                    marks[i]);
            System.out.println(
                    "  |----------------------------------------------------------------------------------------------------------------|");
            total_marks += marks[i];
        }
        System.out.printf(
                "  |________________________________________________________________________________________________________________|\n");
        System.out.printf("  |\t\t\t\t\t\t\t\t\t\t\t\t\t\t   |\n");
        System.out.printf("  |\t\t\t\t\t\t\tMaximum Marks    350\t|    Marks Obtained    %d\t   |\n",
                total_marks);
        System.out.printf(
                "  |________________________________________________________________________________________________________________|\n");
        System.out.printf(" |\t\t\t\t\t\t\t\t\t\t\t\t\t\t |\n");
        // System.out.printf(" |\tResult : %s\t\t\t\t\t\t\t\t\t Attempt : %d \t |\n",
        // result, attempt);
        System.out.printf(
                " |________________________________________________________________________________________________________________|\n");

      //  float percentege = (total_marks * 100) / (550);
        //float sgpa = percentege / 10;
        System.out.println(YELLOW + "\n\tTotal ATKT          : " + atkt);
        System.out.println("\tTotal marks         : " + total_marks);
        // System.out.println("\tPercentage : " + df2.format(percentege));
        // System.out.println("\tSGPA : " + df1.format(sgpa) + RESET);
        System.out.println(YELLOW
                + "\n======================================================================================================================================");
        System.out.println(
                "======================================================================================================================================\n\n"
                        + RESET);
    }

    /* atkt exams */
    static int atktExam(String subjects[], boolean atkt[], int marks[], int count_atkt) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < atkt.length; i++) {
            if (atkt[i]) {
                if (i < 6) {
                    System.out.print("\tEnter " + subjects[i] + " atkt marks out of 50 : ");
                    marks[i] = sc.nextInt();
                    System.out.println(YELLOW
                            + "--------------------------------------------------------- "
                            + RESET);
                    if (marks[i] < 0 || marks[i] > 50) {
                        System.out.println(RED + "--Invalid marks--Please Re-Enter--" + RESET);
                        i--;
                        continue;
                    }
                    if (marks[i] >= 17) {
                        count_atkt--;
                        atkt[i] = false;
                    }
                    if (marks[i] < 17)
                        atkt[i] = true;
                } else {
                    System.out.print("\tEnter " + subjects[i] + " atkt marks out of 25 : ");
                    marks[i] = sc.nextInt();
                    System.out.println(YELLOW
                            + "--------------------------------------------------------- "
                            + RESET);
                    if (marks[i] < 0 || marks[i] > 25) {
                        System.out.println(RED + "--Invalid marks--Please Re-Enter--" + RESET);
                        i--;
                        continue;
                    }
                    if (marks[i] >= 9) {
                        count_atkt--;
                        atkt[i] = false;
                    }
                    if (marks[i] < 9)
                        atkt[i] = true;
                }
            }
        }
        return count_atkt;
    }

    /* Semester Exams */
    static int semesterExam(String subjects[], boolean atkt[], int marks[], int count_atkt) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < subjects.length; i++) {
            if (i < 6) {// 1
                System.out.print("\tEnter " + subjects[i] + " marks out of 50 : ");
                marks[i] = sc.nextInt();// 51
                System.out.println(YELLOW + "--------------------------------------------------------- "
                        + RESET);
                if (marks[i] < 0 || marks[i] > 50) {
                    System.out.println(RED + "--Invalid marks--Please Re-Enter--" + RESET);
                    i--;// 0
                    continue;
                }
                if (marks[i] < 17) {
                    count_atkt++;
                    atkt[i] = true;
                } else {
                    atkt[i] = false;
                }
            } else {
                System.out.print("\tEnter " + subjects[i] + " marks out of 25 : ");
                marks[i] = sc.nextInt();
                System.out.println(YELLOW + "--------------------------------------------------------- "
                        + RESET);
                if (marks[i] < 0 || marks[i] > 25) {
                    System.out.println(RED + "--Invalid marks--Please Re-Enter--" + RESET);
                    i--;
                    continue;
                }
                if (marks[i] < 9) {
                    count_atkt++;
                    atkt[i] = true;
                } else {
                    atkt[i] = false;
                }
            }
        }
        return count_atkt;
    }

    /* Main Function */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String sem1subjects[] = { "Mathematics-1", "Statistical Method-1", "C-progamming", "P.C.Software",
                "Digital Computer", "English", "C-practicale", "PC-practicale" };
        String sem2subjects[] = { "Mathematics-2", "Statistical Method-2", "Adv C-programing",
                "Operating System",
                "Intro. To Info. Sys", "Hindi", "Adv C-practicale", "Operating System-practicale" };
        String sem3subjects[] = { "Discretc Mathematics", "Unix Operating System", "OOP & C++",
                "Acc. & Financial Mgt.",
                "Data Structures", "Comm. Skill", "OPP & C++ (practicale)",
                "Data Structure-practicale" };
        String sem4subjects[] = { "Conm(using C lang)", "Software Engineer", "DBMS", "Programming with JAVA",
                "Env. Awareness", "Enterpreneurship", "Conm-practicae", "DBMS-practicale" };
        String sem5subjects[] = { "Linear Algebra", "Computer Networks", "Human values ", "Information Techn",
                "Intr.To cloud com", "Intr.To Data Science", "Data Science-practicale",
                "Network & Cloud-practicale" };
        String sem6subjects[] = { " Internet  & Web Techn", "Operation Research", "Computer Graphics",
                "Principal & Practice", "Graphics & Multi", "Project", "Operation Research-practicale",
                "Internet  & Web Techn-PR" };

        int sem1marks[] = new int[8];
        int sem2marks[] = new int[8];
        int sem3marks[] = new int[8];
        int sem4marks[] = new int[8];
        int sem5marks[] = new int[8];
        int sem6marks[] = new int[8];

        boolean sem1atkt[] = new boolean[8];
        boolean sem2atkt[] = new boolean[8];
        boolean sem3atkt[] = new boolean[8];
        boolean sem4atkt[] = new boolean[8];
        boolean sem5atkt[] = new boolean[8];
        boolean sem6atkt[] = new boolean[8];
        /* Entering Student Details */
        System.out.println(
                "\n********************************* DEVI AHILYA VISHWAVIDYALAYA , INDORE ********************************* \n");
        System.out.print("\tEnter name of student : ");
        String sname = sc.nextLine();
        System.out.println(YELLOW + "--------------------------------------------------------- " + RESET);
        System.out.print("\tEnter name of course : ");
        String course = sc.nextLine();
        System.out.println(YELLOW + "--------------------------------------------------------- " + RESET);
        System.out.print("\tEnter father's name : ");
        String fname = sc.nextLine();
        System.out.println(YELLOW + "--------------------------------------------------------- " + RESET);
        System.out.print("\tEnter mother's name : ");
        String mname = sc.nextLine();
        System.out.println(YELLOW + "--------------------------------------------------------- " + RESET);
        System.out.print("\tEnter Roll Number : ");
        String roll_num = sc.nextLine();
        System.out.println(YELLOW + "--------------------------------------------------------- " + RESET);
        System.out.print("\tEnter Enrololment No. : ");
        String entN = sc.nextLine();
        System.out.println(YELLOW + "--------------------------------------------------------- " + RESET);
        System.out.print("\tEnter status : ");
        String status = sc.nextLine();
        System.out.println(YELLOW + "--------------------------------------------------------- " + RESET);
        int count_sem1atkt, count_sem2atkt, count_sem3atkt, count_sem4atkt, count_sem5atkt, count_sem6atkt;
        do {
            count_sem1atkt = 0;
            /* First semester starts */
            System.out.println(BLUE + "\n\tEnter marks of 1st semester :\n " + RESET);
            count_sem1atkt = semesterExam(sem1subjects, sem1atkt, sem1marks, count_sem1atkt);
            System.out.println(YELLOW + "\n\tYou have " + count_sem1atkt + " ATKT in 1st Semester" + RESET);
            /* First semester ends */
            int s = 1;
            semesterResult(sem1subjects, sname, fname, roll_num, course, s, sem1marks, count_sem1atkt);
            /* First semester atkt starts */
            if (count_sem1atkt >= 3) {
                System.out.println(RED
                        + "\n\t!!!Warning!!!\n\t*Year Back*\n\tYou have more then 3 ATKT's in this Semester thats why You are not Eligible for next Semester Exam.\n"
                        + RESET);
                continue;
            } else {
                System.out.println(
                        GREEN + "\n\t---: Congrats You are Promoted to 2nd Semester Exam :---\n"
                                + RESET);
                /* First sem atkt */
                if (count_sem1atkt > 0 && count_sem1atkt <= 2) {
                    System.out.println(
                            BLUE + "\n\tPlease Enter Semester 1st ATKT Marks : " + RESET);
                    count_sem1atkt = atktExam(sem1subjects, sem1atkt, sem1marks, count_sem1atkt);
                }
                do {
                    count_sem2atkt = 0;
                    /* Second Semester exam starts */
                    System.out.println(BLUE + "\n\tEnter marks of 2nd semester : " + RESET);
                    count_sem2atkt = semesterExam(sem2subjects, sem2atkt, sem2marks,
                            count_sem2atkt);
                    /* Second semester exam ends */
                    System.out.println(YELLOW + "\n\tYou have " + count_sem2atkt
                            + " ATKT in 2nd Semester");
                    System.out.println(
                            "\tAfter 2nd semester You have " + count_sem1atkt
                                    + " ATKT in 1st Semester\n" + RESET);
                    s = 1;
                    semesterResult(sem1subjects, sname, fname, roll_num, course, s, sem1marks,
                            count_sem1atkt);
                    s = 2;
                    semesterResult(sem2subjects, sname, fname, roll_num, course, s, sem2marks,
                            count_sem2atkt);
                    if (count_sem1atkt + count_sem2atkt >= 4) {
                        System.out.println(RED
                                + "\n\t!!!Warning!!!\n\t*Year Back*\n\tYou have more then 3 ATKT's in this Semester thats why You are not Eligible for next Semester Exam.\n"
                                + RESET);
                        continue;
                    } else {
                        /* Third semester starts */
                        System.out.println(
                                GREEN + "\n\t---: Congrats You are Promoted to 3rd Semester Exam :---\n"
                                        + RESET);
                        /* First sem atkt */
                        if (count_sem1atkt > 0 && count_sem1atkt <= 2) {
                            System.out.println(BLUE
                                    + "\n\tPlease Enter Semester 1st ATKT Marks : "
                                    + RESET);
                            count_sem1atkt = atktExam(sem1subjects, sem1atkt, sem1marks,
                                    count_sem1atkt);
                        }
                        /* Second sem atkt */
                        if (count_sem2atkt > 0 && count_sem2atkt <= 2) {
                            System.out.println(BLUE
                                    + "\n\tPlease Enter 2nd Semester ATKT Marks : "
                                    + RESET);
                            count_sem2atkt = atktExam(sem2subjects, sem2atkt, sem2marks,
                                    count_sem2atkt);
                        }
                        /* ATKT end of first and second sem */
                        /* 3rd sem main exam start */
                        do {
                            count_sem3atkt = 0;
                            System.out
                                    .println(BLUE + "\n\tPlease enter the marks of 3rd semester main exam : "
                                            + RESET);
                            count_sem3atkt = semesterExam(sem3subjects, sem3atkt, sem3marks,
                                    count_sem3atkt);
                            System.out.println(YELLOW + "\n\tYou have " + count_sem3atkt
                                    + " ATKT in 3rd Semester");
                            System.out.println(
                                    "\tAfter 3rd semester You have "
                                            + count_sem1atkt
                                            + " ATKT in 1st Semester");
                            System.out.println("\tAfter 3rd semester You have "
                                    + count_sem2atkt
                                    + " ATKT in 2nd Semester\n" + RESET);
                            /* 3rd semester main ends */
                            s = 1;
                            semesterResult(sem1subjects, sname, fname, roll_num, course, s,
                                    sem1marks, count_sem1atkt);
                            s = 2;
                            semesterResult(sem2subjects, sname, fname, roll_num, course, s,
                                    sem2marks, count_sem2atkt);
                            s = 3;
                            semesterResult(sem3subjects, sname, fname, roll_num, course, s,
                                    sem3marks, count_sem3atkt);
                            if (count_sem1atkt + count_sem2atkt + count_sem3atkt >= 4) {
                                System.out.println(RED
                                        + "\n\t!!!Warning!!!\n\t*Sem Back*\n\tYou have more then 3 ATKT's in this Semester thats why You are not Eligible for next Semester Exam.\n"
                                        + RESET);
                                continue;
                            } else {
                                System.out.println(GREEN
                                        + "\n\t---: Congrats You are Promoted to 4th Semester Exam :---\n"
                                        + RESET);
                                /* 1st sem atkt start */
                                if (count_sem1atkt > 0 && count_sem1atkt <= 2) {
                                    System.out.println(BLUE
                                            + "\tPlease Enter 1st Semester ATKT Marks : "
                                            + BLUE);
                                    count_sem1atkt = atktExam(sem1subjects,
                                            sem1atkt, sem1marks,
                                            count_sem1atkt);
                                }
                                /* 2nd sem atkt start */
                                if (count_sem2atkt > 0 && count_sem2atkt <= 2) {
                                    System.out.println(BLUE
                                            + "\n\tPlease Enter 2nd Semester ATKT Marks : "
                                            + RESET);
                                    count_sem2atkt = atktExam(sem2subjects,
                                            sem2atkt, sem2marks,
                                            count_sem2atkt);
                                }
                                /* 3rd semester atkt starts */
                                if (count_sem3atkt > 0 && count_sem3atkt <= 2) {
                                    System.out.println(BLUE
                                            + "\n\tPlease Enter 3rd Semester ATKT Marks : "
                                            + RESET);
                                    count_sem3atkt = atktExam(sem3subjects,
                                            sem3atkt, sem3marks,
                                            count_sem3atkt);
                                }
                                /* 3rd semester atkt ends */
                                /* 4th Semester exam starts */
                                do {
                                    count_sem4atkt = 0;
                                    System.out.println(BLUE
                                            + "\n\tEnter marks of 4th semester main exam : "
                                            + RESET);
                                    count_sem4atkt = semesterExam(sem4subjects,
                                            sem4atkt, sem4marks,
                                            count_sem4atkt);

                                    System.out.println(
                                            YELLOW + "\n\tYou have "
                                                    + count_sem4atkt
                                                    + " ATKT in 4th Semester");
                                    System.out.println(
                                            "\tAfter 4th semester You have "
                                                    + count_sem1atkt
                                                    + " ATKT in 1st Semester");
                                    System.out.println(
                                            "\tAfter 4th semester You have "
                                                    + count_sem2atkt
                                                    + " ATKT in 2nd Semester");
                                    System.out.println(
                                            "\tAfter 4th semester You have "
                                                    + count_sem3atkt
                                                    + " ATKT in 3rd Semester\n"
                                                    + RESET);
                                    s = 1;
                                    semesterResult(sem1subjects, sname, fname,
                                            roll_num, course, s, sem1marks,
                                            count_sem1atkt);
                                    s = 2;
                                    semesterResult(sem2subjects, sname, fname,
                                            roll_num, course, s, sem2marks,
                                            count_sem2atkt);
                                    s = 3;
                                    semesterResult(sem3subjects, sname, fname,
                                            roll_num, course, s, sem3marks,
                                            count_sem3atkt);
                                    s = 4;
                                    semesterResult(sem4subjects, sname, fname,
                                            roll_num, course, s, sem4marks,
                                            count_sem4atkt);
                                    if (count_sem1atkt + count_sem2atkt
                                            + count_sem3atkt
                                            + count_sem4atkt >= 4) {
                                        System.out.println(RED
                                                + "\n\t!!!Warning!!!\n\t*Sem Back*\n\tYou have more then 3 ATKT's in this Semester thats why You are not Eligible for next Semester Exam.\n"
                                                + RESET);
                                        continue;
                                    } else {
                                        /* 5th semester */
                                        System.out.println(
                                                GREEN + "\t---: Congrats You are prumoted for 5th Semester Exam :---"
                                                        + RESET);
                                        /* First sem atkt */
                                        if (count_sem1atkt > 0
                                                && count_sem1atkt <= 2) {
                                            System.out.println(
                                                    BLUE + "\tPlease Enter 1st Semester ATKT Marks : "
                                                            + RESET);
                                            count_sem1atkt = atktExam(
                                                    sem1subjects,
                                                    sem1atkt,
                                                    sem1marks,
                                                    count_sem1atkt);
                                        }
                                        /* Second sem atkt */
                                        if (count_sem2atkt > 0
                                                && count_sem2atkt <= 2) {
                                            System.out.println(
                                                    BLUE + "\n\tPlease Enter 2nd Semester ATKT Marks : "
                                                            + RESET);
                                            count_sem2atkt = atktExam(
                                                    sem2subjects,
                                                    sem2atkt,
                                                    sem2marks,
                                                    count_sem2atkt);
                                        }
                                        /* Third sem ATKT */
                                        if (count_sem3atkt > 0
                                                && count_sem3atkt <= 2) {
                                            System.out.println(
                                                    BLUE + "\n\tPlease Enter 3rd Semester ATKT Marks : "
                                                            + RESET);
                                            count_sem3atkt = atktExam(
                                                    sem3subjects,
                                                    sem3atkt,
                                                    sem3marks,
                                                    count_sem3atkt);
                                        }
                                        /* 4th Sem ATKT */
                                        if (count_sem4atkt > 0
                                                && count_sem4atkt <= 2) {
                                            System.out.println(
                                                    BLUE + "\n\tPlease Enter 4th Semester ATKT Marks : "
                                                            + RESET);
                                            count_sem4atkt = atktExam(
                                                    sem4subjects,
                                                    sem4atkt,
                                                    sem4marks,
                                                    count_sem4atkt);
                                        }
                                        /* 5th Sem main exam starts */
                                        do {
                                            count_sem5atkt = 0;
                                            System.out.println(
                                                    BLUE + "\n\tPlease enter the marks of 5th semester main exam : "
                                                            + RESET);
                                            count_sem5atkt = semesterExam(
                                                    sem5subjects,
                                                    sem5atkt,
                                                    sem5marks,
                                                    count_sem5atkt);

                                            System.out.println(YELLOW
                                                    + "\n\tYou have "
                                                    + count_sem5atkt
                                                    + " ATKT in 5th Semester");
                                            System.out.println(
                                                    "\tAfter 5th semester You have "
                                                            + count_sem1atkt
                                                            + " ATKT in 1st Semester");
                                            System.out.println(
                                                    "\tAfter 5th semester You have "
                                                            + count_sem2atkt
                                                            + " ATKT in 2nd Semester");
                                            System.out.println(
                                                    "\tAfter 5th semester You have "
                                                            + count_sem3atkt
                                                            + " ATKT in 3rd Semester");
                                            System.out.println(
                                                    "\tAfter 5th semester You have "
                                                            + count_sem4atkt
                                                            + " ATKT in 4th Semester\n"
                                                            + RESET);
                                            /* 5th semester main ends */

                                            s = 1;
                                            semesterResult(sem1subjects,
                                                    sname, fname,
                                                    roll_num,
                                                    course, s,
                                                    sem1marks,
                                                    count_sem1atkt);
                                            s = 2;
                                            semesterResult(sem2subjects,
                                                    sname, fname,
                                                    roll_num,
                                                    course, s,
                                                    sem2marks,
                                                    count_sem2atkt);
                                            s = 3;
                                            semesterResult(sem3subjects,
                                                    sname, fname,
                                                    roll_num,
                                                    course, s,
                                                    sem3marks,
                                                    count_sem3atkt);
                                            s = 4;
                                            semesterResult(sem4subjects,
                                                    sname, fname,
                                                    roll_num,
                                                    course, s,
                                                    sem4marks,
                                                    count_sem4atkt);
                                            s = 5;
                                            semesterResult(sem5subjects,
                                                    sname, fname,
                                                    roll_num,
                                                    course, s,
                                                    sem5marks,
                                                    count_sem5atkt);
                                            if (count_sem1atkt
                                                    + count_sem2atkt
                                                    + count_sem3atkt
                                                    + count_sem4atkt
                                                    + count_sem5atkt >= 4) {
                                                System.out.println(RED
                                                        + "\n\t!!!Warning!!!\n*Sem Back*\n\tYou have more then 3 ATKT's in this Semester thats why You are not Eligible for next Semester Exam.\n"
                                                        + RESET);
                                                continue;
                                            } else {
                                                System.out.println(GREEN
                                                        + "\n\t---: Congrats You are Promoted to 6th Semester Exam :---\n"
                                                        + RESET);
                                                /* 1st sem atkt start */
                                                if (count_sem1atkt > 0
                                                        && count_sem1atkt <= 2) {
                                                    System.out.println(
                                                            BLUE + "\tPlease Enter 1st Semester ATKT Marks : "
                                                                    + RESET);
                                                    count_sem1atkt = atktExam(
                                                            sem1subjects,
                                                            sem1atkt,
                                                            sem1marks,
                                                            count_sem1atkt);
                                                }
                                                /* 2nd sem atkt start */
                                                if (count_sem2atkt > 0
                                                        && count_sem2atkt <= 2) {
                                                    System.out.println(
                                                            BLUE
                                                                    + "\n\tPlease Enter 2nd Semester ATKT Marks : "
                                                                    + RESET);
                                                    count_sem2atkt = atktExam(
                                                            sem2subjects,
                                                            sem2atkt,
                                                            sem2marks,
                                                            count_sem2atkt);
                                                }
                                                /*
                                                 * 3rd semester atkt
                                                 * starts
                                                 */
                                                if (count_sem3atkt > 0
                                                        && count_sem3atkt <= 2) {
                                                    System.out.println(
                                                            BLUE
                                                                    + "\n\tPlease Enter 3rd Semester ATKT Marks : "
                                                                    + RESET);
                                                    count_sem3atkt = atktExam(
                                                            sem3subjects,
                                                            sem3atkt,
                                                            sem3marks,
                                                            count_sem3atkt);
                                                }
                                                /* 4th Sem ATKT */
                                                if (count_sem4atkt > 0
                                                        && count_sem4atkt <= 2) {
                                                    System.out.println(
                                                            BLUE
                                                                    + "\n\tPlease Enter 4th Semester ATKT Marks : "
                                                                    + RESET);
                                                    count_sem4atkt = atktExam(
                                                            sem4subjects,
                                                            sem4atkt,
                                                            sem4marks,
                                                            count_sem4atkt);
                                                }
                                                /*
                                                 * 5th sem atkt starts
                                                 */
                                                if (count_sem5atkt > 0
                                                        && count_sem5atkt <= 2) {
                                                    System.out.println(
                                                            BLUE
                                                                    + "\n\tPlease Enter 5th Semester ATKT Marks : "
                                                                    + RESET);
                                                    count_sem5atkt = atktExam(
                                                            sem5subjects,
                                                            sem5atkt,
                                                            sem5marks,
                                                            count_sem5atkt);
                                                }
                                                /*
                                                 * 5th semester atkt
                                                 * ends
                                                 */

                                                /*
                                                 * 6th Semester exam
                                                 * starts
                                                 */
                                                do {
                                                    count_sem6atkt = 0;
                                                    System.out.println(
                                                            BLUE
                                                                    + "\n\tEnter marks of 6th semester main exam : "
                                                                    + RESET);
                                                    count_sem6atkt = semesterExam(
                                                            sem6subjects,
                                                            sem6atkt,
                                                            sem6marks,
                                                            count_sem6atkt);

                                                    System.out.println(
                                                            YELLOW + "\n\tYou have "
                                                                    + count_sem6atkt
                                                                    + " ATKT in 6th Semester");
                                                    System.out.println(
                                                            "\tAfter 6th semester You have "
                                                                    + count_sem1atkt
                                                                    + " ATKT in 1st Semester");
                                                    System.out.println(
                                                            "\tAfter 6th semester You have "
                                                                    + count_sem2atkt
                                                                    + " ATKT in 2nd Semester");
                                                    System.out.println(
                                                            "\tAfter 6th semester You have "
                                                                    + count_sem3atkt
                                                                    + " ATKT in 3rd Semester");
                                                    System.out.println(
                                                            "\tAfter 6th semester You have "
                                                                    + count_sem4atkt
                                                                    + " ATKT in 4th Semester");
                                                    System.out.println(
                                                            "\tAfter 6th semester You have "
                                                                    + count_sem5atkt
                                                                    + " ATKT in 5th Semester\n"
                                                                    + RESET);
                                                    s = 1;
                                                    semesterResult(sem1subjects,
                                                            sname,
                                                            fname,
                                                            roll_num,
                                                            course,
                                                            s,
                                                            sem1marks,
                                                            count_sem1atkt);
                                                    s = 2;
                                                    semesterResult(sem2subjects,
                                                            sname,
                                                            fname,
                                                            roll_num,
                                                            course,
                                                            s,
                                                            sem2marks,
                                                            count_sem2atkt);
                                                    s = 3;
                                                    semesterResult(sem3subjects,
                                                            sname,
                                                            fname,
                                                            roll_num,
                                                            course,
                                                            s,
                                                            sem3marks,
                                                            count_sem3atkt);
                                                    s = 4;
                                                    semesterResult(sem4subjects,
                                                            sname,
                                                            fname,
                                                            roll_num,
                                                            course,
                                                            s,
                                                            sem4marks,
                                                            count_sem4atkt);
                                                    s = 5;
                                                    semesterResult(sem5subjects,
                                                            sname,
                                                            fname,
                                                            roll_num,
                                                            course,
                                                            s,
                                                            sem5marks,
                                                            count_sem5atkt);
                                                    s = 6;
                                                    semesterResult(sem6subjects,
                                                            sname,
                                                            fname,
                                                            roll_num,
                                                            course,
                                                            s,
                                                            sem6marks,
                                                            count_sem6atkt);
                                                    if (count_sem1atkt
                                                            + count_sem2atkt
                                                            + count_sem3atkt
                                                            + count_sem4atkt
                                                            + count_sem5atkt
                                                            + count_sem6atkt >= 4) {
                                                        System.out.println(
                                                                RED
                                                                        + "\n\t!!!Warning!!!\n*Sem Back*\n\tYou have more then 3 ATKT's in this Semester thats why You are not Eligible for next Semester Exam.\n"
                                                                        + RESET);
                                                        continue;
                                                    } else {
                                                        /*
                                                         * First
                                                         * sem
                                                         * atkt
                                                         */
                                                        if (count_sem1atkt > 0
                                                                && count_sem1atkt <= 2) {
                                                            System.out.println(
                                                                    BLUE + "\tPlease Enter 1st Semester ATKT Marks : "
                                                                            + RESET);
                                                            count_sem1atkt = atktExam(
                                                                    sem1subjects,
                                                                    sem1atkt,
                                                                    sem1marks,
                                                                    count_sem1atkt);
                                                        }
                                                        /*
                                                         * Second
                                                         * sem
                                                         * atkt
                                                         */
                                                        if (count_sem2atkt > 0
                                                                && count_sem2atkt <= 2) {
                                                            System.out.println(
                                                                    BLUE + "\n\tPlease Enter 2nd Semester ATKT Marks : "
                                                                            + RESET);
                                                            count_sem2atkt = atktExam(
                                                                    sem2subjects,
                                                                    sem2atkt,
                                                                    sem2marks,
                                                                    count_sem2atkt);
                                                        }
                                                        /*
                                                         * Third
                                                         * sem
                                                         * ATKT
                                                         */
                                                        if (count_sem3atkt > 0
                                                                && count_sem3atkt <= 2) {
                                                            System.out.println(
                                                                    BLUE + "\n\tPlease Enter 3rd Semester ATKT Marks : "
                                                                            + RESET);
                                                            count_sem3atkt = atktExam(
                                                                    sem3subjects,
                                                                    sem3atkt,
                                                                    sem3marks,
                                                                    count_sem3atkt);
                                                        }
                                                        /*
                                                         * 4th
                                                         * Sem
                                                         * ATKT
                                                         */
                                                        if (count_sem4atkt > 0
                                                                && count_sem4atkt <= 2) {
                                                            System.out.println(
                                                                    BLUE + "\n\tPlease Enter 4th Semester ATKT Marks : "
                                                                            + RESET);
                                                            count_sem4atkt = atktExam(
                                                                    sem4subjects,
                                                                    sem4atkt,
                                                                    sem4marks,
                                                                    count_sem4atkt);
                                                        }
                                                        /*
                                                         * 5th
                                                         * sem
                                                         * atkt
                                                         * starts
                                                         */
                                                        if (count_sem5atkt > 0
                                                                && count_sem5atkt <= 2) {
                                                            System.out.println(
                                                                    BLUE + "\n\tPlease Enter 5th Semester ATKT Marks : "
                                                                            + RESET);
                                                            count_sem5atkt = atktExam(
                                                                    sem5subjects,
                                                                    sem5atkt,
                                                                    sem5marks,
                                                                    count_sem5atkt);
                                                        }
                                                        /*
                                                         * 6th
                                                         * sem
                                                         * atkt
                                                         * starts
                                                         */
                                                        if (count_sem6atkt > 0
                                                                && count_sem6atkt <= 2) {
                                                            System.out.println(
                                                                    BLUE + "\n\tPlease Enter 6th Semester ATKT Marks : "
                                                                            + RESET);
                                                            count_sem6atkt = atktExam(
                                                                    sem6subjects,
                                                                    sem6atkt,
                                                                    sem6marks,
                                                                    count_sem6atkt);
                                                        }

                                                        if (count_sem1atkt > 0
                                                                || count_sem2atkt > 0
                                                                || count_sem3atkt > 0
                                                                || count_sem4atkt > 0
                                                                || count_sem5atkt > 0
                                                                || count_sem6atkt > 0) {
                                                            System.out.println(
                                                                    RED
                                                                            + "\tYou have so many ATKT's Thats why you are not eligible for Continue Course.\n\t"
                                                                            + RESET);
                                                        } else {
                                                            /*
                                                             * printing
                                                             * all
                                                             * Marksheet
                                                             * +
                                                             * degree
                                                             * +
                                                             * tc
                                                             * +
                                                             * migration
                                                             */
                                                            String date1 = "";
                                                            String division1;
                                                            String session = "2023";
                                                            String syear;
                                                            String fyear;
                                                            String rN = String
                                                                    .valueOf(roll_num);
                                                            System.out.print(
                                                                    "\n\n\tDo You want Your Degree? (y/n) : ");
                                                            char reply = sc.next()
                                                                    .charAt(0);
                                                            if (reply == 'y' || reply == 'Y') {
                                                                System.out.print(
                                                                        "\tEnter date for Degree : ");
                                                                date1 = sc.next();
                                                                System.out.println(
                                                                        YELLOW
                                                                                + "--------------------------------------------------------- "
                                                                                + RESET);
                                                                System.out.print(
                                                                        "\tEnter division1 for Degree : ");
                                                                division1 = sc.next();
                                                                System.out.println(
                                                                        YELLOW
                                                                                + "--------------------------------------------------------- "
                                                                                + RESET);
                                                                degree(sname, date1,
                                                                        division1);
                                                            }

                                                            System.out.print(
                                                                    "\n\n\tDo You want Your Migration? (y/n) : ");
                                                            reply = sc.next()
                                                                    .charAt(0);
                                                            if (reply == 'y' || reply == 'Y') {
                                                                System.out.print(
                                                                        "\tEnter session for Migration : ");
                                                                session = sc.next();
                                                                System.out.println(
                                                                        YELLOW
                                                                                + "--------------------------------------------------------- "
                                                                                + RESET);
                                                                migrationC(sname,
                                                                        roll_num,
                                                                        entN,
                                                                        status,
                                                                        session,
                                                                        date1);
                                                            } else {
                                                                System.out.println(
                                                                        GREEN
                                                                                + " \tOk \n.....Thanks for Visiting.....");
                                                            }

                                                        }

                                                    }
                                                } while (count_sem6atkt >= 1);
                                            }
                                        } while (count_sem5atkt >= 1);
                                    }
                                } while (count_sem4atkt >= 1);
                            }
                        } while (count_sem3atkt >= 1);
                    }
                } while (count_sem2atkt >= 1);
            }
        } while (count_sem1atkt >= 1);
    }
}
