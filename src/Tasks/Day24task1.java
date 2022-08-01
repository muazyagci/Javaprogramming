package Tasks;

public class Day24task1 {
    public static void main(String[] args) {
        String sentence = "Java java java".toLowerCase();
        String word = "java".toLowerCase();
        int frequency = 0;

        for (int i = 0; i < sentence.length() - word.length() + 1; i++) {


            if (sentence.substring(i, i + word.length()).contains(word)) {
                frequency++;


            }


        }

        System.out.println(frequency);
    }
}
