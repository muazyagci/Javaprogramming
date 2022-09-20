package day52_Map_FunctionalsInterface;

import java.util.*;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aabcccdeeeef";

        String[] arr=str.split("");

        Map<String,Integer> result=new LinkedHashMap<>();

        for (String each : arr) {
            int frequency=Collections.frequency(Arrays.asList(arr),each);
            if (frequency==1){
                result.put(each,1);
            }
        }

        System.out.println(result);
    }
}
