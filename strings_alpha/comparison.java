public class comparison {
    public static void main(String[] args) {
        String s1="java";
        String s2="java";
        String s3=new String("java");

        if(s1==s2){
            System.out.println("Strings are equal");
        }else{
            System.out.println("strings are not equal");
        }

        if(s1==s3){
            System.out.println("strings are equal");
        }else{
            System.out.println("strings are not equal");
        }

        if(s1.equals(s3)){
            System.out.println("value in Strings are equal");
        }else{
            System.out.println("value in strings are not equals");
        }

    }
}
