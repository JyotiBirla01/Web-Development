
/*
you are a student of BCA and you have to give exam of each subject if you get ATKT at least 2 sub then 
you will be fail and ATKT status must be highlighted in red color.every subject have 6 theory and 2 practical paper. 
but if you pass in all paper then you can give next sem exam and print result .
in the last you must print the degree and migration of davv. */
import java.util.Scanner;

class Marksheet {
        private String enrollmentNo;
        private int rollNo, sem;
        private String name, fathersName, status, college;

        public Marksheet(String enrollmentNo, int rollNo, int sem, String name, String fathersName,
                        String status,
                        String college) {

                this.enrollmentNo = enrollmentNo;
                this.rollNo = rollNo;
                this.sem = sem;
                this.name = name;
                this.fathersName = fathersName;
                this.status = status;
                this.college = college;
        }

        public void show(int sem) {
                String resetColor = "\u001B[0m";
                String color = "\u001B[34m";
                System.out.println(
                                "_______________________________________________________________________________________________________");
                System.out.println(
                                "____________________________________________________________________________________________________________");
                System.out.println(color
                                + "_________________________________________________________________________________________________"
                                + resetColor);
                System.out.println(color + "|\t\t\t\t\t\t\t\t\t\t\t\t|" + resetColor);
                System.out.println(color + "| \t\t\tDEVI AHILYA VISHWAVIDYALAYA ,INDORE\t\t\t\t\t|"
                                + resetColor);
                System.out.println(color + "|\t\t\t   STATEMENT OF MARKS\t\t\t\t\t\t\t|" + resetColor);
                System.out.println(color + "|" + resetColor + "\t\t(GRADE A+ UNIVERSITY,ACCREDITED BY NAAC" + color
                                + "\t\t\t\t\t\t|" + resetColor);
                System.out.println(
                                color + "|" + resetColor + "\tB.C.A SEM - " + sem + color + "\t\t\t\t\t\t\t\t\t\t|"
                                                + resetColor);
                System.out.print(color + "|" + resetColor + "\tRoll No : " + rollNo);
                System.out.println("\t\tKum. " + name + color + "\t\t\t\t\t\t\t\t|"
                                + resetColor);
                System.out.print(color + "|" + resetColor + "\tDS : " + enrollmentNo);
                System.out.println("\t\t\tF/H " + fathersName + color + "\t\t\t\t\t\t\t\t|" + resetColor);
                System.out.print(color + "|" + resetColor + "\t" + status);
                System.out.println("\t\t\t\t" + college + color + "\t\t\t\t\t\t\t|" + resetColor);
                System.out.println(
                                color +
                                                "________________________________________________________________________________________________"
                                                + resetColor);
                System.out.println(
                                color +
                                                "________________________________________________________________________________________________"

                                                + resetColor);

                System.out.println(color + "|\t\t\t|\t\t\t\t\t|\t\t\t        |" + resetColor);
                System.out.println(
                                color + "|\tSUBJECTS/PAPERS |\t\tSCHEME OF MARKS\t\t|\t\tMARKS OBTAINED"
                                                + color + "  | " + resetColor);
                System.out.println(color + "| \t\t\t| I\tII\tIII\tMin\tMax\t| I\tI\tIII       Total |" +
                                resetColor);
                System.out.println(
                                color +
                                                "-------------------------------------------------------------------------------------------------"
                                                + resetColor);

        }
}

