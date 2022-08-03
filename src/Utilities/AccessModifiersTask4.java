package Utilities;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifiersTask4 extends ProtectedAccessModifier {
    public static void main(String[] args) {

     //  System.out.println(ProtectedAccessModifier.name1); default is not visible outside the package
       System.out.println(ProtectedAccessModifier.name2);//is only visible if the class is sub class

       // AccessModifiersTask4.method1();
        AccessModifiersTask4.method2();


    }
}
