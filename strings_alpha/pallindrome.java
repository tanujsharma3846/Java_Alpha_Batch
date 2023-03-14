public class pallindrome {
    public static boolean isPallindrome(String str){
        for(int i=0; i<str.length(); i++){
            int n=str.length();
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str1="racecar";
        System.out.println(isPallindrome(str1));
    }
}
