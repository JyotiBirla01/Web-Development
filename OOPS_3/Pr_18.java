import java.util.Scanner;

class Restaurant {
    private String item;
    private int price;
    private int rating;

    public Restaurant(String item, int price, int rating) {
        this.item = item;
        this.price = price;
        this.rating = rating;
    }
    public  void add( ){

    }

}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of menu");
        int n = sc.nextInt();
        Restaurant obj[] = new Restaurant[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the " + (i + 1) + " item name ");
            String item = sc.next();
            System.out.println("Enter the price of  " + (i + 1) + " item");
            int price = sc.nextInt();
            System.out.println("Enter the rating  of  " + (i + 1) + " item");
            int rating = sc.nextInt();
            obj[i] = new Restaurant(item, price, rating);

        }
    }
} 