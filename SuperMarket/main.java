import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("------------------------------------------");
        System.out.println("Welcome to the SuperMarket");
        System.out.println("------------------------------------------");
        System.out.println("Please SignIn/SignUp");
        module_A cls1=new module_A();
        System.out.println("Enter the choice for signin=1 || signup==2");
        int choice=sc.nextInt();
        if(choice==2){
              cls1.SignUp();
        }
        else if(choice==1){
        cls1.SignIn();
        }else{
            System.out.println("Invalid choice...try again");
        }
    }
}