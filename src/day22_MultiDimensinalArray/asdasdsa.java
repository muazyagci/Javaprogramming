package day22_MultiDimensinalArray;

import java.util.Arrays;

public class asdasdsa {
    public static void main(String[] args) {
       String sentecne="Today is a good day to learn Java";

       String[] words=sentecne.split(" ");
        System.out.println(Arrays.toString(words));

        String reversedSentece="";

        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentece+=words[i]+" ";

        }
        System.out.println(reversedSentece);

    }
}
