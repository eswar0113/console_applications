import java.util.*;
public class Signup {
    
    private static Scanner sc=new Scanner(System.in);
    
    public void signup(){
        System.err.println("Enter the Username:");
        String username=sc.nextLine();
        System.err.println("Enter the Password:");
        String password=sc.nextLine();
        System.err.println("Account created successfully");
        System.err.println("Kindly go to login/signin page");
        System.err.println("Redirecting.........");
        SignIn in=new SignIn();
        in.signin();

    }
}
