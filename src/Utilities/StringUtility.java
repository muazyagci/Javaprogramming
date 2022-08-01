package Utilities;

import java.util.Arrays;

public class StringUtility {
    public static void printEachChar(String str) {
        //prints each character of the given String
        for (int i = 0; i < str.length(); i++) {

            System.out.println(str.charAt(i));

        }
    }


    // reverses the given String and returns the reversed String
    public static  String reverse(String str){
        String result="";
        for (int i =str.length()-1; i >=0 ; i--) {
            result+=str.charAt(i);
        }
        return result;

    }
    //checks if the given string is palindrome
  public static boolean isPalindrome(String str){
        return reverse(str).equalsIgnoreCase(str);
  }
public static boolean isAnagram(String str1,String str2){
        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();
    Arrays.sort(ch1);
    Arrays.sort(ch2);
    return Arrays.equals(ch1,ch2);

}
public static String removeDuplicates(String str) {
    String result = "";

    for (int i = 0; i < str.length(); i++) {
        char each = str.charAt(i);
        if (!result.contains(""+each)){
            result+=each;
        }
    }
    return result;
}


}
