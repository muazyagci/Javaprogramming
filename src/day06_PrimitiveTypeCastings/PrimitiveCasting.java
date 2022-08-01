package day06_PrimitiveTypeCastings;

public class PrimitiveCasting {
    public static void main(String[] args) {
        byte a=100;
        short b=(short)a;
        int c=b;
        long d=c;
        /*
        larger primitive types can not be directly be assigned to smaller primitives
         */


       //EXPLICIT CASTING/MANUAL CASTING
        int j=999999;
byte l=(byte)j;
/*  ^^^^^^^^^^
This is how you cast the big primitive to small
but if the small primitive can not handle the big value it will not give error
it will show the value of the small primitive can handle

 */

        System.out.println(j+":"+l);






        /*
       means that it has already done by machine-> sort b=(short)a;
         */

double d1=20.5;
short s1= (short) d1;
/*   ^^^^^^^^^^^^^^
 IDE can cast automatically if you click to alt button and enter you will see options and click to cast

 */
double d2=90;
short s2= (short) d2;
/*
the red light bulb is doing the same
 */
        System.out.println(d1+":"+s1);






    }
}
