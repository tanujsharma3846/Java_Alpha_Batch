import java.util.*;

public class count_distinct_elements {
    public static void main(String[] args) {
        int num[]={4,3,2,5,6,7,3,4,2,1};
        HashSet<Integer> distinct = new HashSet<Integer>();
        for(int i=0;i<num.length;i++){
            distinct.add(num[i]);
        }
        System.out.println("size of set : " + distinct.size());
    }
}
