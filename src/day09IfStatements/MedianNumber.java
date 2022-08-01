package day09IfStatements;

public class MedianNumber {
    public static void main(String[] args) {
        int num1=4;
        int num2=3;
        int num3=9;

        boolean num1median=(num2>num1&&num3<num1)||(num3>num1&&num2<num1);
        boolean num2median=(num1>num2&&num3<num2)||(num3>num2&&num1<num2);
       boolean num3median=!num1median&&!num2median;
        // boolean num3median=(num1>num3&&num2<num3)||(num2>num3&&num1<num3);

        if (num1median){// if num1 is the median
            System.out.println(num1+" is the median");
        }
   if (num2median){// if num 2 is the median
       System.out.println(num2+" is the median");
   }
   if (num3median){// if num3 is the median
       System.out.println(num3+" is the median");
   }
/*
It should be like putting the situations of the variables like sandwich breads on should be up and one should be down and one in the middle

 */

    }

}
