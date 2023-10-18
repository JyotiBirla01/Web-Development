import java.util.Scanner;

class Marksheet {
        String name;
        String father_name;
        String mother_name;
        String dob;
        String status;
        String roll_no;
        String sem1Sub[] = { "HINDI      ", "ENGLISH    ", "MATHS      ", "COMPUTER   ", "PHYSICS    ", "PRACTICAL 1",
                        "PRACTICAL 2" };
        String sem2Sub[] = { "C         ", "C++       ", "JAVA       ", "JAVA SCRIPT", "PYTHON     ", "PRACTICAL 1",
                        "PRACTICAL 2" };
        String sem3Sub[] = { "OS", "CN", "DBMS", "DS", "ORCALE", "PRACTICAL 1", "PRACTICAL 2" };
        String sem4Sub[] = { "MULTIMEDIA", "ANDROID", "CSM", "FC", "RDBMS", "PRACTICAL 1", "PRACTICAL 2" };
        String sem5Sub[] = { "WEB-DESIGING", "OOPS", "FUNCTIONAL PROGRAMMING", "ELECTIVE", "ST", "PRACTICAL 1",
                        "PRACTICAL 2" };
        String sem6Sub[] = { "HTML", "CSS", "REACT JS", "NODE JS", "MONGO DB", "PRACTICAL 1", "PRACTICAL 2" };
        int marks[] = new int[7];
        boolean result[] = new boolean[7];

        public Marksheet() {
        }

        public Marksheet(String name, String father_name, String mother_name, String dob, String status,
                        String roll_no) {
                this.name = name;
                this.father_name = father_name;
                this.mother_name = mother_name;
                this.dob = dob;
                this.status = status;
                this.roll_no = roll_no;
        }
}

class davv {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a name            : ");
                String name = "Pankaj";
                // String name = sc.nextLine();

                System.out.print("Ener a Father name is   : ");
                String father_name = "Hare Singh";
                // String father_name = sc.nextLine();

                System.out.print("Ener a Mother name is   : ");
                String mother_name = "Anita";
                // String mother_name = sc.nextLine();

                System.out.print("Ener a Date of birth is : ");
                String dob = "12/10/2002";
                // String dob = sc.nextLine();

                System.out.print("Ener a Status is        : ");
                String status = "Private";
                // String status = sc.nextLine();

                System.out.print("Ener a Roll no is       : ");
                String roll_no = "2216706433";
                // String roll_no = sc.nextLine();
                Marksheet objArray[] = new Marksheet[6];
                int supplyIndexArray[][] = new int[6][7];
                int supplyCountArray[] = new int[6];
                // for (int i = 0; i < objArray.length; i++) {
                //         System.out.println("object array " + objArray[i]);
                // }

