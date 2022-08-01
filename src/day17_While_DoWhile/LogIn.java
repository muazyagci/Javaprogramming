package day17_While_DoWhile;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //username : Cydeo
        //password: Cydeo123
        int attempt=3;
        System.out.println("Enter username");
        String username= scan.next();
        System.out.println("Enter password");
    String password= scan.next();
if (username.equals("Cydeo")&&password.equals("Cydeo123")){
    System.out.println("Logged In");
}
    while (!(username.equals("Cydeo")&&password.equals("Cydeo123"))&&attempt>0){
attempt--;
        System.err.println("Username or password is incorrect try again");
username= scan.next();
password= scan.next();

          if (username.equals("Cydeo")&&password.equals("Cydeo123")){
              System.out.println("Logged In");
          }
          if (attempt<=0){
              System.err.println("No attempts left, you should get in contact with support!!");
          }
scan.close();
}
        }





    }

