package day52_Map_FunctionalsInterface;

public class Test {
    public static void main(String[] args) {

MyFirstFunctionalInterface oddOrEvenNumber=(a)->{

    if (a%2==0){
        System.out.println(a+" si even number");
    }else {
        System.out.println(a+" is odd number");
    }
};

oddOrEvenNumber.apply(20);
        System.out.println("*---------------------------------*");

        MyFirstFunctionalInterface eligibleToBuyAlcohol;

        eligibleToBuyAlcohol=(g)->{
            if (g>=10&&g<=90) {
                if (g >= 21) {
                    System.out.println("eligible to buy alcohol");
                } else {
                    System.out.println("Not eligible to buy alcohol");
                }
            }else {
                System.out.println("Invalid number ");
            }
        };

        eligibleToBuyAlcohol.apply(170);
        System.out.println("*---------------------------------*");

        MyFirstFunctionalInterface printCube;
        printCube=n->System.out.println(n*n*n);
        ;

        printCube.apply(3);
        System.out.println("*---------------------------------*");

        MyFirstFunctionalInterface divisibleBy3And5=n ->{
            if (n%15==0){
                System.out.println(n+" is divisible by 3 and 5");
            }else {
                System.out.println(n+" is not divisible by 3 and 5");
            }

        };
divisibleBy3And5.apply(30);




    }
}
