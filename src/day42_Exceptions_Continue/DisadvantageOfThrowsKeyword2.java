package day42_Exceptions_Continue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DisadvantageOfThrowsKeyword2 {
    public static void method1()throws FileNotFoundException {
        new FileInputStream("");

    }
    public static void method2()throws FileNotFoundException{
        method1();
    }
public static void method3() throws FileNotFoundException, InterruptedException {
        method1();
        method2();
        Thread.sleep(1500);

}
public static void method4() throws FileNotFoundException, InterruptedException {
        method1();
        method2();
        method3();
}

}
