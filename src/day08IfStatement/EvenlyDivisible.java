package day08IfStatement;

public class EvenlyDivisible {
    public static void main(String[] args) {
        int number=65;
boolean divisibleby2=number%2==0;
        boolean divisibleby3=number%3==0;
        boolean divisibleby5=number%5==0;

        System.out.println(number+" is divisible by 2: "+divisibleby2);
        System.out.println(number+" is divisible by 3: "+divisibleby3);
        System.out.println(number+" is divisible by 5: "+divisibleby5);

        System.out.println("----------------------------------------------");

    int year= 2000;

    boolean isLeapyear=year%4==0;

        System.out.println(year+" is leap year: "+isLeapyear);




    }
}
