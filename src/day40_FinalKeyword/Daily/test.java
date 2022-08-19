package day40_FinalKeyword.Daily;

import java.util.Scanner ;

public class test extends account {

    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
        System.out.println("Please enter userName and passWord");;
account account=new account();
        System.out.println("Enter username: ");
        account.userName= scan.next();
        System.out.println("Enter password: ");
        account.passWord= scan.next();
boolean a=true;
while (a){
    if (account.userName.equals(correctUserName)&&account.equals(CorrectPassword)){
        System.out.println("Logged in");
        break;
    }else {
        System.err.println("Invalid");
        System.err.println("Please enter again");

        account.userName= scan.next();
        account.passWord= scan.next();
    }

}

account.login();

    }
}
