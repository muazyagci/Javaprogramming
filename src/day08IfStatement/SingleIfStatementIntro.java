package day08IfStatement;

public class SingleIfStatementIntro {
    public static void main(String[] args) {

        int number=300;

boolean evennumber=number%2==0;

    if (evennumber){
        System.out.println(number+" is Even number");
    }
if (!evennumber){
    System.out.println(number+" is Odd number");
}
        System.out.println("-----------------------------");

int n=200;

//positive
      if(n>0){
          System.out.println(n+" is positive");
      }
//negative
        if (n<0){
            System.out.println(n+" is negative");
        }

//zero

if (n==0){
    System.out.println(n+" is zero");
}



















    }

}
