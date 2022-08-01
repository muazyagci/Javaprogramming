package WithOscar.Week03;

public class if_Conddition_Example {
    public static void main(String[] args) {

        int num1=9;
        int num2=80;
        int num3=7;
        boolean b1=num1>num2&&num1>num3;
        boolean b2=num2>num1&&num2>num3;

        if (b1){
            System.out.println("num1 is the greatest");
        } else if (b2) {
            System.out.println("num2 is the biggest");
        }else {
            System.out.println("num3 is the biggest");
        }

/*
        Write Java program that will accept three numbers and return the greatest number.
        Assume that your numbers are not equal....
• Input:
Enter first number: 4
Enter second number: 8
Enter third number: 1
• Output:
The greatest number is: 8


        int num1,num2,num3;

        int maxNum;

        num1 = 4; num2 = 8; num3 = 1;

        if(num1>num2 && num1>num3){
            maxNum = num1;
        }else if (num2>num1 && num2 > num3){
            maxNum = num2;
        }else {
            maxNum = num3;  // if non of the conditions above is true then there is only one solution left
        }

        System.out.println("maxNum = " + maxNum);

 */








    }
}
