package day16_ForLoopStringPractice;

public class Reverse {
    public static void main(String[] args) {

        String word = "Wooden Spoon";
        System.out.println(word.length());

        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));

        }

    }
}
