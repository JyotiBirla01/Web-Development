import java.util.TreeSet;

public class Menu implements Comparable<Menu> {
    private int serialNo;
    private String dishName;
    private double price;

    public Menu(int serialNo, String dishName, double price) {
        this.serialNo = serialNo;
        this.dishName = dishName;
        this.price = price;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public String getDishName() {
        return dishName;
    }

    public double getPrice() {
        return price;
    }

    public int compareTo(Menu m) {
        // return this.serialNo - m.serialNo;
        int x = this.serialNo                                             - m.serialNo;
        if (x == 0)
            return 1;
        return x;
    }

    public String toString() {
        return serialNo + " " + dishName + " " + price;
    }

}

class TestMain {
    public static void main(String args[]) {
        TreeSet<Menu> ts = new TreeSet<>();
        ts.add(new Menu(1, "Maggi", 100));
        ts.add(new Menu(3, "Samosa ", 20));
        ts.add(new Menu(2, "Chai ", 20));
        ts.add(new Menu(1, "Noodles ", 40));
        for (Menu menu : ts) {
            System.out.println(menu);
        }

    }
}
