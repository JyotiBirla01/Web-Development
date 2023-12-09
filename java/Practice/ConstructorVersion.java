public class ConstructorVersion {
    public ConstructorVersion() {
        System.out.println("Defalut constructor");
    }

    public ConstructorVersion(int x) {
        System.out.println("Init version");
    }

    public ConstructorVersion(float x) {
        System.out.println("float version");

    }

    public ConstructorVersion(int x, int y) {
        System.out.println("Int Int version");
    }

    public static void main(String[] args) {
        new ConstructorVersion();
        new ConstructorVersion(10);
        new ConstructorVersion(20.4f);
        new ConstructorVersion(100, 200);
    }
}