class Marks {
        public Marks(String p[], int mark[], int count1) {
                int max[] = { 50, 50, 50, 50, 50, 50, 25, 25 };
                int min[] = { 17, 17, 17, 17, 17, 17, 7, 7 };
                int count = 0, total = 0;
                String resetColor = "\u001B[0m";
                String color = "\u001B[34m";
                String redColor = "\u001B[0m";
                String red = "\u001B[31m";
                int i;
                for (i = 0, count1 = 0; i < p.length; i++) {
                        if ((mark[i] > 17 && mark[i] < 50)) {
                                count++;
                        }

                        if ((mark[i] < 17)) {
                                count1++;

                        }

                        if ((count == 8) || (count1 <= 2) || (count1 > 2)) {
                                total = total + mark[i];
                        }
                        if (count < 9) {

                                System.out.println(p[i] + "\t" + max[i] + "     ...      ...\t" + min[i] + "\t" + max[i]
                                                + "\t   " + mark[i] + "   ...      ...\t  " + mark[i] + "" + color
                                                + "     |"
                                                + resetColor);

                        }
                }
                System.out.println(color + "|\t\t\t\t\t\t\t\t\t\t\t\t |\n|\t\t\t\t\t\t\t\t\t\t\t\t |" + resetColor);
                System.out.println(color + "|\t\t\t\t\t\t\t\t\t\t\t\t |\n|\t\t\t\t\t\t\t\t\t\t\t\t |" + resetColor);
                System.out.println(color + "|\t\t\t\t\t\t\t\t\t\t\t\t |\n|\t\t\t\t\t\t\t\t\t\t\t\t |" + resetColor);
                System.out.println(color + "|\t\t\t\t\t\t\t\t\t\t\t\t |\n|\t\t\t\t\t\t\t\t\t\t\t\t |" + resetColor);
                System.out.println(color
                                + "__________________________________________________________________________________________________"
                                + resetColor);
                System.out.println(color + "|" + resetColor + "\t\t\t\t\t\t350 " + color + " |         TOTAL | "
                                + resetColor
                                + total + color + "\t\t\t  |" + resetColor);
                System.out.println(color
                                + "_________________________________________________________________________________________________"
                                + resetColor);
                if (count == 8)
                        System.out
                                        .println(color + "|\t\t\t\t\t\t\t\tRESULT |" + resetColor + count + " PASS"
                                                        + color
                                                        + "\t\t\t |"
                                                        + resetColor);

                if (count1 > 0 && count1 <= 2) {
                        System.out.println(color + "|\t\t\t\t\t\t\t\tRESULT |" + resetColor + red + " ATKT" + redColor
                                        + color
                                        + "\t\t\t  |" + resetColor);

                }
                if (count1 > 0 && count1 > 2) {
                        System.out.println(color + "|\t\t\t\t\t\t\t\tRESULT |" + resetColor + red + " FAIL"
                                        + redColor
                                        + color
                                        + "\t\t\t  |" + resetColor);

                }

                System.out.println(color
                                + "__________________________________________________________________________________________________"
                                + resetColor);
        }
}

class Main {

        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the enrollment number");
                String enrollmentNo = sc.nextLine();
                System.out.println("Enter the roll number ");
                int rollNo = sc.nextInt();
                int sem = 0, count1 = 0;
                System.out.println("Enter the name");
                String name1 = sc.nextLine();
                String name = sc.nextLine();
                System.out.println("Enter the father's name");
                String fathersName = sc.nextLine();
                System.out.println("Enter the status ");
                String status = sc.nextLine();
                System.out.println("Enter the college name");
                String collegeName = sc.nextLine();
                // 1st semster
                String resetColor = "\u001B[0m";
                String color = "\u001B[34m";
                String s1[] = { color + "|" + resetColor + "    MATHEMATICS -I",
                                color + "|" + resetColor + "STATISTICAL METHOD",
                                color + "|" + resetColor + " PROG.&PROB. C++",
                                color + "|" + resetColor + "        PC SOFTWARE",
                                color + "|" + resetColor + "           ENGLISH",
                                color + "|" + resetColor + "       P.C.S/W(PR)",
                                color + "|" + resetColor + "              C-(PR)",
                                color + "|" + resetColor + "DIG .COMPUTER ORG." };

                int mark[] = new int[8];

                System.out.println(" \n----- Enter the marks of 1st semester -----\n");
                for (int j = 0; j < mark.length; j++) {
                        System.out.println("Enter the " + s1[j] + " paper marks : ");
                        mark[j] = sc.nextInt();
                        if ((mark[j] < 0) || (mark[j] > 50)) {
                                System.out.println("Invalide input");
                                j--;
                        }
                }
                Marksheet obj = new Marksheet(enrollmentNo, rollNo, sem, name, fathersName, status,
                                collegeName);
                obj.show(1);
                Marks m1 = new Marks(s1, mark, count1);
                int j;
                for (j = 0, count1 = 0; j < mark.length; j++) {

                        if ((mark[j] < 17)) {
                                count1++;
                        }
                }

                if (count1 > 0 && count1 > 2) {
                        System.out.println("YOU ARE FAIL,AGAIN GIVE THE EXAM");
                        for (j = 0; j < mark.length; j++) {
                                System.out.println("Enter the " + s1[j] + " paper marks : ");
                                mark[j] = sc.nextInt();
                                if ((mark[j] < 0) || (mark[j] > 50)) {
                                        System.out.println("Invalide input");
                                        j--;
                                }
                        }
                        obj.show(1);
                        m1 = new Marks(s1, mark, count1);
                }
                System.out.println();
                // 2nd semster
                System.out.println();
                String s2[] = {
                                color + "|" + resetColor + " MATHEMATICS -II",
                                color + "|" + resetColor + " STATISTICAL METHOD-II",
                                color + "|" + resetColor + " PROG.&PROB. C II",
                                color + "|" + resetColor + " INTRO.TO INFO.SYS",
                                color + "|" + resetColor + "          HINDI",
                                color + "|" + resetColor + " C-PRACTICAL II",
                                color + "|" + resetColor + " OPERATING SYSTEM",
                                color + "|" + resetColor + " INTRO.TO.INFO.SYS" };
                int mark2[] = new int[8];
                System.out.println(" -\n---- Enter the marks of 2nd semester -----\n");
                for (j = 0; j < mark2.length; j++) {
                        System.out.println("Enter the " + s2[j] + " paper marks : ");
                        mark2[j] = sc.nextInt();
                        if ((mark2[j] < 0) || (mark2[j] > 50)) {
                                System.out.println("Invalide input");
                                j--;
                        }
                }
                Marksheet obj1 = new Marksheet(enrollmentNo, rollNo, sem, name, fathersName, status,
                                collegeName);
                obj1.show(2);

