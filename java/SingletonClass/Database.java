
public class Database {
    String driver = "ABC";
    String Password = "XYZ";
    static Database d = new Database();

    private Database() {

    }

    void show() {
        System.out.println(driver + " " + Password);

    }

    public static Database getobj() {
        return d;
    }

    class Test {
        public static void main(String[] args) {
            Database t = Database.getobj();
            Database t1 = Database.getobj();
            Database t2 = Database.getobj();
            System.out.println(t);
            System.out.println(t1);
            System.out.println(t2);

        }
    }
}