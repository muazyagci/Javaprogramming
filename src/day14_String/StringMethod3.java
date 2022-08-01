package day14_String;


public class StringMethod3 {
    public static void main(String[] args) {
        //substring(beginning index,ending index)
        String word = "Cydeo School";
        String word1 = word.substring(0, 5);
        System.out.println("word = " + word);
        System.out.println("word1 = " + word1);
// the last index will be excluded in substring method

        String word2 = word.substring(6); // if you don't give the last index it will take till the of the index
        System.out.println("word2 = " + word2);

        String word3 = "Java Programming Language";

        String s1;//"Java"
        String s2;//"Programming"
        String s3;//"Language"
        s1 = word3.substring(0, word3.indexOf(" "));
        s2 = word3.substring(word3.indexOf(" ") + 1, word3.lastIndexOf(" "));
        s3 = word3.substring(word3.lastIndexOf(" ") + 1);
      /*  System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println(word3.indexOf("J"));
        System.out.println(word3.indexOf("P"));
        System.out.println(word3.indexOf("L"));
        System.out.println("");
        System.out.println("");

       */
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);


    }
}
