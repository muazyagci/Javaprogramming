package day10_NeftedIf;

public class TernariesIntro {
    public static void main(String[] args) {
        int n= 100;
        if (n%2==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
        System.out.println("-----------------");

       String result= (n%2==0)?"Even":"Odd";

        System.out.println(result);

        System.out.println("----------------------");
int age=12;
/*if (age>=21){
    System.out.println("Eligible to buy alcohol");
}else {
    System.out.println("Not eligible to buy alcohol");
}

 */
        System.out.println("-------------------------");

String result2= (age>=21)?"Eligible to buy alcohol":"Not eligible to buy alcohol";
        System.out.println(result2);

        System.out.println("-----------------------------");

int number=99;
/*if (number>0){
    System.out.println("Positive");
} else if (number<0) {
    System.out.println("Negative");
}else {
    System.out.println("Zero");
}


 */
 //: => else block ( => if block  :( => else if block
        String result3= (number>0)?"Positive" :(number<0) ?"Negative" : "Zero";
        //                       if           else if                 else
        System.out.println(result3);

// ternary is limited if statement is not







    }

}
