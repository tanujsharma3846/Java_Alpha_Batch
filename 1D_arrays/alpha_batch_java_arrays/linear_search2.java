import java.util.*;

public class linear_search2 {

    public static String check(String menu[],String key){
        for(int i=0;i<menu.length;i++){
            if(menu[i]==key){
                return "found";
            }
        }
        return "not found";
    }
    public static void main(String[] args) {
        String menu[]={"dosa","burger","pizza","utpam","idli-sambar"};
        String key="utpam";
        System.out.println(check(menu,key));

    }
}
