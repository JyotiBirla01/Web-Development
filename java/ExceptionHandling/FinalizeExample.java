public class FinalizeExample {

    // A constructor to initialize the object
    public FinalizeExample() {
        System.out.println("Object created.");
    }

    // The finalize method
    @Override
    protected void finalize() throws Throwable {
        try {
            // Perform cleanup operations here
            System.out.println("Finalize method called. Cleaning up resources.");
        } finally {
            // Call the superclass finalize method
            super.finalize();
        }
    }

    public static void main(String[] args) {
        // Create an object
        FinalizeExample obj = new FinalizeExample();

        // Set the reference to null, making the object eligible for garbage collection
        obj = null;

        // Suggest to the JVM to run the garbage collector
        System.gc();

        // Wait for a moment to allow the garbage collector to work (in a real application, you don't usually need to do this)
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
