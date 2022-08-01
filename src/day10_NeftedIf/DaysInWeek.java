package day10_NeftedIf;

public class DaysInWeek {
    public static void main(String[] args) {


        int n=1;//1---7
        String day;
        if (n==1){
            //System.out.println("Today is Sunday");
            day="Sunday";
        } else if (n==2) {
            //System.out.println("Today is Monday");
            day="Monday";
        } else if (n==3) {
            // System.out.println("Today is Tuesday");
            day="Tuesday";
        } else if (n==4) {
            //System.out.println("Today is Wednesday");
            day="Wednesday";
        } else if (n==5) {
            //System.out.println("Today is Tuesday");
            day="Tuesday";
        } else if (n==6) {
            //System.out.println("Today is Friday");
            day="Friday";
        } else  {
            //System.out.println("Today is Saturday");
            day="Saturday";

        }
        System.out.println("*--------------------------*");

        String result= (n==1)? "Sunday":(n==2)? "Monday":(n==3)?"Tuesday":(n==4)?"Wednesday":(n==5)?"Tuesday":(n==6)?"Friday":"Saturday";
        System.out.println(result);
        System.out.println("*---------------------------*");
        System.out.println(day);
    }
}
