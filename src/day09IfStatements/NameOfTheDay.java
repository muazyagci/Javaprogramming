package day09IfStatements;

public class NameOfTheDay {
    public static void main(String[] args) {
        int n=5;//1---7
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
        System.out.println("Today is "+day);



    }
}
