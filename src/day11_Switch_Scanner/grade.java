package day11_Switch_Scanner;

public class grade {
    public static void main(String[] args) {
        char grades='A';
       String result="";
        switch (grades){
            case 'A':
               result="Excellent";
        break;
            case'B':
                result="Great job";
        break;
            case 'C':
                result="Good";
        break;
            case 'D':
               result="Passed";
        break;
            case 'F':
               result="Failed";
        break;
            default:
                result="Invalid grade";

        }
        System.out.println(result);

    }
}
