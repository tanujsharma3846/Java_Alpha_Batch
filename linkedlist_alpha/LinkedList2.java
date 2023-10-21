import java.util.*;

public class LinkedList2 {
    public static void main(String[] args) {
        // create  a new LinkedList
        LinkedList<Integer> ll= new LinkedList<>();

        // add                               
        ll.addLast(1);
        ll.addLast(4);
        ll.addFirst(69);
        // 69->1->4
        System.out.println(ll);
        // remove 
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
