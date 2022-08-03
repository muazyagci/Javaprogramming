package day40_FinalKeyword;

import day06_PrimitiveTypeCastings.birthday;

public class FinalVariable {

    final String birthday;
    final static String name;
    public FinalVariable(String birthday) {
        this.birthday = birthday;

    }
    static {
        name="Batch 25";
    }

    public static void main(String[] args) {
       final double pi=3.14;

//        pi=1.14; final variables can not be changed
//        pi =5.14;
        System.out.println(pi);

      //  final String name;
      //  name="Java";

       // name="Wooden Spoon";

        System.out.println(name);

        System.out.println("---------------------------");

        FinalVariable birthday=new FinalVariable("Aug/17");
        System.out.println(birthday.birthday);
        System.out.println("-*--------------------------");
        //FinalVariable.name="Python";
        System.out.println(name);

    }

}
