package WithOscar.Week04;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        //We will get two numbers of Double from user and we will get a char(+,-,/,%,*)

        double num1, num2, result=9;

        char operator;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter two double type numbers");

        num1 = input.nextDouble();

        num2 = input.nextDouble();

//ctrl+alt+l: auto format the code line up, it makes the codes more tidy

        System.out.println("Enter arithmetic operation you want (+,-,/,%,*) : ");
        operator=input.next().charAt(0);// to get char with scanner we are using
        // String manipulation

       /* switch (operator){
            case '+':
                result=num1+num2;
                break;
            case '-':
                result=num1-num2;
                break;
            case '/':
                result=num1/num2;
                break;
            case '%':
                result=num1%num2;
                break;
            case '*':
                result=num1*num2;
                break;
            default:
                System.out.println("Invalid operator entered");

        */
        System.out.println("Is first number bigger than second number ? ");
        boolean answer = input.nextBoolean(); // true or false

        switch (operator){
            case '+':
                result = num1+num2;
                break;
            case '-':   // This condition has a Nested Condition inside
                if(answer) {
                    result = num1 - num2;
                }else{
                    result = num2 - num1;
                }
                break;
            case '/':
                if(answer && num2!=0){
                    result = num1 / num2;
                }else {
                    if(num1!=0){
                        result = num2 / num1;
                    }else{
                        System.err.println("Unwanted Number");
                    }
                }
                break;
            case '*':
                result = num1*num2;
                break;
            case '%':
                /*
                Syntax for Ternary operator
                variable = condition ? trueValue : falseValue ;
                 */
                result = answer ? num1%num2 : num2%num1;
                break;
            default:
                System.err.println("Unrecognized Operation");
                break;
        }
        System.out.println("result = " + result);

input.close();

    }
}