                Marks m2 = new Marks(s2, mark2, count1);
                for (j = 0, count1 = 0; j < mark2.length; j++) {

                        if ((mark2[j] < 17)) {
                                count1++;
                        }
                }

                if (count1 > 0 && count1 > 2) {
                        System.out.println("YOU ARE FAIL,AGAIN GIVE THE EXAM");
                        for (j = 0; j < mark.length; j++) {
                                System.out.println("Enter the " + s2[j] + " paper marks : ");
                                mark2[j] = sc.nextInt();
                                if ((mark2[j] < 0) || (mark2[j] > 50)) {
                                        System.out.println("Invalide input");
                                        j--;
                                }
                        }
                        obj1.show(2);
                        m2 = new Marks(s2, mark2, count1);

                }
                // 3rd semster
                String s3[] = { color + "|" + resetColor + "DISCREATE MATHEMAT",
                                color + "|" + resetColor + "UNIX OPERATING SYS",
                                color + "|" + resetColor + "     ColorOOP &C++",
                                color + "|" + resetColor + "   ACC.& FINANCIAL",
                                color + "|" + resetColor + "   DATA STRUCUTERS",
                                color + "|" + resetColor + "       COMM.SKILL",
                                color + "|" + resetColor + "      OOP &C++ (PR)",
                                color + "|" + resetColor + "DATA STRUCTURE(PR.)" };
                int mark3[] = new int[8];
                System.out.println("\n ----- Enter the marks of 3rd  semester -----\n");
                for (j = 0; j < mark3.length; j++) {
                        System.out.println("Enter the " + s3[j] + " paper marks : ");
                        mark3[j] = sc.nextInt();
                        if ((mark3[j] < 0) || (mark3[j] > 50)) {
                                System.out.println("Invalide input");
                                j--;
                        }
                }
                Marksheet obj2 = new Marksheet(enrollmentNo, rollNo, sem, name, fathersName, status,
                                collegeName);
                obj2.show(3);
                Marks m3 = new Marks(s3, mark3, count1);
                System.out.println();
                for (j = 0, count1 = 0; j < mark3.length; j++) {

                        if ((mark3[j] < 17)) {
                                count1++;
                        }
                }

                if (count1 > 0 && count1 > 2) {
                        System.out.println("YOU ARE FAIL,AGAIN GIVE THE EXAM");
                        for (j = 0; j < mark3.length; j++) {
                                System.out.println("Enter the " + s3[j] + " paper marks : ");
                                mark3[j] = sc.nextInt();
                                if ((mark3[j] < 0) || (mark3[j] > 50)) {
                                        System.out.println("Invalide input");
                                        j--;
                                }
                        }
                        obj2.show(3);
                        m3 = new Marks(s3, mark3, count1);

                }

                // 4th semster
                String s4[] = { color + "|" + resetColor + "CONM(USING CLANG)",
                                color + "|" + resetColor + "SOFTWARE ENGINEER",
                                color + "|" + resetColor + "             DBMS",
                                color + "|" + resetColor + "   PROG.WITH JAVA",
                                color + "|" + resetColor + "ENV.AWARENESS&GREEN ",
                                color + "|" + resetColor + "ENV.AWARENSS& ENTER.",
                                color + "|" + resetColor + "       CONM.(PR.)",
                                color + "|" + resetColor + "        DBMS(PR.)" };
                int mark4[] = new int[8];
                System.out.println("\n---- Enter the marks of 4th semester ----\n");
                for (j = 0; j < mark4.length; j++) {
                        System.out.println("Enter the " + s4[j] + " paper marks : ");
                        mark4[j] = sc.nextInt();
                        if ((mark4[j] < 0) || (mark4[j] > 50)) {
                                System.out.println("Invalide input");
                                j--;
                        }
                }
                Marksheet obj3 = new Marksheet(enrollmentNo, rollNo, sem, name, fathersName, status,
                                collegeName);
                obj3.show(4);
                Marks m4 = new Marks(s4, mark4, count1);
                System.out.println();
                for (j = 0, count1 = 0; j < mark4.length; j++) {

                        if ((mark4[j] < 17)) {
                                count1++;
                        }
                }

