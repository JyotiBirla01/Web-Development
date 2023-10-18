public class Exa11 {
    public static void main(String[] args) {
        try {
            int arr[] = new int[Integer.MAX_VALUE];

        } catch (OutOfMemoryError e) {
          //  System.out.println(" too much memeory ");
          System.out.println(e);
        }
    }

}
