package WithOscar.Week08;


import java.util.Arrays;

public class ArraysUtilityExamples {
    public static void main(String[] args) {

        int[]nums={5,4,10,100,50,35};

        int[] nums2=nums;
        System.out.println(Arrays.equals(nums2,nums));
        System.out.println(nums2==nums);

        int[]nums3={5,4,10,100,50,35};
        System.out.println(Arrays.equals(nums3,nums));
        System.out.println(nums3==nums);


        Arrays.sort(nums2);
        System.out.println(Arrays.toString(nums));
        System.out.println();
        nums[0]=1000;
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums2));
        System.out.println(Arrays.toString(nums3));

    int []nums4=Arrays.copyOf(nums3,nums3.length);
        System.out.println(Arrays.toString(nums4));
    Arrays.sort(nums3);
        System.out.println();
    }

}
