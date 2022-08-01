package day08IfStatement;

public class NumberOfDays {
    public static void main(String[] args) {
int number=5;
boolean has28days=number==2;//for the months that has 28 days
boolean has30days= number==4||number==6||number==9||number==11;//for the month that has 30 days
boolean has31days=number==1||number==3||number==5||number==7||number==8||number==10||number==12;//for the months that has 31 days
//boolean has31days=!has28days && has30days; if the months does not have 29 days and does not have 30 days

        if (has28days){//if the month has 28 days
            System.out.println("28 days");
        }
        if (has30days){//if the month has 30 days
            System.out.println("30 days");

        }
        if (has31days){//if the month has 31 days
            System.out.println("31 days");
        }



    }
}
