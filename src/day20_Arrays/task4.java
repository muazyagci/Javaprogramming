package day20_Arrays;

import java.util.Arrays;

public class task4 {
    public static void main(String[] args) {
        String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char [] grades = new char[names.length];
        grades= new char[]{'A', 'B', 'C'};
        for (int i=0;i< names.length;i++) {
            System.out.println(names[i]+"'s score is "+scores[i]+" ,and grade is "+grades[i]);
        }
        /*
        4. given the following arrays:
		     	String [] names = {"Anna", "Nancy", "Sarah"};
		        int [] scores = {90, 75, 80};
		        char [] grades = new char[names.length];

         1. write a program that can store the grades of the students in the array named grades
         2. print the grade report of each students in separate lines
         		Ex:
         			Anna's score is 90, and grade is A
         */
        
        
        
        
        int[] array={1,2,3,4,5};
        int[] reversedArray=new int[array.length];
        int a=0;
        for (int i = array.length-1; i >=0 ; i--) {
            reversedArray[a]+=array[i];
            a++;
        }
        System.out.println(Arrays.toString(reversedArray));

        /*
        5.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};
         */


        int[] array2={10, 0, 5, 0, 1, 0};
        Arrays.sort(array2);
        int[] result=new int[array2.length];
        int b=0;
        for (int i = array2.length-1; i >=0 ; i--) {
            result[b]+=array2[i];
            b++;
        }
        System.out.println(Arrays.toString(result));

        /*
        6. write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}

         */





       /* int[] arr1={1,2,3,4,5};
        int[] arr2={4,5,6,7,8};
        for (int i = 0; i < arr1.length ; i++) {
            for (int j = 0; j  ; j++) {
                
            }

        }

        */


        /*
        7. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5
         */
    }
}
