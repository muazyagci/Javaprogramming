package Tasks;

public class day24task12 {
    public static void main(String[] args) {
frequency("java java java python python JAVA".toLowerCase(),"PYTHON".toLowerCase());

    }

    public static void frequency(String sentence, String word) {
        int frequency = 0;

        for (int i = 0; i < sentence.length() - word.length() + 1; i++) {


            if (sentence.substring(i, i + word.length()).contains(word)) {
                frequency++;


            }


        }
        System.out.println(frequency);
    }
}
