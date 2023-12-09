//----------------Comparator----------------------
import java.util.Comparator;
import java.util.TreeSet;

class Student  {
    private int rollNo;
    private String name;
    private String address;
    private long contact;

    public Student() {

    }

    public Student(int rollNo, String name, String address, long contact) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
        this.contact = contact;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public long getContact() {
        return contact;
    }

    // public int compareTo(Student s) {
    //     return this.rollNo;
    // }

    public String toString() {
        return rollNo + " " + name + " " + address + " " + contact;
    }
}

class SortByRollNo implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.getRollNo() - (s2.getRollNo());
    }

}

class SortByName implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}

class Main {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<Student>(new SortByRollNo());
       // TreeSet<Student> ts = new TreeSet<Student>(new SortByName());
        ts.add(new Student(102, "Ram", "Indore ", 782831524));
        ts.add(new Student(104, "Krishna ", " Bhopal", 95835552));
        ts.add(new Student(103, "Radha ", "Mumbai", 23454363));
        ts.add(new Student(101, "Rani ", "Indore ", 78342545));
        ts.add(new Student(105, "Rani ", "Indore ", 78342545));

        for (Student data : ts) {
            System.out.println(data);
        }
    }
}
