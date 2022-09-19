package day51_map;

import java.util.*;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str="bbvvvaaaaa";
        String[] arr=str.split("");
        Map<String, Integer> frequency=new LinkedHashMap<>();

        for (String each : arr) {
            int frequency2=Collections.frequency(Arrays.asList(arr),each);
            frequency.put(each,frequency2);
        }

        System.out.println(frequency);

    }
}
