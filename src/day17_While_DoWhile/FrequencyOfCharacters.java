package day17_While_DoWhile;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "AAAAABBBBBCCCC";
        char ch = 'A';
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
if (str.charAt(i)==ch){
    result++;
}
        }

        System.out.println("result = " + result);

        System.out.println("----------------------");





    }
}
