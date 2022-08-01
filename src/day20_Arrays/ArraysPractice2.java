package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {
        char[] letters=new char[26];

        for (char i='A',j=0;i<='Z'&&j< letters.length;i++,j++) {//i:index numbers 0- last index
letters [j]=i;
        }
        System.out.println(Arrays.toString(letters));

        System.out.println("------------------------------------------------------------------------------------------------------------------");
/*
        for (char i = 'Z', j = 25; i >='A'&&j>=0 ; i--,j--) {
letters[i]=j;

        }
        System.out.println(Arrays.toString(letters));

 */



    }
}
