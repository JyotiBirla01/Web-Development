
//write a program in java a  class teacher contain two felid  name and qualification extends the class to department
// it contain department name and department number and  interface name of the college which have the name of college name using above class and interface
// and print the appropriate information
import java.util.Scanner;

interface college {
    void information();

}

class Department implements college {
    int depNo;
    String depName;

    public Department(int depNo, String depName) {
        this.depNo = depNo;
        this.depName = depName;

    }

    public void information() {
        System.out.println(depNo);
        System.out.println(depName);

    }

}

class Teacher extends Department {
    String name;
    String qualification;

    public Teacher(int depNo, String depName, String name, String qualification) {
        super(depNo, depName);
        this.name = name;
        this.qualification = qualification;
    }

    public void information() {
        System.out.println("Depatment Number :" + depNo);
        System.out.println(" Depatment name : " + depName);
        System.out.println(" Teacher Name :" + name);
        System.out.println("Qualification  :" + qualification);

    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the depatment number ");
        int depNo = sc.nextInt();
        System.out.println("Enter the department name");
        String depName1 = sc.nextLine();
        String depName = sc.nextLine();
        System.out.println("Enter the name");
        String name = sc.nextLine();
        System.out.println("Enter the qualification");
        String qualification = sc.nextLine();
        Teacher t = new Teacher(depNo, depName, name, qualification);
        t.information();
    }
}