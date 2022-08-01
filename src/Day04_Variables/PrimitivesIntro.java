package Day04_Variables;

public class PrimitivesIntro {
    public static void main(String[] args) {
        // age: 38 years old
        byte age=38;
        System.out.println(age+" years old");
        //weight: 160 KG
        short weight= 160;
        System.out.println(weight+"=weight");
        //salary: 100000$

        int salary=100000;
//int is the most popular one
        long billion=3000000000l;
        System.out.println(billion);
        //To declare long you should put L or l at the end of the value
        //anytime entering a decimal number it should be double
        double tax=0.31;
        System.out.println("The tax value is: "+tax);
        /*at the end of the float we also need to put F or f
          double is the preferred decimal type primitive variable
          double> float> long> int> short> byte
          double and float are flat point value
char:for single characters,''
boolean:true/false
String:sequence of characters (String of text),""




         */
char ch1='#';
char ch2=35;
        System.out.println("ch1 = " + ch1);
        System.out.println("ch2 = " + ch2);
        char ch3=56000;
        System.out.println("ch3 = " + ch3);
        boolean isEmployed= true;
        boolean ısMarried=false;
        boolean result= 100 > 300;

        String City="Ankara";




    }
}
