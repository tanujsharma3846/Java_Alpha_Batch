import java.util.*;

public class Classroom{
    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<String>list2=new ArrayList<>();
        ArrayList<Boolean>list3=new ArrayList<>();
        // O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(69);
        // O(n)
        list.add(1,9);
        System.out.println(list);
       

        // get operation-->print element at some index
        int element=list.get(2);
        System.out.println(element);

        // remove -->delete element at some index
        list.remove(2);
        System.out.println(list);

        // set operation-->set element at some index
        list.set(2,6969);
        System.out.println(list);

        // contains elements -->check if array list is present in arraylist
        // returns true/false
        System.out.println(list.contains(69));
        System.out.println(list.contains(6969));
        System.out.println(list.contains(696969));

        // check size of array list
        System.out.println(list.size());

        // print arraylists
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        
    }
}