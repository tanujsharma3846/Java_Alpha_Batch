import java.util.*;
public class set {
    public static void main(String[] args) {
        HashSet<Integer>set=new HashSet<>();
        set.add(1);
        set.add(12);
        set.add(13);
        set.add(1); // duplicate element will not be added
        System.out.println(set);

        if(set.contains(2)){
            System.out.println("set contains");
        }

        if(set.contains(12)){
            System.out.println("set contains 12");
    }
        set.remove(1);
        System.out.println(set);
        System.out.println(set.size());
        set.clear();
        System.out.println(set.isEmpty());
}
}
