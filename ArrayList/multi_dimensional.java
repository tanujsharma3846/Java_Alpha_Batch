import java.util.*;

public class multi_dimensional {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>mainlist=new ArrayList<>();

        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(12);
        list.add(3);
        mainlist.add(list);

        ArrayList<Integer>list2=new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        mainlist.add(list2);

        for(int i=0;i<mainlist.size();i++) {
            ArrayList<Integer>currList=mainlist.get(i);
            for(int j=0;j<currList.size();j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
        System.out.println(mainlist);
    }
}
