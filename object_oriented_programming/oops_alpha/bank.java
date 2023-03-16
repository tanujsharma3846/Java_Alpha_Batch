public class bank {
   public static void main(String[] args) {
    BankAccount b1=new BankAccount();
    b1.username="scooby";
    b1.setpassword("scoobykapassword");
    
   } 
}
class BankAccount{
    
    public String username;
    private String password; 

    public void setpassword(String pwd){
        password=pwd;

    }
}
