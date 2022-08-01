package WithOscar.Week06;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

       /* for (int i = 1; i <100 ; i+=i) {
            System.out.println(i);
        }

        */

        Scanner scanner=new Scanner(System.in);

        int n = scanner.nextInt();  // 6
        int num1 = 0;
        int num2 = 1;
        int sum ;

        // Variables are containers that hod value

        String series = ""+num1+" "+num2+" ";

        for (int i = 2; i<=n ; i++){   // if n=6, it will do 5 times iteration
            sum = num1+num2;
            series +=sum+" ";
            num1 = num2;
            num2 = sum;
        }
        System.out.println("series = " + series);
        System.out.println("final number in the squence = " + num2);

    }
}
