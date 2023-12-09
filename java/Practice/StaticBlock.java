public class StaticBlock {
    static {
        System.out.println("Static block1");

    }

    public static void main(String[] args) {
        System.out.println("Main method");
    }

    static {
        System.out.println("Static block2");

    }

}
