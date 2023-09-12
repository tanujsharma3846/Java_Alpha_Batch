public class Fibo {
    public static int fibonacci(int n){
        if(n==0){
            return n;
        }
        if(n==1){
            return n;
        }
        int num1=fibonacci(n-1);
        int num2=fibonacci(n-2);
        int num=num1+num2;
        return num;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(fibonacci(8));
    }
}
