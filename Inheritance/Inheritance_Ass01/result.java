/*you are a student of BCA and you have to give exam of each subject if you get ATKT at least 2 sub then 
you will be fail and ATKT status must be highlighted in red color.every subject have 6 theory and 2 practical paper. 
but if you pass in all paper then you can give next sem exam and print result .
in the last you must print the degree and migration of davv. */
import java.util.Scanner;
class Result  {
	private String Exam_Name,Enrollment_No;
	private int roll_no;
	private String Name,Father_Name,Status,College;
	public Result(String Exam_Name, String Enrollment_No, int roll_no, String Name, String Father_Name, String Status, String College) {
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
		System.out.println("\n   "+txt);
		System.out.println("\t\t\t\t STATEMENT OF MARKS ");
	//	System.out.println(txt.setFont(Font.font("verdana",FontWeight.BOLD, FontPosture.REGULAR,20)));
		System.out.println("\t\t\t\t\tRESULT\n");
		System.out.println("____________________________________________________________________________________________________");
		System.out.println("|Exam Name:\t"+Exam_Name+" \t\tEnrollment No.:  "+Enrollment_No+"\t Roll No.:  "+roll_no+"  |");
		System.out.println("----------------------------------------------------------------------------------------------------");
		System.out.println("|Name: \t \t"+Name + "\tFather Name:\t "+Father_Name+"\t \t"+" \t\t|");
		System.out.println("----------------------------------------------------------------------------------------------------");
		System.out.println("|Status: \t"+Status+"\t \t\tCollege:  \t"+College+"  \t|");
		System.out.println("----------------------------------------------------------------------------------------------------");
	}
}

class Marks {
	public int atkt = 0, count = 0;
	public Marks(String p[], int mark[]) {
		int max[] = {50,50,50,50,50,50,25,25};
		int min[] = {17,17,17,17,17,17,07,07};
		int  count1 = 0; String ch=""; int total = 0; 
		System.out.println("\t\t      SCEME OF MARKS \t MARKS OBTAINED ");
		System.out.println("SUBJECTS/PAPERS   \tMax \tMin   \t\tTotal");
		for(int i=0; i<p.length; i++) {
			for(int j=i; j<=i; j++) {
				for(int k=j; k<=j; k++) { 
					for(int l=k; l<=k; l++) {
						if(mark[j]<0 || mark[j]>50 || mark[6]<0|| mark[6]>25 || mark[7]<0 || mark[7]>25) {
							count ++;
						}
						else {
							total=total+mark[j];
						}
						int a = 2;
						if(mark[j]<17 && mark[j]>0 || mark[6]<7 || mark[7]<7 )  {
							count1++;
							ch = "ATKT";
						}
						if(count1<9){
							System.out.println(p[i]+" \t\t"+max[k]+"\t"+min[l]+"\t\t"+mark[j]+" "+ch);
							ch = "";
						}
					}
				}
			}
		}
		if(count1>2) {
			System.out.println("\n\n\t\t\t FAILED");
			atkt = count1;
			count1 = 0;
		}
		else if(count==0 && count1==0) {
			System.out.println("\n\t\t\t\tPASS");
		}
		else if(count1<3) {
			System.out.println("\n\t\t\tATKT");
		count1=0;
		}
		if(total<350 && total>=0)
			System.out.println("\n\t\t\t350      TOTAL: \t"+total);
		 if(count>0)
			System.out.println("\n\n NOTE:-   You have entered invalid marks ");
	}
	public int invalid() {
		return count;
	}
	public int set() {
		return atkt;
	}
}

class Input {
	String s1[] = new String[8];
	int mark[] = new int[8];
	Scanner sc = new Scanner(System.in);
	public String[] in1() {
	for(int i=0; i<s1.length; i++) {
		System.out.println("Enter the "+(i+1)+" paper name : ");
		if(i==0) {
			s1[0] = sc.nextLine();
			s1[0] = sc.nextLine();
		}
		else {
			s1[i] = sc.nextLine();
	}
	}
		return s1;
	}
	public int[] in2() {
	for(int j=0; j<mark.length; j++) {
		System.out.println("Enter the "+(j+1)+" paper marks : ");
		mark[j] = sc.nextInt();
		}
		return mark;
	}
}

