
/*
you are a student of BCA and you have to give exam of each subject if you get ATKT at least 2 sub then 
you will be fail and ATKT status must be highlighted in red color.every subject have 6 theory and 2 practical paper. 
but if you pass in all paper then you can give next sem exam and print result .
in the last you must print the degree and migration of davv. */
import java.util.Scanner;

class Result {
    private String Exam_Name, Enrollment_No;
    private int roll_no;
    private String Name, Father_Name, Status, College;

    public Result(String Exam_Name, String Enrollment_No, int roll_no, String Name, String Father_Name, String Status,
            String College) {
        this.Exam_Name = Exam_Name;
        this.Enrollment_No = Enrollment_No;
        this.roll_no = roll_no;
        this.Name = Name;
        this.Father_Name = Father_Name;
        this.Status = Status;
        this.College = College;
    }

    public void show() {
        String txt = "\t\t\tDEVI AHILYA VISHWAVIDYALAYA, INDORE";
        System.out.println("\n   " + txt);
        System.out.println("\t\t\t\t STATEMENT OF MARKS ");
        // System.out.println(txt.setFont(Font.font("verdana",FontWeight.BOLD,
        // FontPosture.REGULAR,20)));
        System.out.println("\t\t\t\t\tRESULT\n");
        System.out.println(
                "____________________________________________________________________________________________________");
        System.out.println("|Exam Name:\t" + Exam_Name + " \t\tEnrollment No.:  " + Enrollment_No + "\t Roll No.:  "
                + roll_no + "  |");
        System.out.println(
                "----------------------------------------------------------------------------------------------------");
        System.out.println("|Name: \t \t" + Name + "\tFather Name:\t " + Father_Name + "\t \t" + " \t\t|");
        System.out.println(
                "----------------------------------------------------------------------------------------------------");
        System.out.println("|Status: \t" + Status + "\t \t\tCollege:  \t" + College + "  \t|");
        System.out.println(
                "----------------------------------------------------------------------------------------------------");
    }
}

