package day09IfStatements;

public class PoNegZero {
    public static void main(String[] args) {

        int n=20;
        if (n>0){
            System.out.println("Positive");
        }
        if (n<0){
            System.out.println("Negative");
        }
        if (n==0){
            System.out.println("Zero");
        }

        System.out.println("-----------------------");
        if (n>0){
            System.out.println("Positive");
        } else if (n<0) {
            System.out.println("Negative");

        }else {
            System.out.println("Zero");
        }


    }
}
