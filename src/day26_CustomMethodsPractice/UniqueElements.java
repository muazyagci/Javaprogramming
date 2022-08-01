package day26_CustomMethodsPractice;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {
int[] array={1,1,2,3,3,4,5,5,6,7,7,7};
int[] unique=UniqueElements(array);
        System.out.println(Arrays.toString(unique));

        double[] array2 = {1.5, 2.5, 1.5, 3.5, 4.5, 4.5, 5.5, 5.5};
double[] unique2=UniqueElements(array2);
        System.out.println(Arrays.toString(unique2));



    }
//returns the unique elements of the array as the new array
    public static int[] UniqueElements(int[] array){
        int[] result={};// new int[0]

        for (int i : array) {

            if (ArraysUtility.frequencyofElement(array,i)==1){//if the frequency is 1 element is unique
                result=ArraysUtility.addElement(result,i);//if the elements is unique it will pass it to result array
            }
        }

        return result;
    }
    public static double[] UniqueElements(double[] array){
        double[] result={};// new int[0]

        for (double i : array) {

            if (ArraysUtility.frequencyofElement(array,i)==1){//if the frequency is 1 element is unique
                result=ArraysUtility.addElement(result,i);//if the elements is unique it will pass it to result array
            }
        }

        return result;
    }

    public static char[] UniqueElements(char[] array){
        char[] result={};// new int[0]

        for (char i : array) {

            if (ArraysUtility.frequencyofElement(array,i)==1){//if the frequency is 1 element is unique
                result=ArraysUtility.addElement(result,i);//if the elements is unique it will pass it to result array
            }
        }

        return result;
    }

    public static String[] UniqueElements(String[] array){
        String[] result={};// new int[0]

        for (String i : array) {

            if (ArraysUtility.frequencyofElement(array,i)==1){//if the frequency is 1 element is unique
                result=ArraysUtility.addElement(result,i);//if the elements is unique it will pass it to result array
            }
        }

        return result;
    }
}
