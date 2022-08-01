package day22_MultiDimensinalArray;

import java.util.Arrays;

public class MultiDimensionalArrays2 {
    public static void main(String[] args) {
        int[] arr1={1,2,3};
        int[] arr2={1,2,3};
        int[] arr3={1,2,3};

        int[][] arr2D={{1,2,3},{4,5,6},{7,8,9}};

        //3Dimensional Array contains two dimensional arrays
       int[][][] arr3D={{{1,2,3},{4,5,6},{7,8,9}},{{1,2,3},{4,5,6},{7,8,9}},{{1,2,3},{4,5,6},{7,8,9}}};

        System.out.println(Arrays.deepToString(arr3D));

    

    }
}
