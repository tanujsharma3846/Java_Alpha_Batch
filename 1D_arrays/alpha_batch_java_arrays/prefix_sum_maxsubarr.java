public class prefix_sum_maxsubarr {
    public static void prefixsum(int arr[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;

        int prefix[]=new int[arr.length];
        // calculate prefix array
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        for(int i=0; i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                currSum=start==0 ?prefix[end] : prefix[end]-prefix[start-1];
                if(currSum>maxSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("max sum ="+maxSum);
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        prefixsum(arr);
    }
}
