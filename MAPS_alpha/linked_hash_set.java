import java.util.*;

public class linked_hash_set {
   public static void main(String[] args) {
    HashSet<String>hs=new HashSet<>();
    // unorderd
    hs.add("delhi");
    hs.add("chandigarh");
    hs.add("lahore");
    hs.add("karachi");
   System.out.println(hs);

   LinkedHashSet<String>lhs=new LinkedHashSet<>();
   // ordered
   lhs.add("delhi");
   lhs.add("chandigarh");
   lhs.add("lahore");
   lhs.add("karachi");
   System.out.println(lhs);
   } 
}
