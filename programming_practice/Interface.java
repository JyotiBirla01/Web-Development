//write a program in java a  class teacher contain two felid  name and qualification extends the class to department
// it contain department name and department number and  interface name of the college which have the name of college name using above class and interface
// and print the appropriate information
interface I {
    void collegeName();
}

class Dept implements I {
    private String Dept_Name;
    private int Dept_Number;

    public Dept(String Dept_Name, int Dept_Number) {
        this.Dept_Name = Dept_Name;
        this.Dept_Number = Dept_Number;
    }

    public void show1() {
        System.out.println("Department Name = " + Dept_Name + "   Department Number " + Dept_Number);
    }

    public void collegeName() {
        System.out.println("Shree rewa gurjar bal niketan College");
    }
}

class Teacher extends Dept {
    private String name;
    private String qualification;

    public Teacher(String name, String qualification) {
        super(" Computer Science", 1201);
        this.name = name;
        this.qualification = qualification;
    }

    public void show() {
        System.out.println("Teacher Name = " + name + "  Teacher Qualification = " + qualification);
    }
}

class Main {
    public static void main(String args[]) {
        Teacher obj = new Teacher(" Shreya ma'am", "MCA");
        obj.show1();
        obj.show();
    }
}