import java.util.*;

public class set2 {
    public static void main(String[] args) {
        HashSet<String>hs=new HashSet<>();
        hs.add("delhi");
        hs.add("pune");
        hs.add("agra");
        hs.add("chandigarh");
        // using iterator
        Iterator it=hs.iterator();
        while(it.hasNext()) {
            System.out.print(it.next()+" ");
        }
        // using for each loop
        for(String city:hs){
            System.out.println(city);
        }
    }
}
