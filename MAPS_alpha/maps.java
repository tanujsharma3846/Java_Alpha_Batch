import java.util.*;

public class maps{
    public static void main(String[] args) {
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("india",1);
        hm.put("pakistan",-1);
        hm.put("america",50);
        hm.put("brazil",45);
        System.out.println(hm);

        // get -- o(1)
        int population=hm.get("india");
        System.out.println(population); // value 1

        System.out.println(hm.get("africa")); //value null

        // containsKey -- O(1) 
        System.out.println(hm.containsKey("india")); // true
        System.out.println(hm.containsKey("africa")); // false
    
        // remove -- o(1)
        System.out.println(hm.remove("pakistan"));
        System.out.println(hm); 

        System.out.println(hm.remove("nigeria"));
        System.out.println(hm); 

        // size 
        System.out.println("size of hashmap: "+hm.size());
    
        // is empty
        System.out.println("hm is empty: "+hm.isEmpty());
    
        // clear 
        hm.clear();
        System.out.println("hm is empty after using clear: "+hm.isEmpty());
    }
}