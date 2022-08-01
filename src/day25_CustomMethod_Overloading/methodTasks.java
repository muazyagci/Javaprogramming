package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class methodTasks {
    public static int maxNumber(int[] num){
        Arrays.sort(num);
        return num[num.length-1];
    }
}
