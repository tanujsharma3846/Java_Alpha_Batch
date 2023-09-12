public class fact {
    public static int findFact(int n){
        if(n==0){
            return 1;
        }
        int fact_N_Minus_1=findFact(n-1);
        int fact = n*findFact(n-1);
        return fact;

    }
    public static void main(String[] args) {
        int n=5;     
        System.out.println(findFact(n));
    }
}
