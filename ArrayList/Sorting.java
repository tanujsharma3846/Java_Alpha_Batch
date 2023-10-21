import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList();
        list.add(69);
        list.add(4);
        list.add(67);
        list.add(2);
        list.add(33);
        System.out.println(list);
        // sort list in ascending order
        Collections.sort(list);
        System.out.println(list);
        
        // sort list in descending order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
        
    }
}
