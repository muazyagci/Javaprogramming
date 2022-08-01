package WithOscar.week02;

public class PrimitiveExamples {
    public static void main(String[] args) {
/*
Variables :  Primitive Types: Numbers || Characters || Boolean
Numbers:Integers------>byte->short->int->long
decimal(floating points)---> float and double
Characters: char data types
            not primitive however String: collection of chars
Boolean: true or false   (1000100111)
DataType
DataType VariableName= Value;1.Declare and 2.Initialize at the same line

DataType variableName; 1.Declare
VariableName=Value; 2.Initialize
DataType variableName1, variableName2;


 */
        byte num1; //declaring

        num1=56;//initialize.assigning a value

        num1=15; //re-assigning a different value

        short num2=1239;//declaring and initializing

        int distance=1_000_000_000;
        System.out.println("distance = " + distance);

        long distanceMore=3_000_000_000_000l;//passing the limit so I have to put l
        long distanceShorter=1_000_000_000;//inside the limit

        float rate=1000.5f;
        double dNumber=123.4;

        System.out.println("---------------AfterCastings--------------");

        // I will assign num1 which is byte to num2 short ----> from smaller data type to bigger data type
        num2=num1;// there is implicit casting : done by compiler itself
        System.out.println("num2 = " + num2);
//I will assign distance variable value to num2 variable -----> going from bigger data type to a smaller data type
        num2=(short)distance;// explicit casting ----> done by developer/tester
        System.out.println("num2 = " + num2);

        char ch='a';
        System.out.println("ch = " + ch);
int x=5+ch;
        System.out.println("x = " + x);
String str=""+'J'+'a'+'v'+'a';// empty""; makes all the chars coming after to turn into Strings
        System.out.println("str = " + str);//Java
int y='J'+'a'+'v'+'a';
        System.out.println("y = " + y);//386
        /*
        Note:Important rule of Java-->Java runs from left to right: String+char=String
        "C" ---->String
        'C'--->char

         */
boolean b1=true;    // you can assign conditions to these variables
boolean b2= false;
        System.out.println("b2 = " + b2);
/*
x=5;
y=2;
x>y---->true
 */




/*
Naming Convention Examples for valid (V) and Invalid (I) Examples:
_avarage:V---> we can use _ and $ underScore at the beginning of the variableName
 EU9: V----> we can use numbers if they are not first characters
 ABC: V
 println: V /not a reserved word!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!Interview question
 for: I /reserved word for Java
"hello"= I /starts with "
sum_of_data: V
first-name: I /we can not use dash
variable-name: starts with small letter, and if you have word, then we use camel case
sumOfData (naming convention)
 */
    double _avarage=5.5;
    String EU9="EU9 is great";
String print="sadasd";


    }



}
