package day26_CustomMethodsPractice;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5};
        num=reverse(num);
        System.out.println(Arrays.toString(num));

    }
    public static int[] reverse(int[] array) {

        int[] result = new int[array.length];

        for (int i = array.length - 1,j=0; i >= 0; i--,j++) {

            result[j] = array[i];

        }


        return result;
    }
}
