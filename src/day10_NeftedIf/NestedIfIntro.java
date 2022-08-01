package day10_NeftedIf;

public class NestedIfIntro {
    public static void main(String[] args) {
        int score=60;
        if (score>=60){
            System.out.println("passed");
        }else {
            System.out.println("Failed");
        }


        System.out.println("---------------------------------------");






        int age=19;
        boolean hasID=true;
        if (hasID){//if the person has id
            if (age>=21){//if teh person is 21 years old or bigger
                System.out.println("Eligible to buy alcohol");
            }else {//if the person is less than 21 years old
                System.out.println("Not eligible to buy alcohol");


                System.out.println("------------------------------");
int number= 5;
// 1<= number <=7
if (number>=1&&number<=7){
    if (number==1){
        System.out.println("Monday");
    } else if (number==2) {
        System.out.println("Tuesday");
    } else if (number==3) {
        System.out.println("Wednesday");
    } else if (number==4) {
        System.out.println("Thursday");
    } else if (number==5) {
        System.out.println("Friday");
    } else if (number==6) {
        System.out.println("Saturday");
    }else {
        System.out.println("Sunday");
    }
}else {// if the number is not valid
    System.out.println("Invalid number");
}


            }
        }

















    }
}
