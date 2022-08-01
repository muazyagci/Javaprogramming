package day16_ForLoopStringPractice;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str="aaabccc";

        String result="";


        for (int i = 0; i <str.length() ; i++) {
            char vh=str.charAt(i);
            if (str.indexOf(vh)==str.lastIndexOf(vh)){
                result+=vh;

            }
        }
        System.out.println();
        System.out.println(result);




    }
}
