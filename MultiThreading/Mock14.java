import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

 class P88 implements Serializable {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    private String address;
    public P88(String name, String address) {
        this.name = name;
        this.address = address;
    }
    
}
public class P8{
    public static void main(String[] args) throws IOException {
        ArrayList<P88> l = new ArrayList<P88>();
        l.add(new P88("cust1", "bho"));
        l.add(new P88("cust2", "bho"));
        l.add(new P88("cust3", "bho"));
        l.add(new P88("cust4", "bho"));
        FileOutputStream writeData = new FileOutputStream("abc.txt");
    ObjectOutputStream writeStream = new ObjectOutputStream(writeData);

    writeStream.writeObject(l);
    writeStream.flush();
    writeStream.close();
        
        
    }
}