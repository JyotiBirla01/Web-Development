import java.util.Comparator;
import java.util.TreeSet;

public class Menu1 {
    private int serialNo;
    private String dishName;
    private int price;

    public Menu1(int serialNo, String dishName, int price) {
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

    public int getPrice() {
        return price;
    }

    public int compareTo(Menu1 m) {
        return this.serialNo;

    }

    public String toString() {
        return serialNo + " " + dishName + " " + price;
    }

}

class SortByPrice implements Comparator<Menu1> {
    public int compare(Menu1 m1, Menu1 m2) {
        return m1.getPrice() - m2.getPrice();
    }
}

class TestMain {
    public static void main(String args[]) {
        TreeSet<Menu1> ts = new TreeSet<>(new SortByPrice());
        ts.add(new Menu1(1, "Maggi", 100));
        ts.add(new Menu1(3, "Samosa ", 20));
        ts.add(new Menu1(2, "Chai ", 20));
        ts.add(new Menu1(1, "Noodles ", 40));
        for (Menu1 menu : ts) {
            System.out.println(menu);
        }

    }
}
