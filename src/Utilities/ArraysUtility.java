package Utilities;

import java.util.Arrays;

public class ArraysUtility {

    //prints each integer of an integer array in separate lines
    public static void printEach(int[] array) {
        for (int each : array) {
            System.out.println(each);
        }
    }


    //prints each double of double array in separate lines
    public static void printEach(double[] array) {
        for (double each : array) {
            System.out.println(each);
        }
    }


    //prints each char of char array in separate lines
    public static void printEach(char[] array) {
        for (char each : array) {
            System.out.println(each);
        }
    }


    //prints each String of String array in separate lines
    public static void printEach(String[] array) {
        for (String each : array) {
            System.out.println(each);
        }
    }


    //returns the maximum number from integer array
    public static int maxNumber(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }


    //returns the maximum number from double array
    public static double maxNumber(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }


    //returns the minimum number from integer array
    public static int minNumber(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }


    //returns the minimum number from double array
    public static double minNumber(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }


    //checks if the given integer is contained in the given array. returns boolean.  contains(int[], int)
    public static boolean contains(int[] array, int element) {

        boolean result = false;

        for (int each : array) {
            if (each == element) { // if any array's element is matching with the given element, it means the given elements is contained in the array
                result = true;
            }
        }

        return result;
    }


    //checks if the given double is contained in the given array. returns boolean.
    public static boolean contains(double[] array, double element) {

        boolean result = false;

        for (double each : array) {
            if (each == element) {
                result = true;
            }
        }

        return result;
    }


    //checks if the given char is contained in the given array. returns boolean.
    public static boolean contains(char[] array, char element) {

        boolean result = false;

        for (char each : array) {
            if (each == element) {
                result = true;
            }
        }

        return result;
    }


    //checks if the given String is contained in the given array. returns boolean.
    public static boolean contains(String[] array, String element) {

        boolean result = false;

        for (String each : array) {
            if (each.equals(element)) {
                result = true;
            }
        }

        return result;
    }


