import java.util.*;
class Main{
    public static void main(String[] args) {
        while(true){

        Scanner sc=new Scanner(System.in);
        SignIn in = new SignIn();

        System.err.println("--------------Welcome to ATM-----------------");
        System.out.println("PLease create the account first");
        Signup up = new Signup();
        up.signup();
        
        
        }
    }
}