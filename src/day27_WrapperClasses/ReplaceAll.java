package day27_WrapperClasses;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class ReplaceAll {
    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 4, 5, 5};
        array = replaceAll(array, 5, 90);
        System.out.println(Arrays.toString(array));
    }

    //replaces all the matching old value of the array with the new value
    public static int[] replaceAll(int[] array, int oldElement, int newElement) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement) {
                array[i] = newElement;
            }
        }

        return array;
    }

    //replaces all the matching old value of the array with the new value
    public static double[] replaceAll(double[] array, double oldElement, double newElement) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement) {
                array[i] = newElement;
            }
        }

        return array;
    }

    //replaces all the matching old value of the array with the new value
    public static char[] replaceAll(char[] array, char oldElement, char newElement) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement) {
                array[i] = newElement;
            }
        }

        return array;
    }

    //replaces all the matching old value of the array with the new value
    public static String[] replaceAll(String[] array, String oldElement, String newElement) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement) {
                array[i] = newElement;
            }
        }

        return array;
    }
}
