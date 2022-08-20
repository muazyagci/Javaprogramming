package day41_Exceptions;

public class MorningWorkout {
    public static void main(String[] args) {
        System.out.println("----------Push up started----------");


        for (int i = 1; i <=30 ; i++) {
            System.out.println(i+" push up");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println("----------Push up complete----------");
    }
}