                for (int k = 0; k < objArray.length; k++) {
                        objArray[k] = new Marksheet(name, father_name, mother_name, dob, status, roll_no);

                        while (true) {
                                supplyCountArray[k] = 0;

                                for (int i = 0; i < objArray[k].sem1Sub.length; i++) {
                                        System.out.println("enter marks of " + objArray[k].sem1Sub[i]);
                                        objArray[k].marks[i] = sc.nextInt();

                                        if (33 <= objArray[k].marks[i] && (i >= 0 && i < 3)) {
                                                objArray[k].result[i] = true;
                                        } else if (23 <= objArray[k].marks[i] && (i >= 3 && i < 5)) {
                                                objArray[k].result[i] = true;
                                        } else if (9 <= objArray[k].marks[i] && (i >= 5 && i < 7)) {
                                                objArray[k].result[i] = true;
                                        } else {
                                                objArray[k].result[i] = false;
                                                supplyIndexArray[k][supplyCountArray[k]] = i; // storing index and count
                                                                                              // fail subject
                                                supplyCountArray[k]++;
                                        }
                                }
                                for (int s = 0; s < k; s++) {
                                        int supplycount = 0;
                                        for (int j = 0; j < supplyCountArray[s]; j++) {

                                                System.out.println("\nSUPPLY SEMESTER : " + (s + 1) + "\n");
                                                System.out.println("enter marks of "
                                                                + objArray[s].sem1Sub[supplyIndexArray[s][j]]);

                                                objArray[s].marks[supplyIndexArray[s][j]] = sc.nextInt();
                                                if (33 <= objArray[s].marks[supplyIndexArray[s][j]]
                                                                && (j >= 0 && j < 3)) {
                                                        objArray[s].result[supplyIndexArray[s][j]] = true;
                                                } else if (23 <= objArray[s].marks[supplyIndexArray[s][j]]
                                                                && (j >= 3 && j < 5)) {
                                                        objArray[s].result[supplyIndexArray[s][j]] = true;
                                                } else if (9 <= objArray[s].marks[supplyIndexArray[s][j]]
                                                                && (j >= 5 && j < 7)) {
                                                        objArray[s].result[supplyIndexArray[s][j]] = true;
                                                } else {
                                                        objArray[s].result[supplyIndexArray[s][j]] = false;
                                                        supplyIndexArray[s][supplycount] = supplyIndexArray[s][j];
                                                        supplycount++;
                                                }

                                        }
                                        supplyCountArray[s] = supplycount;
                                }

                                if (supplyCountArray[k] > 0 && supplyCountArray[k] <= 2) {
                                        System.out.println("\n\nResult :  Supply ");
                                        System.out.println("\nIn this subject ");
                                } else if (supplyCountArray[k] > 2) {
                                        System.out.println("\n\nResult :  Fail");
                                        System.out.println("\nIn this subject ");
                                }
                                for (int i = 0; i < supplyCountArray[k]; i++) {
                                        System.out.println(
                                                        objArray[k].sem1Sub[supplyIndexArray[k][i]] + " : "
                                                                        + objArray[k].marks[supplyIndexArray[k][i]]);
                                }
                                if (supplyCountArray[k] > 2) {
                                        System.out.println("\nPlease give Re-Exam\n");
                                } else {
                                        break;
                                }
                        }
                        System.out.println(
                                        "|=============================================================================================|");
                        System.out.println(
                                        "|                                 DEVI AHILYA VISHWAVIDYALAYA                                 |");
                        System.out.println(
                                        "|                                    ( COLLAGE , INDORE)                                      |");
                        System.out.println("|                                       SEMESTER : " + (k + 1)
                                        + "                                          |");
                        System.out.println(
                                        "|=============================================================================================|");
                        System.out.println(
                                        "|                                             BCA - MARKSHEET                                 |");
                        System.out.println(
                                        "|                                                                                             |");
                        System.out.println("|       Name          : " + objArray[k].name
                                        + "                              STATUS   : " + objArray[k].status
                                        + "                |");
                        System.out.println("|       Father Name   : " + objArray[k].father_name
                                        + "                          Roll No. : " + objArray[k].roll_no
                                        + "             |");
                        System.out.println("|       Mother Name   : " + objArray[k].mother_name
                                        + "                                                                 |");
                        System.out.println("|       Date of Birth : " + objArray[k].dob
                                        + "                                                            |");
                        System.out.println(
                                        "|=============================================================================================|");
                        System.out.println(
                                        "| COLLEGE : Rukmadevi Pannalal Laddha Maheshwari College                                      |");
                        System.out.println(
                                        "|_____________________________________________________________________________________________|");
                        System.out.println(
                                        "|                |                           |                                                |");
                        System.out.println(
                                        "| SUBJECT NAME   |      Scheme of Marks      |  Marks Obtained                                |");
                        System.out.println(
                                        "|________________|___________________________|________________________________________________|");
                        System.out.println(
                                        "|                |                           |                                                |");
                        int Total = 0;
                        for (int i = 0; k == 0 && i < objArray[k].sem1Sub.length; i++) {
                                if (i >= 0 && i <= 2) {
                                        if (objArray[k].result[i] == true)
                                                System.out.println("| " + objArray[k].sem1Sub[i] + "    |        "
                                                                + objArray[k].marks[i]
                                                                + "                 |         100                                    |");
                                        else
                                                System.out.println("| " + objArray[k].sem1Sub[i] + "    |        "
                                                                + objArray[k].marks[i]
                                                                + "                 |         100                    ATKT            |");
                                } else if (i >= 3 && i <= 4) {
                                        if (objArray[k].result[i] == true)
                                                System.out.println("| " + objArray[k].sem1Sub[i] + "    |        "
                                                                + objArray[k].marks[i]
                                                                + "                 |         75                                    |");
                                        else
                                                System.out.println("| " + objArray[k].sem1Sub[i] + "    |        "
                                                                + objArray[k].marks[i]
                                                                + "                 |         75                    ATKT            |");
                                } else if (i >= 5 && i <= 6) {
                                        if (objArray[k].result[i] == true)
                                                System.out.println("| " + objArray[k].sem1Sub[i] + "    |        "
                                                                + objArray[k].marks[i]
                                                                + "                 |         25                                     |");
                                        else
                                                System.out.println("| " + objArray[k].sem1Sub[i] + "    |        "
                                                                + objArray[k].marks[i]
                                                                + "                 |         25                    ATKT             |");
                                }
                                Total = Total + objArray[k].marks[i];
                        }
                        for (int i = 0; k == 1 && i < objArray[k].sem2Sub.length; i++) {
                                if (i >= 0 && i <= 2) {
                                        if (objArray[k].result[i] == true)
                                                System.out.println("| " + objArray[k].sem2Sub[i] + "    |        "
                                                                + objArray[k].marks[i]
                                                                + "                 |         100                                    |");
                                        else
                                                System.out.println("| " + objArray[k].sem2Sub[i] + "    |        "
                                                                + objArray[k].marks[i]
                                                                + "                 |         100                    ATKT            |");
                                } else if (i >= 3 && i <= 4) {
                                        if (objArray[k].result[i] == true)
                                                System.out.println("| " + objArray[k].sem2Sub[i] + "    |        "
                                                                + objArray[k].marks[i]
                                                                + "                 |         75                                    |");
                                        else
                                                System.out.println("| " + objArray[k].sem2Sub[i] + "    |        "
                                                                + objArray[k].marks[i]
                                                                + "                 |         75                    ATKT            |");
                                } else if (i >= 5 && i <= 6) {
                                        if (objArray[k].result[i] == true)
                                                System.out.println("| " + objArray[k].sem2Sub[i] + "    |        "
                                                                + objArray[k].marks[i]
                                                                + "                 |         25                                     |");
                                        else
                                                System.out.println("| " + objArray[k].sem2Sub[i] + "    |        "
                                                                + objArray[k].marks[i]
                                                                + "                 |         25                    ATKT             |");
                                }
                                Total = Total + objArray[k].marks[i];
                        }
                        for (int i = 0; (k == 2) && (i < objArray[k].sem3Sub.length); i++) {
                                if (i >= 0 && i <= 2) {
                                        if (objArray[k].result[i] == true)
                                                System.out.println("| " + objArray[k].sem3Sub[i] + "    |        "
                                                                + objArray[k].marks[i]
                                                                + "                 |         100                                    |");
                                        else
                                                System.out.println("| " + objArray[k].sem3Sub[i] + "    |        "
                                                                + objArray[k].marks[i]
                                                                + "                 |         100                    ATKT            |");
                                } else if (i >= 3 && i <= 4) {
                                        if (objArray[k].result[i] == true)
                                                System.out.println("| " + objArray[k].sem3Sub[i] + "    |        "
                                                                + objArray[k].marks[i]
                                                                + "                 |         75                                    |");
                                        else
                                                System.out.println("| " + objArray[k].sem3Sub[i] + "    |        "
                                                                + objArray[k].marks[i]
                                                                + "                 |         75                    ATKT            |");
                                } else if (i >= 5 && i <= 6) {
                                        if (objArray[k].result[i] == true)
                                                System.out.println("| " + objArray[k].sem3Sub[i] + "    |        "
                                                                + objArray[k].marks[i]
                                                                + "                 |         25                                     |");
                                        else
                                                System.out.println("| " + objArray[k].sem3Sub[i] + "    |        "
                                                                + objArray[k].marks[i]
                                                                + "                 |         25                    ATKT             |");
                                }
                                Total = Total + objArray[k].marks[i];
                        }
                        for (int i = 0; (k == 3) && (i < objArray[k].sem4Sub.length); i++) {
                                if (i >= 0 && i <= 2) {
                                        if (objArray[k].result[i] == true)
                                                System.out.println("| " + objArray[k].sem4Sub[i] + "    |        "
                                                                + objArray[k].marks[i]
                                                                + "                 |         100                                    |");
                                        else
                                                System.out.println("| " + objArray[k].sem4Sub[i] + "    |        "
                                                                + objArray[k].marks[i]
                                                                + "                 |         100                    ATKT            |");
                                } else if (i >= 3 && i <= 4) {
                                        if (objArray[k].result[i] == true)
                                                System.out.println("| " + objArray[k].sem4Sub[i] + "    |        "
                                                                + objArray[k].marks[i]
                                                                + "                 |         75                                    |");
                                        else
                                                System.out.println("| " + objArray[k].sem4Sub[i] + "    |        "
                                                                + objArray[k].marks[i]
                                                                + "                 |         75                    ATKT            |");
                                } else if (i >= 5 && i <= 6) {
                                        if (objArray[k].result[i] == true)
                                                System.out.println("| " + objArray[k].sem4Sub[i] + "    |        "
                                                                + objArray[k].marks[i]
                                                                + "                 |         25                                     |");
                                        else
                                                System.out.println("| " + objArray[k].sem4Sub[i] + "    |        "
                                                                + objArray[k].marks[i]
                                                                + "                 |         25                    ATKT             |");
                                }
                                Total = Total + objArray[k].marks[i];
                        }
                        for (int i = 0; (k == 4) && (i < objArray[k].sem5Sub.length); i++) {
                                if (i >= 0 && i <= 2) {
                                        if (objArray[k].result[i] == true)
                                                System.out.println("| " + objArray[k].sem5Sub[i] + "    |        "
                                                                + objArray[k].marks[i]
                                                                + "                 |         100                                    |");
                                        else
                                                System.out.println("| " + objArray[k].sem5Sub[i] + "    |        "
                                                                + objArray[k].marks[i]
                                                                + "                 |         100                    ATKT            |");
                                } else if (i >= 3 && i <= 4) {
                                        if (objArray[k].result[i] == true)
                                                System.out.println("| " + objArray[k].sem5Sub[i] + "    |        "
                                                                + objArray[k].marks[i]
                                                                + "                 |         75                                    |");
                                        else
                                                System.out.println("| " + objArray[k].sem5Sub[i] + "    |        "
                                                                + objArray[k].marks[i]
                                                                + "                 |         75                    ATKT            |");
                                } else if (i >= 5 && i <= 6) {
                                        if (objArray[k].result[i] == true)
                                                System.out.println("| " + objArray[k].sem5Sub[i] + "    |        "
                                                                + objArray[k].marks[i]
                                                                + "                 |         25                                     |");
                                        else
                                                System.out.println("| " + objArray[k].sem5Sub[i] + "    |        "
                                                                + objArray[k].marks[i]
                                                                + "                 |         25                    ATKT             |");
                                }
                                Total = Total + objArray[k].marks[i];
                        }
                        for (int i = 0; (k == 5) && (i < objArray[k].sem6Sub.length); i++) {
                                if (i >= 0 && i <= 2) {
                                        if (objArray[k].result[i] == true)
                                                System.out.println("| " + objArray[k].sem6Sub[i] + "    |        "
                                                                + objArray[k].marks[i]
                                                                + "                 |         100                                    |");
                                        else
                                                System.out.println("| " + objArray[k].sem6Sub[i] + "    |        "
                                                                + objArray[k].marks[i]
                                                                + "                 |         100                    ATKT            |");
                                } else if (i >= 3 && i <= 4) {
                                        if (objArray[k].result[i] == true)
                                                System.out.println("| " + objArray[k].sem6Sub[i] + "    |        "
                                                                + objArray[k].marks[i]
                                                                + "                 |         75                                    |");
                                        else
                                                System.out.println("| " + objArray[k].sem6Sub[i] + "    |        "
                                                                + objArray[k].marks[i]
                                                                + "                 |         75                    ATKT            |");
                                } else if (i >= 5 && i <= 6) {
                                        if (objArray[k].result[i] == true)
                                                System.out.println("| " + objArray[k].sem6Sub[i] + "    |        "
                                                                + objArray[k].marks[i]
                                                                + "                 |         25                                     |");
                                        else
                                                System.out.println("| " + objArray[k].sem6Sub[i] + "    |        "
                                                                + objArray[k].marks[i]
                                                                + "                 |         25                    ATKT             |");
                                }
                                Total = Total + objArray[k].marks[i];
                        }

                        System.out.println(
                                        "|---------------------------------------------------------------------------------------------|");
                        System.out.println("|    Total       |        " + Total
                                        + "                |          460                                   |");
                        System.out.println(
                                        "|________________|___________________________|________________________________________________|");
                        System.out.println(
                                        "|                                                                                             |");
                        if (supplyCountArray[k] > 0 && supplyCountArray[k] <= 2) {
                                System.out.println(
                                                "| Result :  Supply                                                                            |");
                        } else if (supplyCountArray[k] > 2) {
                                System.out.println(
                                                "| Result :  Fail                                                                              |");
                        } else {
                                System.out.println(
                                                "| Result :  PASS                                                                              |");
                        }
                        System.out.println(
                                        "|=============================================================================================|");
                        System.out.println("\n\nYou Are Pramoted In Next Sem " + (k + 2));
                }
        }
}