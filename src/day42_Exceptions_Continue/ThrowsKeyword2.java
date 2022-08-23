package day42_Exceptions_Continue;

public class ThrowsKeyword2 {
    public static void main(String[] args) throws ArithmeticException{
        System.out.println("Test started");


try{
    System.out.println(8/0);
}catch (ArithmeticException e){
    e.printStackTrace();

}
        System.out.println("Test Complete");

    }
}
