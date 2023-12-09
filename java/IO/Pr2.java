 /*Que. 2 What is Serialization ? Write a java program to store the object into the file. */
//import java.io.File;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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



    public static void main(String[] args)  {
        
        try {
            File f = new File("Pr2.txt");
            if (!f.exists())
                f.createNewFile();
            FileOutputStream fo = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fo);
            Student s = new Student("Pooja ", 101, "Indore", "12th ");
            oos.writeObject(s);
            oos.close();
            System.out.println(" Operation success ");

        } catch (Exception e) {
            e.printStackTrace();  

        }
         try {
            FileInputStream fis = new FileInputStream("Pr2.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student s = (Student) ois.readObject();
            System.out.println(s.getName() + " " + s.getRollNumber() + " " + s.getAddress() + " " + s.getClassName());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}