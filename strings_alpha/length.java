public class length {

    public static void printletters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
      String fullname="rajukumar";
      System.out.println(fullname.length());  

      String firstname="scooby";
      String lastname="doo";
      String fullname2=firstname+lastname;
      System.out.println(fullname2);

      System.out.println(fullname.charAt(2));
      System.out.println();

      printletters(fullname);
    }
}
