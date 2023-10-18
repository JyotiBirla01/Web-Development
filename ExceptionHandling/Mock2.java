import java.io.*;

class MyClass implements Serializable {
    // Non-static instance variable
    private int nonStaticVar = 10;

    // Static variable
    private static int staticVar = 20;

    public MyClass(int nonStaticVar) {
        this.nonStaticVar = nonStaticVar;
    }

    public void printVariables() {
        System.out.println("Non-Static Variable: " + nonStaticVar);
        System.out.println("Static Variable: " + staticVar);
    }
}
 class TransientExample {
    public static void main(String[] args) {
        try {
            // Serialize the object
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("object.ser"));
            MyClass obj = new MyClass(100);
            obj.printVariables();
            out.writeObject(obj);
            out.close();

            // Deserialize the object
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("object.ser"));
            MyClass deserializedObj = (MyClass) in.readObject();
            in.close();

            // Print variables of deserialized object
            deserializedObj.printVariables();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
