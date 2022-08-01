package Utilities;


import day34_GarbageCollection_AccessModifiers.AccessModifiers;

import static day34_GarbageCollection_AccessModifiers.AccessModifiers.*;

public class AccessModifiersTest2 {
    public static void main(String[] args) {
        System.out.println(publicData);
//        System.out.println(defaultData); default is not visible outside of the package
//        System.out.println(privateData);private is not visible outside of the package

        AccessModifiers.method1();
//        AccessModifiers.method2();
//        AccessModifiers.method3();




    }

}
