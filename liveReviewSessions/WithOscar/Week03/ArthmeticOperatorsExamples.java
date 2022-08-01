package WithOscar.Week03;

public class ArthmeticOperatorsExamples {
    public static void main(String[] args) {
        // you should pay attention to data types
        System.out.println(10/3);// in math you get 3.333 in java we get only three
/*
Java considers 10 as int
3 as int
in/int=gives you integer
 */
        System.out.println(10/3.0);//if one of them are double/int =reveal double result
        //if one of them are double it is enough to give double result
        //other variable which is cast to double implicitly
        System.out.println("-------------------------");
//% modulus sign: gives remainder
        int leftover=17%3;
        System.out.println("leftover = " + leftover);

        int outcome=12+6/3;
        System.out.println("outcome = " + outcome);

int num1=90;
int num2=70;
int result=num1+num2;
        System.out.println("result = " + result);


        double celcius=70.2;
                double fahrenheit=celcius*1.8+32;
        System.out.println("fahrenheit = " + fahrenheit);










    }
}
