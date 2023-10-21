import java.util.*;

public class maxoccuring2 {
    public static void main(String[] args) {
        int arr[]={12,3,4,1,1,4,5,6,1,1,1};
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        Set<Integer>keyset=map.keySet();
        for(Integer key : keyset){
            if(map.get(key)>arr.length/3){
                System.out.println(key);
            }
        }

    }
}
