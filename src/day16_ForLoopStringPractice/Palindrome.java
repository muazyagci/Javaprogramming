package day16_ForLoopStringPractice;

public class Palindrome {
    public static void main(String[] args) {
        String word="racecar";
String reversed="";
        for (int i = word.length()-1; i >=0 ; i--) {
            System.out.print(word.charAt(i));
        reversed+=word.charAt(i);
        }
        System.out.println();
    boolean isPalindrome=word.equalsIgnoreCase(reversed);
        System.out.println(isPalindrome);
    }
}
