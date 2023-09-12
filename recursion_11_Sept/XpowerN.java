public class XpowerN {
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int ans=x*power(x,n-1);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(power(2,10));
        System.out.println(power(2,0));
    }
}
