// Que. 3 Explain transient keyword in java with example.
import java.util.*;
import java.io.*;
class Student implements Serializable {
	private String name;
	private String address;
	private int roll_number;
	transient private int age;
	public Student(String name, String address, int roll_number, int age) {
		this.name = name;
		this.address  = address;
		this.roll_number = roll_number;
		this.age = age;
	}
}
class Main {
	public static void main(String args[]) throws Exception{
		Student s1 = new Student("Parth Sharma","New goving colony",30420104,20);
		FileOutputStream file = new FileOutputStream("student.txt");
		ObjectOutputStream fout = new ObjectOutputStream(file);
		fout.writeObject(s1);
		fout.flush();
		fout.close();
		file.close();
		System.out.println("Success");
	}
}