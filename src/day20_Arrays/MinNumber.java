package day20_Arrays;

public class MinNumber {
    public static void main(String[] args) {

        int[] number={100,500,30,40,600,80,-90};
        int min=number[0];

        for (int i = number.length - 1; i >= 0; i--) {
            if (min>number[i]){// if there is an element in the array that's smaller
                min=number[i];//smaller number will be assigned to the variable min
            }
        }
        System.out.println(min);
    }
}
