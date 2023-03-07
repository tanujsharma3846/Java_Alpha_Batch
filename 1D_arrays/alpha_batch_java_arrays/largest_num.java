//import java.util.*;

public class largest_num {
    public static int max(int arr[]){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={1,2,9,67,7};
        System.out.println(max(arr));
    }
}
