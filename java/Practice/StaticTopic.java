public class StaticTopic {
    private int a = 10;
    private static int b = 20;

    public void increment() {
        ++a;
        ++b;

    }

    static public void display() {
        System.out.println("a :" + a);
        System.out.println("b :" + b);
    }

    public static void main(String[] args) {
        StaticTopic obj = new StaticTopic();
        obj.increment();

        // obj.display();
        StaticTopic.display();
    }

}