class Main {
	public static void main(String args[] ) {
	// 1st semster
	System.out.println("\n\n\n\t\t\t\t Now, Give 1st semster Exam ");
	Result obj = new Result("B.C.A. SEM-1","GKMPM7592B",30420105,"PRAVEEN MUKATI","HARERAM","REGULAR","SD BANSAL COLLEGE, INDORE");
	obj.show();
	Input Inp1 = new Input();
	Marks m1 = new Marks(Inp1.in1(), Inp1.in2());
	for(int i=0;i<=3;i++) {
	if(m1.set()>2 || m1.invalid()>0) {
	System.out.println("\n\n\t\t\t\tYou have failed, Give the exam again");
	Result obj11 = new Result("B.C.A. SEM-1","GKMPM7592B",30420105,"PRAVEEN MUKATI","HARERAM","REGULAR","SD BANSAL COLLEGE, INDORE");
	obj11.show();
	Input Inp11 = new Input();
	Marks m11 = new Marks(Inp11.in1(), Inp11.in2());
	if(m11.set()==0)
		break;
		}
	}
	// 2nd semster
	System.out.println("\n\n\n\t\t\t\t Now, Give 2nd semster Exam ");
	Result obj1 = new Result("B.C.A. SEM-2","GKMPM7592B",30420105,"PRAVEEN MUKATI","HARERAM","REGULAR","SD BANSAL COLLEGE, INDORE");
	obj1.show();
	Input Inp2 = new Input();
	Marks m2 = new Marks(Inp1.in1(), Inp1.in2());
	for(int i=0; i<=3; i++) {
	if(m2.set()>2|| m2.invalid()>0) {
	System.out.println("\n\n\t\t\t\tYou have failed, Give the exam again");
	Result obj12 = new Result("B.C.A. SEM-2","GKMPM7592B",30420105,"PRAVEEN MUKATI","HARERAM","REGULAR","SD BANSAL COLLEGE, INDORE");
	obj12.show();
	Input Inp12 = new Input();
	Marks m12 = new Marks(Inp12.in1(), Inp12.in2());
	if(m12.set()==0)
		break;
		}
	}
	// 3rd semster
	System.out.println("\n\n\n\t\t\t\t Now, Give 3rd semster Exam ");
	Result obj2 = new Result("B.C.A. SEM-3","GKMPM7592B",30420105,"PRAVEEN MUKATI","HARERAM","REGULAR","SD BANSAL COLLEGE, INDORE");
	obj2.show();
	Input Inp3 = new Input();
	Marks m3 = new Marks(Inp1.in1(), Inp1.in2());
	for(int i=0; i<=3; i++) {
	if(m3.set()>2|| m3.invalid()>0) {
	System.out.println("\n\n\t\t\t\tYou have failed, Give the exam again");
	Result obj13 = new Result("B.C.A. SEM-3","GKMPM7592B",30420105,"PRAVEEN MUKATI","HARERAM","REGULAR","SD BANSAL COLLEGE, INDORE");
	obj13.show();
	Input Inp13 = new Input();
	Marks m13 = new Marks(Inp13.in1(), Inp13.in2());
	if(m13.set()==0)
		break;
		}
	}
	
	// 4th semster
	System.out.println("\n\n\n\t\t\t\t Now, Give 4th semster Exam ");
	Result obj3 = new Result("B.C.A. SEM-4","GKMPM7592B",30420105,"PRAVEEN MUKATI","HARERAM","REGULAR","SD BANSAL COLLEGE, INDORE");
	obj3.show();
	Input Inp4 = new Input();
	Marks m4 = new Marks(Inp4.in1(), Inp4.in2());
	for(int i=0; i<=3; i++) {
	if(m4.set()>2|| m4.invalid()>0) {
	System.out.println("\n\n\t\t\t\tYou have failed, Give the exam again");
	Result obj14 = new Result("B.C.A. SEM-4","GKMPM7592B",30420105,"PRAVEEN MUKATI","HARERAM","REGULAR","SD BANSAL COLLEGE, INDORE");
	obj14.show();
	Input Inp14 = new Input();
	Marks m14 = new Marks(Inp14.in1(), Inp14.in2());
	if(m14.set()==0)
		break;
		}
	}
	
	// 5th semster
	System.out.println("\n\n\n\t\t\t\t Now, Give 5th semster Exam ");
	Result obj4 = new Result("B.C.A. SEM-5","GKMPM7592B",30420105,"PRAVEEN MUKATI","HARERAM","REGULAR","SD BANSAL COLLEGE, INDORE");
	obj4.show();
	Input Inp5 = new Input();
	Marks m5 = new Marks(Inp1.in1(), Inp1.in2());
	for(int i=0; i<=3; i++) {
	if(m5.set()>2|| m5.invalid()>0) {
	System.out.println("\n\n\t\t\t\tYou have failed, Give the exam again");
	Result obj15 = new Result("B.C.A. SEM-5","GKMPM7592B",30420105,"PRAVEEN MUKATI","HARERAM","REGULAR","SD BANSAL COLLEGE, INDORE");
	obj15.show();
	Input Inp15 = new Input();
	Marks m15 = new Marks(Inp15.in1(), Inp15.in2());
	if(m15.set()==0)
		break;
		}
	}
	
	// 6th semster
	System.out.println("\n\n\n\t\t\t\t Now, Give 6th semster Exam ");
	Result obj5 = new Result("B.C.A. SEM-6","GKMPM7592B",30420105,"PRAVEEN MUKATI","HARERAM","REGULAR","SD BANSAL COLLEGE, INDORE");
	obj5.show();
	Input Inp6 = new Input();
	Marks m6 = new Marks(Inp1.in1(), Inp1.in2());
	for(int i=0; i<=3; i++) {
	if(m6.set()>2|| m6.invalid()>0) {
	System.out.println("\n\n\t\t\t\tYou have failed, Give the exam again");
	Result obj16 = new Result("B.C.A. SEM-6","GKMPM7592B",30420105,"PRAVEEN MUKATI","HARERAM","REGULAR","SD BANSAL COLLEGE, INDORE");
	obj16.show();
	Input Inp16 = new Input();
	Marks m16 = new Marks(Inp16.in1(), Inp16.in2());
	if(m16.set()==0)
		break;
			}
		}
	}
}