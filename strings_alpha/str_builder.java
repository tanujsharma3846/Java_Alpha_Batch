public class str_builder {
    public static void main(String[] args) {
        String str="tony";
        int count=0;
        for(char i='a';i<='z';i++){
            str=str+i;
            System.out.println(str);
            count++;
        }
        System.out.println(count);
        
    }
}
