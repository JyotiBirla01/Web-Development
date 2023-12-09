//------------------Comparable------------------------
import java.util.TreeSet;

public class Student_Comparable implements Comparable<Student_Comparable> {
    private int rollNo;
    private String name;
    private String address;
    private long contact;

    public Student_Comparable() {

    }

    public Student_Comparable(int rollNo, String name, String address, long contact) {
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

    public int compareTo(Student_Comparable s) {
        return this.rollNo - s.rollNo;
    }

    public String toString() {
        return rollNo + " " + name + " " + address + " " + contact;
    }
}



class Main {
    public static void main(String[] args) {
       
        TreeSet<Student_Comparable> ts = new TreeSet<Student_Comparable>();
        ts.add(new Student_Comparable(106, "Ram", "Indore ", 782831524));
        ts.add(new Student_Comparable(102, "Krishna ", " Bhopal", 95835552));
        ts.add(new Student_Comparable(104, "Radha ", "Mumbai", 23454363));
        ts.add(new Student_Comparable(103, "Rani ", "Indore ", 78342545));
        ts.add(new Student_Comparable(105, "Ram ", "Agra  ", 78342545));
        ts.add(new Student_Comparable(101, "Jyoti ", "Goa  ", 987686555));
        ts.add(new Student_Comparable(101, "Hari ", "Goa  ", 987686555));
        for (Student_Comparable data : ts) {
            System.out.println(data);
        }
    }
}
