public class max_subarr_sum_bruteforece {
    
    public static void maxSubArrSum(int arr[]){
        int currSum=0;
        int maxSum=0;
        for(int i=0; i<arr.length; i++){
            int start=i;
            for(int j=i;j<arr.length; j++){
                int end=j;
                // initialise sub array with zero every time
                currSum=0;
                for(int k=start;k<=end;k++){
                    currSum=arr[k]+currSum;
                }
                System.out.println(currSum);
                if(currSum>maxSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("maximum subarray sum is="+maxSum);
    }
    
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        maxSubArrSum(arr);

    }
}
