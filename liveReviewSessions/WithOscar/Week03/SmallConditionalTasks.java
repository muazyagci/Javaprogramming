package WithOscar.Week03;

public class SmallConditionalTasks {
    public static void main(String[] args) {


        int x ;
        int y=20;
        if (y==20){
            x=5;
        }else {
            x=0;
        }

       System.out.println("x = " + x);


        boolean b=y==20;//true
        if (b){
            x=5;

        }
        System.out.println("x = " + x);

int age=12;//declare
String eligibleOrNot="";
        if (age>=18){
    System.out.println("The person is eligible to vote");
}else {
    System.out.println("The person is not eligible to vote");
}



          /*
        Write a Java program:
1) Declare a variable and initialize user age.
2) Then the program will show if the user is eligible to vote. A Person who is eligible to
vote must be older than or equal to 18 years old.
Input: Enter your age :18
Output: You are eligible to vote


        int age ;  // declare
        age = 10;
        String eligibleOrNot ;
        if(age >= 18 ){
            eligibleOrNot = "Eligible";
        }else{
            eligibleOrNot = "Not Eligible";
        }
        System.out.println("eligibleOrNot for Voting = " + eligibleOrNot);

         */


    }
}
