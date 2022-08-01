package day27_WrapperClasses;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
int[] array={1,1,1,2,2,3,4,5,5,6,6,};
array=removeDuplicates(array);
        System.out.println(Arrays.toString(array));
        System.out.println("-----------------");
        String[] arr1={"Ahmet","Ahmet","Mehmet","Mehmet"};
        arr1=removeDuplicates(arr1);
        System.out.println(Arrays.toString(arr1));
    }
//removes the duplicates from the given array, returns the new array
    public static int[] removeDuplicates(int[] array) {
        int[] result = {};
        for (int i : array) {
            if (!ArraysUtility.contains(result, i)) {
                result = ArraysUtility.addElement(result, i);
            }
        }
        return result;
    }

    //removes the duplicates from the given array, returns the new array
    public static double[] removeDuplicates(double[] array) {
        double[] result = {};
        for (double i : array) {
            if (!ArraysUtility.contains(result, i)) {
                result = ArraysUtility.addElement(result, i);
            }
        }
        return result;
    }

    //removes the duplicates from the given array, returns the new array
    public static char[] removeDuplicates(char[] array) {
        char[] result = {};
        for (char i : array) {
            if (!ArraysUtility.contains(result, i)) {
                result = ArraysUtility.addElement(result, i);
            }
        }
        return result;
    }

    //removes the duplicates from the given array, returns the new array
    public static String[] removeDuplicates(String[] array) {
        String[] result = {};
        for (String i : array) {
            if (!ArraysUtility.contains(result, i)) {
                result = ArraysUtility.addElement(result, i);
            }
        }
        return result;
    }
}
