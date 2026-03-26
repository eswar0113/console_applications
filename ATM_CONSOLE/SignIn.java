import java.util.*;
public class SignIn {
    private static Scanner sc=new Scanner(System.in);
    
    public void signin(){

        System.out.println("Enter the Username:");
        String checkUser=sc.nextLine();
        System.out.println("Enter the PassWord:");
        String checkPass=sc.nextLine();

        if(checkUser.equals("admin") && checkPass.equals("1234")){
            System.out.println("Logged in Successfully");
            
        }else{
            System.err.println("Invalid Credentials");
        }

    }
}
