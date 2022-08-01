package day27_WrapperClasses;

import java.util.Arrays;

public class Replace {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        array=replace(array,2,30);
        System.out.println(Arrays.toString(array));
        System.out.println("---------------------------");

        String[] arr2={"Java","Python","C++","Ruby"};
        String[] arr3=replace(arr2,1,"JavaScript");
        System.out.println(Arrays.toString(arr3));
    }
    //replace the element of the array at given index with the new element
    public static int[]replace(int[] array,int index,int element){
      if (index<0||index> array.length-1){
          System.err.println("Invalid index "+index);
          System.exit(0);
      }

       array[index]=element;

        return array;
    }

    //replace the element of the array at given index with the new element
    public static double[]replace(double[] array,int index,double element){
        if (index<0||index> array.length-1){
            System.err.println("Invalid index "+index);
            System.exit(0);
        }

        array[index]=element;

        return array;
    }

    //replace the element of the array at given index with the new element
    public static char[]replace(char[] array,int index,char element){
        if (index<0||index> array.length-1){
            System.err.println("Invalid index "+index);
            System.exit(0);
        }

        array[index]=element;

        return array;
    }

    //replace the element of the array at given index with the new element
    public static String[]replace(String[] array,int index,String element){
        if (index<0||index> array.length-1){
            System.err.println("Invalid index "+index);
            System.exit(0);
        }

        array[index]=element;

        return array;
    }


}
