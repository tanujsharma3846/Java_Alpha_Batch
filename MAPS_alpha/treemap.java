import java.util.*;

public class treemap {
    public static void main(String[] args) {
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("india",100);
        hm.put("china",123);
        hm.put("usa",124);
        System.out.println(hm);

        // keys are sorted in tree map O(logn) 
        TreeMap<String,Integer>tm=new TreeMap<>();
        tm.put("india",100);
        tm.put("china",123);
        tm.put("usa",124);
        System.out.println(tm);
    }
}
