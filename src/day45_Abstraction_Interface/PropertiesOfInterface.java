package day45_Abstraction_Interface;



public interface PropertiesOfInterface  {
   int a=100;//static and final by default
    static  int b=200;//final by default
//    public PropertiesOfInterface(int a){
//        this.a=a;
//    }

//    static {
//        b=100;
//    }

//    public void method1(){
//        System.out.println("Instance method");
//    }
    public static void method2(){
        System.out.println("Static method");
    }
    public abstract void method3();


    public default void method(){
        System.out.println("Default method");
    }

    public static void main(String[] args) {
        System.out.println("Hello");
    }



}