class Marks {
    public Marks(String p[], int mark[]) {
        int max[] = { 50, 50, 50, 50, 50, 50, 25, 25 };
        int min[] = { 17, 17, 17, 17, 17, 17, 07, 07 };
        int count = 0, count1 = 0;
        String ch = "";
        int total = 0;
        for (int i = 0; i < p.length; i++) {
            for (int j = i; j <= i; j++) {
                for (int k = j; k <= j; k++) {
                    for (int l = k; l <= k; l++) {
                        if (mark[j] < 0 || mark[j] > 50 || mark[6] < 0 || mark[6] > 25 || mark[7] < 0 || mark[7] > 25) {
                            count++;
                        } else {
                            total = total + mark[j];
                        }
                        if (mark[j] < 17 && mark[j] > 0 || mark[7] < 7 && mark[6] > 0 || mark[7] < 7 && mark[7] > 0) {
                            count1++;
                            ch = "ATKT";
                        }
                        if (count1 < 9) {
                            System.out.println(p[i] + " \t\t" + max[k] + "\t" + min[l] + "\t\t" + mark[j] + " " + ch);
                            ch = "";
                        }
                    }
                }
            }
        }
        if (count1 > 2) {
            System.out.println("\n\n FAILED");
            count1 = 0;
        } else if (count == 0 && count1 == 0) {
            System.out.println("\n\t\t\t\tPASS");
        } else if (count1 < 3) {
            System.out.println("\n\t\t\tATKT");
            count1 = 0;
        }
        if (total < 350 && total >= 0)
            System.out.println("\n\t\t\t350      TOTAL: \t" + total);
        // public int count() {
        // int temp = count1;
        // return temp;
        // }
        if (count > 0)
            System.out.println("\n\n NOTE:-   You have entered invalid marks ");
    }
}

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // 1st semster
        String s1[] = new String[8];
        int mark[] = new int[8];
        for (int i = 0; i < s1.length; i++) {
            System.out.println("Enter the " + (i + 1) + " paper name : ");
            s1[i] = sc.nextLine();
        }
        for (int j = 0; j < mark.length; j++) {
           
        }
        Result obj = new Result("B.C.A. SEM-1", "DX2006612", 30420104, "BHOLA VISHWKARMA", "SUBHASH", "REGULAR",
                "R.P.L.MAHESHWARI MAHAVIDYALAYA, INDORE");
        obj.show();
        Marks m1 = new Marks(s1, mark);
        // if(m1.count()>2) {
        // Marks m1 = new Marks(s1,mark);
        // }
        // else
        // {
        // continue;
        // }
        // 2nd semster
        System.out.println();
        String s2[] = new String[8];
        int mark2[] = new int[8];
        for (int i = 0; i < s2.length; i++) {
            System.out.println("Enter the " + (i + 1) + " paper name : ");
            s2[i] = sc.next();
        }
        for (int j = 0; j < mark2.length; j++) {
            System.out.println("Enter the " + (j + 1) + " paper marks : ");
            mark2[j] = sc.nextInt();
        }
        Result obj1 = new Result("B.C.A. SEM-2", "DX2006612", 30420104, "BHOLA VISHWKARMA", "SUBHASH", "REGULAR",
                "R.P.L.MAHESHWARI MAHAVIDYALAYA, INDORE");
        obj1.show();
        Marks m2 = new Marks(s2, mark2);
        // 3rd semster
        String s3[] = new String[8];
        int mark3[] = new int[8];
        for (int i = 0; i < s3.length; i++) {
            System.out.println("Enter the " + (i + 1) + " paper name : ");
            s3[i] = sc.next();
        }
        for (int j = 0; j < mark3.length; j++) {
            System.out.println("Enter the " + (j + 1) + " paper marks : ");
            mark3[j] = sc.nextInt();
        }
        Result obj2 = new Result("B.C.A. SEM-3", "DX2006612", 30420104, "BHOLA VISHWKARMA", "SUBHASH", "REGULAR",
                "R.P.L.MAHESHWARI MAHAVIDYALAYA, INDORE");
        obj2.show();
        Marks m3 = new Marks(s3, mark3);
        // 4th semster
        String s4[] = new String[8];
        int mark4[] = new int[8];
        for (int i = 0; i < s4.length; i++) {
            System.out.println("Enter the " + (i + 1) + " paper name : ");
            s4[i] = sc.next();
        }
        for (int j = 0; j < mark4.length; j++) {
            System.out.println("Enter the " + (j + 1) + " paper marks : ");
            mark4[j] = sc.nextInt();
        }
        Result obj3 = new Result("B.C.A. SEM-4", "DX2006612", 30420104, "BHOLA VISHWKARMA", "SUBHASH", "REGULAR",
                "R.P.L.MAHESHWARI MAHAVIDYALAYA, INDORE");
        obj3.show();
        Marks m4 = new Marks(s4, mark4);
        // 5th semster
        String s5[] = new String[8];
        int mark5[] = new int[8];
        for (int i = 0; i < s1.length; i++) {
            System.out.println("Enter the " + (i + 1) + " paper name : ");
            s5[i] = sc.next();
        }
        for (int j = 0; j < mark5.length; j++) {
            System.out.println("Enter the " + (j + 1) + " paper marks : ");
            mark5[j] = sc.nextInt();
        }
        Result obj4 = new Result("B.C.A. SEM-5", "DX2006612", 30420104, "BHOLA VISHWKARMA", "SUBHASH", "REGULAR",
                "R.P.L.MAHESHWARI MAHAVIDYALAYA, INDORE");
        obj4.show();
        Marks m5 = new Marks(s5, mark5);
        // 6th semster
        String s6[] = new String[8];
        int mark6[] = new int[8];
        for (int i = 0; i < s6.length; i++) {
            System.out.print("Enter the " + (i + 1) + " paper name : ");
            s6[i] = sc.next();
        }
        for (int j = 0; j < mark6.length; j++) {
            System.out.print("Enter the " + (j + 1) + " paper marks : ");
            mark6[j] = sc.nextInt();
        }
        Result obj5 = new Result("B.C.A. SEM-6", "DX2006612", 30420104, "BHOLA VISHWKARMA", "SUBHASH", "REGULAR",
                "R.P.L.MAHESHWARI MAHAVIDYALAYA, INDORE");
        obj5.show();
        Marks m6 = new Marks(s6, mark6);
    }
}