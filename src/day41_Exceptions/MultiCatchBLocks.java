package day41_Exceptions;

import day39_Recaps.CydeoTask.Employee;

public class MultiCatchBLocks {
    public static void main(String[] args) {

        Employee employee=null;



        try{
            System.out.println(employee.getSalary());
        }catch (IndexOutOfBoundsException e){
            System.out.println("First catch block");
            e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println("Second catch block");
            e.printStackTrace();
        }catch (NullPointerException e){
            System.out.println("Third catch block");
            e.printStackTrace();
        }catch (RuntimeException e){
            System.out.println("Fourth Block");
        e.printStackTrace();
        }
        System.out.println("Test complete");




    }
}
