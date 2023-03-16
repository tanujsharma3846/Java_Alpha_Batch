public class calci {
    public static void main(String[] args) {
        Calculator c1=new Calculator();
        System.out.println(c1.sum(1,2));
        System.out.println(c1.sum(1,2,4));
        System.out.println(c1.sum(1.4f,2.6f));
    }
}
class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}
