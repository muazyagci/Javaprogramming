package day41_Exceptions;

public class TryCatchBlocks {
    public static void main(String[] args) {

        System.out.println("Test Started");

        try {

            System.out.println(9 / 0);

            System.out.println("Try Block");

        } catch (ArithmeticException e) {

            System.out.println("Catch block");

            System.out.println("ArithmeticExeptionCaught");
        }


        System.out.println("Test completed");

        System.out.println("-----------------------------------");

        System.out.println("Test 2 Started");

        int[] numbers = {1, 2, 3, 4, 5};

        try {

            System.out.println(numbers[200]);


            System.out.println("Try Block");

        } catch (RuntimeException e) {

            System.out.println("Exception ocurred");

         //   e.printStackTrace();

            //System.out.println(e.getMessage());

        }


        System.out.println("Test 2 completed");
        System.out.println("***---------------------");

        System.out.println("Test3 started");


        try {

            System.out.println("Cydeo".substring(2, 0));
        }catch (RuntimeException r){

            System.out.println("Exception Ocurred");
           // r.printStackTrace();

        }

        System.out.println("-----------------------------");

        System.out.println("Test4 started");



    }
}