    // adds the given element to array, returns a new array
    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1];

        int i = 0;
        for (int each : array) {
            result[i++] = each;
        }

        result[i] = element;

        return result;
    }


    // adds the given element to array, returns a new array
    public static double[] addElement(double[] array, double element) {
        double[] result = new double[array.length + 1];

        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }

        result[result.length - 1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }


    // adds the given element to array, returns a new array
    public static String[] addElement(String[] array, String element) {
        String[] result = new String[array.length + 1];

        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }

        result[result.length - 1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }


    // adds the given element to array, returns a new array
    public static char[] addElement(char[] array, char element) {
        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }

        result[result.length - 1] = element; // element need to be assigned to the last index
        // result[i] = element;

        return result;

    }

    // adds the given element to array, returns a new array
    public static int frequencyofElement(int[] array, int element) {
        int count = 0;
        for (int i : array) {
            if (i == element) {
                count++;
            }
        }

        return count;
    }

    // adds the given element to array, returns a new array
    public static double frequencyofElement(double[] array, double element) {
        double count = 0;
        for (double i : array) {
            if (i == element) {
                count++;
            }
        }

        return count;
    }

    // adds the given element to array, returns a new array
    public static char frequencyofElement(char[] array, char element) {
        char count = 0;
        for (char i : array) {
            if (i == element) {
                count++;
            }
        }

        return count;
    }

    // adds the given element to array, returns a new array
    public static int frequencyofElement(String[] array, String element) {
        int count = 0;
        for (String i : array) {
            if (i.equals(element)) {
                count++;
            }
        }

        return count;
    }

    public static int[] UniqueElements(int[] array) {
        int[] result = {};// new int[0]

        for (int i : array) {

            if (ArraysUtility.frequencyofElement(array, i) == 1) {//if the frequency is 1 element is unique
                result = ArraysUtility.addElement(result, i);//if the elements is unique it will pass it to result array
            }
        }

        return result;
    }

    public static double[] UniqueElements(double[] array) {
        double[] result = {};// new int[0]

        for (double i : array) {

            if (ArraysUtility.frequencyofElement(array, i) == 1) {//if the frequency is 1 element is unique
                result = ArraysUtility.addElement(result, i);//if the elements is unique it will pass it to result array
            }
        }

        return result;
    }

    public static char[] UniqueElements(char[] array) {
        char[] result = {};// new int[0]

        for (char i : array) {

            if (ArraysUtility.frequencyofElement(array, i) == 1) {//if the frequency is 1 element is unique
                result = ArraysUtility.addElement(result, i);//if the elements is unique it will pass it to result array
            }
        }

        return result;
    }

    public static String[] UniqueElements(String[] array) {
        String[] result = {};// new int[0]

        for (String i : array) {

            if (ArraysUtility.frequencyofElement(array, i) == 1) {//if the frequency is 1 element is unique
                result = ArraysUtility.addElement(result, i);//if the elements is unique it will pass it to result array
            }
        }

        return result;
    }

    //removes the index from the array, returns a new array at the end
    public static int[] removeElement(int[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        int[] result = new int[array.length - 1]; //1,2

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }

    //removes the index from the array, returns a new array at the end
    public static double[] removeElement(double[] array, double index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        double[] result = new double[array.length - 1]; //1,2

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }

    //removes the index from the array, returns a new array at the end
    public static char[] removeElement(char[] array, char index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        char[] result = new char[array.length - 1]; //1,2

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }

    //removes the index from the array, returns a new array at the end
    public static String[] removeElement(String[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        String[] result = new String[array.length - 1]; //1,2

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }

    //merge the given two arrays and returns the new array
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];

        for (int i : arr1) {
            result = addElement(result, i);
        }
        for (int i : arr2) {
            result = addElement(result, i);
        }
        return result;
    }

    //merge the given two arrays and returns the new array
    public static String[] merge(String[] arr1, String[] arr2) {
        String[] result = {};

        for (String i : arr1) {
            result = addElement(result, i);
        }
        for (String i : arr2) {
            result = addElement(result, i);
        }
        return result;
    }

    //merge the given two arrays and returns the new array
    public static double[] merge(double[] arr1, double[] arr2) {
        double[] result = {};

        for (double i : arr1) {
            result = addElement(result, i);
        }
        for (double i : arr2) {
            result = addElement(result, i);
        }
        return result;
    }

    //merge the given two arrays and returns the new array
    public static char[] merge(char[] arr1, char[] arr2) {
        char[] result = {};

        for (char i : arr1) {
            result = addElement(result, i);
        }
        for (char i : arr2) {
            result = addElement(result, i);
        }
        return result;
    }

    //reverses the given array
    public static int[] reverse(int[] array) {
        int[] result = {};
        for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result, array[i]);
        }
        return result;
    }

    //reverses the given array
    public static char[] reverse(char[] array) {
        char[] result = {};
        for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result, array[i]);
        }
        return result;
    }

    //reverses the given array
    public static double[] reverse(double[] array) {
        double[] result = {};
        for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result, array[i]);
        }
        return result;
    }

    //reverses the given array
    public static String[] reverse(String[] array) {
        String[] result = {};
        for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result, array[i]);
        }
        return result;
    }

    //replace the element of the array at given index with the new element
    public static int[] replace(int[] array, int index, int element) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index " + index);
            System.exit(0);
        }

        array[index] = element;

        return array;
    }

    //replace the element of the array at given index with the new element
    public static double[] replace(double[] array, int index, double element) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index " + index);
            System.exit(0);
        }

        array[index] = element;

        return array;
    }

    //replace the element of the array at given index with the new element
    public static char[] replace(char[] array, int index, char element) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index " + index);
            System.exit(0);
        }

        array[index] = element;

        return array;
    }

    //replace the element of the array at given index with the new element
    public static String[] replace(String[] array, int index, String element) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index " + index);
            System.exit(0);
        }

        array[index] = element;

        return array;
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

    //Checks if the given password is Strong or not
    public static boolean isStrongPassword(String password){


        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false;
        boolean r3 = false;
        boolean r4 = false;
        boolean r5 = false;

        char[] chars = password.toCharArray();
        for (char each : chars) {
            if (Character.isUpperCase(each)) {
                r2 = true;
            } else if (Character.isLowerCase(each)) {
                r3 = true;
            } else if (Character.isDigit(each)) {
                r5 = true;
            } else {//special char
                r4 = true;
            }

        }
        boolean isStrongPassword=r1 && r2 && r3 && r4 && r5;

        return isStrongPassword;
    }
}

