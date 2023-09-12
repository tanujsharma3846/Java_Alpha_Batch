public class friends_pairing_prob {

    public static int Pair(int n){
        if(n==1 || n==2){
            return n;
        }
        int fnm1=Pair(n-1);
        int fnm2=Pair(n-2);
        int pairways=(n-1) * fnm2;
        int total=fnm1+pairways;
        return total;
    }
    public static void main(String[] args) {
        System.out.println(Pair(3));
    }
}
