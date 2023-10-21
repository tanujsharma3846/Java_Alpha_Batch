import java.util.*;
public class maps2 {
    public static void main(String[] args) {
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("india",1);
        hm.put("pakistan",-1);
        hm.put("america",50);
        hm.put("brazil",45);

        // iterate hashmap
        Set<String> keys=hm.keySet();
        System.out.println(keys);

        for(String k : keys){
            System.out.println("key="+k+","+"value="+hm.get(k));
        }
    }
}
