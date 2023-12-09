import java.util.LinkedList;

public class Pr02 {
    public static void main(String[] args) {
        LinkedList<Object> ll = new LinkedList<>();
      //  LinkedList al = new LinkedList();
        ll.add(10);
        ll.add("Hello");
        ll.add(30.6);
        ll.add('A');
        ll.add('c');
        ll.add("World");
        for (Object object : ll) {
            System.out.println(object);
        }

    }
}
