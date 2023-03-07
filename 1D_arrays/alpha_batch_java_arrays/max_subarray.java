//import java.util.*;

//import javax.sound.sampled.SourceDataLine;

public class max_subarray {
    public static void maxSubarray(int numbers[]){

        int currSum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                currSum=0;
            for(int k=start;k<=end;k++){
                currSum+=numbers[k];
            }
            if(maxSum<currSum){
                maxSum=currSum;
            }  
        }  
    } 
    System.out.println("max sum ="+maxSum);
}

        public static void main(String[] args) {
            int numbers[] = {2,4,6,8,10};
            maxSubarray(numbers);
        }
    }
  