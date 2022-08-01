package day11_Switch_Scanner;

public class DaysInWeek {
    public static void main(String[] args) {
        int number =60;


        switch (number){
            case 1:
                System.out.println("Monday");
                break;// exits the switch after executing the case block
            case 2:
                System.out.println("Tuesday");
            break;// exits the switch after executing the case block
            case 3:
                System.out.println("Wednesday");
            break;// exits the switch after executing the case block
            case 4:
                System.out.println("Thursday");
        break;// exits the switch after executing the case block
            case 5:
                System.out.println("Friday");
        break;// exits the switch after executing the case block
            case 6:
                System.out.println("Saturday");
                break;// exits the switch after executing the case block
            case 7:
                System.out.println("Sunday");
break;// exits the switch after executing the case block
            default:// only gets executed when none of the case blocks are matching
                System.out.println("Wrong number");
// as many as case blocks we want but only one default
        }
// we don't need to give default case block at the end al ways it can be anywhere but the rule of break is still on
// every case values should be unique
    }//float double boolean long are prohibited to be used in switch statements

}
