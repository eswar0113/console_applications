import java.util.*;
public class module_A {
    Scanner sc=new Scanner(System.in);
    String username="";
    String password="";
    public void SignUp(){
        System.out.println("Enter your name:");
        this.username=sc.nextLine().trim();
        System.err.println("Create your password");
        this.password=sc.nextLine().trim();
        System.out.println("Successfully Account Created");
        System.out.println("Your Username:"+this.username);
        System.out.println("Your password:"+this.password);
        }
    public void SignIn(){
        System.out.println("Enter the username:");
        String userTemp=sc.nextLine().trim();
        System.out.println("Enter the Password:");
        String PassTemp=sc.nextLine().trim();

        if(this.username.equals(userTemp) && this.password.equals(PassTemp)){
            System.out.println("Successfully Logged in");
        }else{
            System.out.println("Invalid Credentials.. :(");
        }


    }
}
