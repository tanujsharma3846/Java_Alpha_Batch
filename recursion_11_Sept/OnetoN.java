public class OnetoN {
    public static void recursion(int start){
        if(start==10){
            System.out.println(start);
            return;
        }
        System.out.print(start+" ");
        recursion(start+1);
    }
    public static void main(String[] args) {
        int start=1;
        recursion(start);
    }
}
