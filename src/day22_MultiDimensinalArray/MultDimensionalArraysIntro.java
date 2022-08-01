package day22_MultiDimensinalArray;

import java.util.Arrays;

public class MultDimensionalArraysIntro {
    public static void main(String[] args) {
        String[] group1={"Jon","Joes","James"};
        String[] group2={"Aaron","Shay","Breanna"};
        String[] group3={"Cassandra","Tahir","Aygun"};
        String[][] groups=new String[3][];
        groups[0]=group1;
        groups[1]=group2;
        groups[2]=group3;

        System.out.println(Arrays.toString(groups));

        System.out.println(Arrays.deepToString(groups));
        System.out.println("-------------------------------------------------------");

        int[][] nums={{1,2,3},{4,5,6,7,},{8,9,10,11,12}};

        System.out.println(Arrays.deepToString(nums));

        System.out.println(Arrays.toString(nums[1]));
        System.out.println((nums[2][3]));
    }
}
