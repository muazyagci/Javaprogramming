package day11_Switch_Scanner;

public class FINRA {
    public static void main(String[] args) {
        int number = 3;
        String result = "";

        if(number%3==0 && number%5==0){
            result = "Divisible by both";
        } else if(number%5==0){
            result = "Divisible with 5";
        }else if(number%3 ==0){
            result = "Divisible by 3";
        }else{
            result =   ""+number;
        }

        System.out.println("result = " + result);


    }

}

