package day01;


import Utilities.StringUtility;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
       String str="Wooden Spoon";
        StringUtility.printEachChar(str);
        System.out.println("---------------------");
       str= StringUtility.reverse(str);
        System.out.println(str);
        System.out.println("----------------");
       boolean palindrome= StringUtility.isPalindrome(str);
        System.out.println(palindrome);
        System.out.println("------------------");
        String word="Civic";
        boolean palin=StringUtility.isPalindrome(word);
        System.out.println(palin);
        System.out.println("----------------------");
        String[] names={"Anna","Java","Python","Mom","Cydeo","racecar"};
        int count=0;
        for (String each : names) {
            if (StringUtility.isPalindrome(each)){
                count++;
            }
        }
        System.out.println(count);
        System.out.println("-----------------");
        String word2="Civic";
        boolean isAnagram=StringUtility.isAnagram(word,word2);
        System.out.println(isAnagram);
        System.out.println("------------");
        String str3=StringUtility.removeDuplicates(word);
        System.out.println(str3);
    }

}
