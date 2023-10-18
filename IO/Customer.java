
import java.io.Serializable;

class Customer implements Serializable {
    // private static final long SerialVersionUID = 10l;

    private int id;
    private String name;
    private int age;
    private int mobile;

    // private char gender;
    public Customer(int id, String name, int age, int mobile) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mobile = mobile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int  getMobile() {
        return mobile;
    }

    public void setMobile(int  mobile) {
        this.mobile = mobile;
    }
}