import java.util.LinkedList;
import java.util.ListIterator;

public class Pr04 {
    public static void main(String[] args) {
        LinkedList<String> s = new LinkedList<>();
        s.add("Hello");
        s.add("World");
        s.add("Java ");
        s.add("Simple ");
        ListIterator<String> ls = s.listIterator(0);
        while (ls.hasNext()) {
            String element = ls.next();
            System.out.println(element);
        }
        // ListIterator<String> ls = s.listIterator(s.size());
        // while (ls.hasPrevious()) {
        // String element = ls.hasPrevious();
        // System.out.println(element);
        // }
    }
}
