package day16_ForLoopStringPractice;

import java.util.Scanner;

public class tasks {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter 5 numbers");
int nums=0,positives=0,negatives=0;

        for (int i = 0; i <5 ; i++) {
           nums= scan.nextInt();
           if (nums>0){
              positives+=1;
           } else if (nums<0) {
               negatives+=1;
           }
        }
        System.out.println();
        System.out.println(positives+" positive and "+negatives+" negatives");

        /*
        1. Write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative*/
        System.out.println();
        System.out.println("---------------------------------------");
        scan.nextLine();
        System.out.println("Please enter a String");
        String str= scan.nextLine();
        System.out.println("Please enter char");
       String chr= scan.next();
        System.out.println();
/*2. Write a program that asks user to enter a string and a char, the returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4


3. Write a program that asks user to enter two positive numbers,
     then multiply those two numbers without using multiplication (*) operator.
        if user enters any negative numbers, print Invalid

            Ex:
                inputs:
                    10
                    20

                output:
                    200



4. write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "Java Java";

            output:
                2

            Hint: you need to create


5. write a program to print true if the string "cat" and "pizza2" appear the same number of times in the given sentence

	        Ex:
	            sentence = "caT pizza2 dogG cAt"

	            output:
	                true

         */
    }
}
