public class Subsets_question {
    public static void findSubsets(String str,String ans,int i){
        // base case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }else
            System.out.println(ans);
            return;
        }
        // recusion 
        // yes case
        findSubsets(str, ans+str.charAt(i), i+1);
        // no case
        findSubsets(str,ans,i+1);
    }
    public static void main(String[] args) {
        String str="ans";
        findSubsets(str, "", 0);
    }
}
