import java.util.*;

public class linkedhashamp {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer>lhm=new LinkedHashMap<>();
        lhm.put("india",100);
        lhm.put("china",150);
        lhm.put("pakistan",-1);
        System.out.println(lhm);

        HashMap<String, Integer>hm=new HashMap<>();
        hm.put("india",100);
        hm.put("china",150);
        hm.put("pakistan",-1);
        System.out.println(hm);


    }
}
