import java.util.*;

public class Nto1{
    public static void recursion(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        recursion(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        recursion(n);

    }
}
