public class substring {
    public static String substring_self(String str,int si,int ei){
        String substr="";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str="hello world";
        System.out.println(substring_self(str,0,5));

        // use substring function already present
        System.out.println(str.substring(0,5));

    }
}