                if (count1 > 0 && count1 > 2) {
                        System.out.println("YOU ARE FAIL,AGAIN GIVE THE EXAM");
                        for (j = 0; j < mark4.length; j++) {
                                System.out.println("Enter the " + s4[j] + " paper marks : ");
                                mark4[j] = sc.nextInt();
                                if ((mark4[j] < 0) || (mark4[j] > 50)) {
                                        System.out.println("Invalide input");
                                        j--;
                                }
                        }
                        obj3.show(4);
                        m3 = new Marks(s4, mark4, count1);

                }

                // 5th semster
                String s5[] = {
                                color + "|" + resetColor + "    MATHEMATICS -I",
                                color + "|" + resetColor + "STATISTICAL METHOD",
                                color + "|" + resetColor + " PROG.&PROB. C++",
                                color + "|" + resetColor + "        PC SOFTWARE",
                                color + "|" + resetColor + "           ENGLISH",
                                color + "|" + resetColor + "       P.C.S/W(PR)",
                                color + "|" + resetColor + "              C-(PR)",
                                color + "|" + resetColor + "DIG .COMPUTER ORG." };

                int mark5[] = new int[8];
                System.out.println("\n---- Enter the marks of 5th semester -----\n");
                for (j = 0; j < mark5.length; j++) {
                        System.out.println("Enter the " + s5[j] + " paper marks : ");
                        mark5[j] = sc.nextInt();
                        if ((mark5[j] < 0) || (mark5[j] > 50)) {
                                System.out.println("Invalide input");
                                j--;
                        }
                }
                Marksheet obj4 = new Marksheet(enrollmentNo, rollNo, sem, name, fathersName, status,
                                collegeName);
                obj4.show(5);
                Marks m5 = new Marks(s5, mark5, count1);
                System.out.println();
                for (j = 0, count1 = 0; j < mark5.length; j++) {

                        if ((mark5[j] < 17)) {
                                count1++;
                        }
                }

                if (count1 > 0 && count1 > 2) {
                        System.out.println("YOU ARE FAIL,AGAIN GIVE THE EXAM");
                        for (j = 0; j < mark5.length; j++) {
                                System.out.println("Enter the " + s5[j] + " paper marks : ");
                                mark5[j] = sc.nextInt();
                                if ((mark5[j] < 0) || (mark5[j] > 50)) {
                                        System.out.println("Invalide input");
                                        j--;
                                }
                        }
                        obj4.show(5);
                        m5 = new Marks(s5, mark5, count1);

                }

                // 6th semster
                String s6[] = { color + "|" + resetColor + "PR.INTR &WEB TE ",
                                color + "|" + resetColor + "OPERATION RESEARC",
                                color + "|" + resetColor + "          PROJECT",
                                color + "|" + resetColor + " INTERNET & WEB TE ",
                                color + "|" + resetColor + " COMPUTER GRAPHICS",
                                color + "|" + resetColor + "PRINCIPAL & PRACTICE ",
                                color + "|" + resetColor + " PRIN.&PRACTICE(PR.)",
                                color + "|" + resetColor + "GRAPHICS & MULTI(PR.)" };
                int mark6[] = new int[8];
                System.out.println("\n-----Enter the marks of 6th semester-----\n");
                for (j = 0; j < mark6.length; j++) {
                        System.out.println("Enter the " + s6[j] + " paper marks : ");
                        mark6[j] = sc.nextInt();
                        if ((mark6[j] < 0) || (mark6[j] > 50)) {
                                System.out.println("Invalide input");
                                j--;
                        }
                }
                Marksheet obj5 = new Marksheet(enrollmentNo, rollNo, sem, name, fathersName, status,
                                collegeName);
                obj5.show(6);
                Marks m6 = new Marks(s6, mark6, count1);
                for (j = 0; j < mark6.length; j++) {

                        if ((mark6[j] < 17)) {
                                count1++;
                        }
                }

                if (count1 > 0 && count1 > 2) {
                        System.out.println("YOU ARE FAIL,AGAIN GIVE THE EXAM");
                        for (j = 0; j < mark6.length; j++) {
                                System.out.println("Enter the " + s6[j] + " paper marks : ");
                                mark6[j] = sc.nextInt();
                                if ((mark6[j] < 0) || (mark6[j] > 50)) {
                                        System.out.println("Invalide input");
                                        j--;
                                }
                        }
                        obj5.show(6);
                        m6 = new Marks(s6, mark6, count1);

                }

        }
}
