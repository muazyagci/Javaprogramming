package day42_Exceptions_Continue;

public class DisadvantageOfThrowsKeyword {
    public static void main(String[] args)  throws InterruptedException {

        System.out.println("Hello");
        sleep(10);
        System.out.println("World");
        System.out.println("--------------------");

        System.out.println("Hello");

        MorningWorkout.sleep(10);

        System.out.println("Cydeo");

    }
    public static void sleep(double seconds) throws InterruptedException {

            Thread.sleep((long) (seconds*1000) );


    }
}
