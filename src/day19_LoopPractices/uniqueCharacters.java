package day19_LoopPractices;

public class uniqueCharacters {
    public static void main(String[] args) {
        String str = "aabccdeef";

        String result = "";
        for (int j = 0; j < str.length(); j++) {


            char ch = str.charAt(j);
            int count = 0;// represents frequency of the ch


            count = 0;

            for (int i = 0; i < str.length(); i++) {// compares the character that outher loop picked, with each character

                char each = str.charAt(i);// each character of str

                if (ch == each) {

                    count++;

                }

            }

          /*  if (count == 1) {// if the frequency of the character is 1, then the character is unique
                result += ch + " ";

            }

           */
            if (count!=1){
                continue;
            }
            result+=ch+" ";


        }
        System.out.println("result = " + result);


    }
}
