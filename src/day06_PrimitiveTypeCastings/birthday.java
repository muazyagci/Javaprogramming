package day06_PrimitiveTypeCastings;

public class birthday {
    public static void main(String[] args) {
        String name="John", birthmonth="April";
                int birthday=25,birthyear=1995;


        System.out.println(name+" was born on "+birthmonth+"/"+birthday+"/"+birthyear);
        System.out.println("------------------------------------------------------------------");
    String bookname="Game Of Thrones";
        System.out.println("My favorite book is "+"\""+bookname+"\"");
/*
\n
\t
\"
\\
\' after java 8 it is not needed ' is enough to use
double>float>long>int>short>byte
Implicit casting:
smaller primitive can be directly assigned to larger
byte a=25;
int b=a;

 */
        System.out.println("5+5="+(1+2));


    }
}
