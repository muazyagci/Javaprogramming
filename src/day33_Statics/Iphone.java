package day33_Statics;

public class Iphone {
    public static String brand = "Apple";

    public String model;

    public double price;

    public static String OS="iOS";

    public String colour,size;

    public static String madeIn="China";

    public static boolean hasBattery=true;

    public static boolean isTouch=true;

    public static boolean hasFaceTime=true;

    public Iphone(String s, String s1, int i, String black) {
    }

    //    public static void printModelAndPrice(){
//        System.out.println(model+" : "+price);//static methods in java does not accepts instances
//    }
    public static void printOperatingSystem(){
        System.out.println(OS);
    }


}
