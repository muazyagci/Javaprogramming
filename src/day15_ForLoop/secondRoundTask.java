package day15_ForLoop;

public class secondRoundTask {
    public static void main(String[] args) {

        int num1=5;
        int a=1;
        for (int i = 1; i <= num1; i++) {
a*=i;

        }
        System.out.println(a);


        /*
        4. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )*/


        String input="mn@#123Ab!";
        String letter="";
        String digits="";
        String SpecialChars="";


        for (int i = 0; i <=input.length()-1 ; i++) {
if (input.charAt(i)>='a'&&input.charAt(i)<='z'||input.charAt(i)>='A'&&input.charAt(i)<='Z'){
    letter+=input.charAt(i);
} else if (input.charAt(i)>='1'&&input.charAt(i)<='9') {
    digits+=input.charAt(i);
} else {
    SpecialChars+=input.charAt(i);
}


        }
        System.out.println();
        System.out.println("--------------------");
        System.out.println();
        System.out.println("letter = " + letter);
        System.out.println("digits = " + digits);
        System.out.println("SpecialChars = " + SpecialChars);

   /* 5. write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!*/

String input2="A1B2C3";
int sum=0;
char asci=0;
        for (int i = 0; i <input2.length() ; i++) {
            asci=input2.charAt(i);
            if (input2.charAt(i)>='1'&&input2.charAt(i)<='9'){

sum+=asci-48;



            }



        }

        System.out.println("sum = " + sum);

        /*6. Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1
						             	   		...*/

String input3="Wooden Spoon";


            for (int i = input3.length()-1; i >=0 ; i--) {
                System.out.print(input3.charAt(i));



            }






	/*7. Write a program that can reverse any given string

			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW*/
        System.out.println();
        System.out.println("---------------------------------");


        String input4="Anna".toLowerCase();
String palindrome="";
        for (int i = input4.length()-1; i >=0 ; i--) {
          palindrome+=input4.charAt(i);


        }

        if (input4.equalsIgnoreCase(palindrome)){
            System.out.println("true");
        }else System.out.println("false");




	/*8. Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true

         */
    }
}
