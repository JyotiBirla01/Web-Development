import java.util.LinkedList;
import java.util.ListIterator;

public class Pr01 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
       // ListIterator<Integer> iterator = ll.listIterator(0);
        // while (iterator.hasNext()) {
        // int element = iterator.next();
        // System.out.println(element);
        // }
        ListIterator<Integer> iterator = ll.listIterator(ll.size());
        while (iterator.hasPrevious()) {
            int element = iterator.previous();
            System.out.println(element);
        }

    }

}
