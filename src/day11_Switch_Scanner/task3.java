package day11_Switch_Scanner;

public class task3 {
    public static void main(String[] args) {

    String browsername="opera", result="";

    switch (browsername){
        case"opera":
           result="Browser name is opera";
   break;
        case "chrome":
           result=("Browser name is chrome");
   break;
        case "firefox":
            result=("Browser name is firefox");
       break;
        case "safari":
            result="Browser name is safari";
            break;
        case "edge":
            result="Browser name is edge";
            break;
        default:
            System.out.println("Invalid browser");

    }

        System.out.println(result);

}}
