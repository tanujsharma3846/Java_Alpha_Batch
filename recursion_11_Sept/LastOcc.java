public class LastOcc {
    public static int occ(int arr[],int key, int i){
        if(i==arr.length){
            return -1;
        }
        
        int found=occ(arr,key,i+1); 

        if(found == -1 && arr[i]==key){
            return i;
        }

        return found;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,5};
        System.out.println(occ(arr,5,0));
    }
}
