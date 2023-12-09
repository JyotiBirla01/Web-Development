 class VarargsConstructorExample {
    private String[] names;

    // Varargs constructor
    public VarargsConstructorExample(String... names) {
        this.names = names;
    }

    public void printNames() {
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        // Creating an instance of the class with multiple arguments
        VarargsConstructorExample example1 = new VarargsConstructorExample("Alice", "Bob", "Charlie");
        example1.printNames();

        // Creating an instance with no arguments
        VarargsConstructorExample example2 = new VarargsConstructorExample();
        example2.printNames();
    }
}
