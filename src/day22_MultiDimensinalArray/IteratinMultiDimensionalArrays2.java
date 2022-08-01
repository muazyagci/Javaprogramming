package day22_MultiDimensinalArray;

public class IteratinMultiDimensionalArrays2 {
    public static void main(String[] args) {
        int nums[][]={{1,2,3},{4,5,6,7,8},{9,10,11,12,13}};

        for (int i =0; i <nums.length ; i++) {

            for (int i1 = nums[i].length-1; i1 >=0 ; i1--) {// i1 is index number of elements
                System.out.print(nums[i][i1]+" ");
            }
            System.out.println();

        }

        System.out.println("----------------------------------");
        for (int i =nums.length-1; i >=0 ; i--) {

            for (int i1 = 0; i1<nums[i].length ; i1++) {// i1 is index number of elements
                System.out.print(nums[i][i1]+" ");
            }
            System.out.println();

        }
        System.out.println("-----------------------------------------");

        for (int i = nums.length - 1; i >= 0; i--) {
            for (int i1 = nums[i].length - 1; i1 >= 0; i1--) {
                System.out.print(nums[i][i1]+" ");
            }
            System.out.println();
        }
    }
}
