package day12_Scanner;

//import java.util.*;// wild import:imports everything from the package
import java.util.Scanner;// regular import: imports one class
public class ScannerPractive {
    public static void main(String[] args) {

        /*
        Scanner class: used for getting  inputs
        needs to be imported from java.util
        syntax of import statement;
        import package.class;
        import. java.util.Scanner;
        Declare:
        Scanner variableName= new Scanner(System.in);
        Scanner methods:
        next.Int()
        next.Double()
        next.Boolean()

         */

    Scanner scan=new Scanner(System.in);

    int num= scan.nextInt();
    String result="";
    if (num>=1&&num<=7){
        switch (num){
            case 1:
                result="Sunday";
                break;
            case 2:
                result="Monday";
                break;
            case 3:
                result="Tuesday";
                break;
            case 4:
                result="Wednesday";
                break;
            case 5:
                result="Thursday";
                break;
            case 6:
                result="Friday";
                break;
            default:
                result="Saturday";
        }


    }else { result="Invalid";

    }
        System.out.println(result);
scan.close();


    }
}
