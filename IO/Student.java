
/*Que. 2 What is Serialization ? Write a java program to store the object into the file. */
//import java.io.File;
import java.io.Serializable;

class Student implements Serializable {
    private String name;
    private int rollNumber;
    private String address;
    private String className;
 //transient private String className;
    public Student(String name, int rollNumber, String address, String className) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.address = address;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

}
