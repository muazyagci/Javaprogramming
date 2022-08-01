package Tasks;

import java.util.Arrays;

public class day24task2 {
    public static void main(String[] args) {
        boolean isAnagram = isAnagram("cba", "bac");
        System.out.println(isAnagram);

    }



    public static boolean isAnagram(String word1, String word2) {
        boolean isAnagram = false;
        char[] wordCh1 = word1.toCharArray();
        char[] wordCh2 = word2.toCharArray();

        Arrays.sort(wordCh1);
        Arrays.sort(wordCh2);

        if (Arrays.equals(wordCh1, wordCh2)) {
            isAnagram = true;
        }
        System.out.println(wordCh1);
        return isAnagram;

    }

    }


