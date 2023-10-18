
/*Create three classes  Faculty  (facultyid, salary), FullTimeFaculty  (basic, allowance) 
inherits class Faculty, PartTimeFaculty  (hour, rate) inherits class Faculty. 
Create   a   method   for   accepting   input   in   FullTimeFaculty       and  PartTimeFaculty,
but   salary  should   not   be   accepted.    salary   is  calculated   on   the   basis  
of   (basic+allowance)   for   FullTimeFaculty   and  (hour*rate)   for   PartTimeFaculty.  
Also   create   method   in   above   classes   to  display faculty data. 
Create   another   class(say   XYZ)   for   main   method   and   store   2 fulltime and 2
 parttime faculty information. Also print their details. 
*/
import java.util.Scanner;

class Faculty {
    private int facultyId;
    protected float salary;

    public Faculty(int facultyId, float salary) {
        this.facultyId = facultyId;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Faculty Id " + facultyId);
        System.out.println("Salary " + salary);
    }
}

class FullTimeFaculty extends Faculty {
    private float basic, allowance;

    public FullTimeFaculty(int facultyId, float salary, float basic, float allowance) {
        super(facultyId, 0);
        this.basic = basic;
        this.allowance = allowance;

    }

    public void calculateSalary() {
        super.salary = basic + allowance;
    }

}

class PartTimeFaculty extends Faculty {
    private int hour;
    private float rate;

    public PartTimeFaculty(int facultyId, float salary, int hour, int rate) {
        super(facultyId, 0);
        this.hour = hour;
        this.rate = rate;
    }

    public void  calculateSalary() {
        super.salary = hour * rate;
     
    }
}

class Main {
    public static void main(String[] args) {

        FullTimeFaculty fullTime1 = new FullTimeFaculty(1, 10000, 200, 5000);
        FullTimeFaculty fullTime2 = new FullTimeFaculty(2, 20000, 500, 6000);
        PartTimeFaculty partTime1 = new PartTimeFaculty(3, 40000, 3, 400);
        PartTimeFaculty partTime2 = new PartTimeFaculty(4, 50000, 4, 500);
        fullTime1.calculateSalary();
        fullTime2.calculateSalary();
        partTime1.calculateSalary();
        partTime2.calculateSalary();

        fullTime1.display();
        fullTime2.display();
        partTime1.display();
        partTime2.display();

    }
}