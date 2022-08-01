package day26_CustomMethodsPractice;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class MergeTwoArrays2 {
    public static void main(String[] args) {
int[] arr1={1,2,3,4};
int[] arr2={5,6,7,8};
int[] arr3=ArraysUtility.merge(arr1,arr2);
        System.out.println(Arrays.toString(arr3));

        System.out.println("-------------------------");

        char[] a1={'A','B','C'};
        char[] a2={'D','E','F'};
        char[] result2 =ArraysUtility.merge(a1,a2);
        System.out.println(Arrays.toString(result2));
        System.out.println("-------------------------");
        String[] array1={"Ben ","im ","adim "};
        String[] array2={"Muaz ","ya ","senin?"};
        String[] cumle=ArraysUtility.merge(array1,array2);
        System.out.println(Arrays.toString(cumle));
    }


}
