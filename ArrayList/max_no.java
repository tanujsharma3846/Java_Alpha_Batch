import java.util.*;

public class max_no {
   public static void main(String[] args) {
    ArrayList<Integer>list=new ArrayList();
    list.add(1);
    list.add(2);
    list.add(32);
    list.add(4);
    System.out.println(list);
    int max=Integer.MIN_VALUE;
    // method 1 simple
    /* 
    for(int i=0; i<list.size(); i++){
        if(max<list.get(i)){
            max=list.get(i);
        }

    }
    */
    //method 2 pro
    for(int i=0; i<list.size(); i++){
        max=Math.max(max,list.get(i));

    }

    System.out.println("max element in arraylist = "+max);

   } 
}
