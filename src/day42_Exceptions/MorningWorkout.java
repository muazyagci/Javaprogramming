package day42_Exceptions;

public class MorningWorkout {
    public static void main(String[] args) {
        System.out.println("----------Push up started----------");


        for (int i = 1; i <=30 ; i++) {
            System.out.print("\r"+i+" push up");

               sleep(1.5);


        }
        System.out.println("\n----------Push up complete----------");



        System.out.println("----------pull up started----------");


        for (int i = 1; i <=20 ; i++) {
            System.out.print("\r"+i+" pull up");

               sleep(2.5);


        }
        System.out.println("\n----------pull up complete----------");
    }

    public static void sleep(double seconds){
        try {
            Thread.sleep((long) (seconds*1000) );
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

}
