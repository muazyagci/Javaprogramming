package day22_MultiDimensinalArray;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3}, {4, 5, 6, 7,}, {8, 9, 10, 11, 12}};
        for (int i = nums.length - 1; i >= 0; i--) {
            for (int i1 = nums[i].length - 1; i1 >= 0; i1--) {
                System.out.print(nums[i][i1]+" ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------");

       /* for (int[] each1DArray:nums){
            System.out.println(Arrays.toString(each1DArray));
        }

        */

   for (int[] each1DArray:nums){
       for (int eachElement:each1DArray){
           System.out.print(eachElement+" ");
       }
       System.out.println();
   }



    }
}
