package day25_CustomMethod_Overloading;

import Utilities.ArraysUtility;

public class test2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        ArraysUtility.printEach(arr1);
        System.out.println("----------------");
        double[] arr2 = {1.2, 2.3, 4.5, 5.6, 7.8};
        ArraysUtility.printEach(arr2);
        System.out.println("-----------------");
        char[] arr3 = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        ArraysUtility.printEach(arr3);
        System.out.println("-------------------");
        String[] arr4 = {"Ahmet", "mehmet", "Orhan", "Sehmuz", "Ferasettin", "Oguz"};
        ArraysUtility.printEach(arr4);
        System.out.println("---------------*");
        int[] n1 = {12, 34, 123, 563, 123, 46778};
        int max = ArraysUtility.maxNumber(n1);
        System.out.println(max);
        System.out.println("-------------------");
        double[] n2 = {2.3, 4.5, 6.6, 7.8, 20.5};
        double max2 = ArraysUtility.maxNumber(n2);
        System.out.println(max2);
        System.out.println("----------------");
        int min = ArraysUtility.minNumber(n1);
        System.out.println(min);
        System.out.println("-----------------");
        double min2 = ArraysUtility.minNumber(n2);
        System.out.println(min2);
        System.out.println("-----------------");

    }
}
