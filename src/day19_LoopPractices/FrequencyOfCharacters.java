package day19_LoopPractices;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "aabcccd";
        /*
        int a = 0, b = 0, c = 0, d = 0;


        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                a++;
            } else if (str.charAt(i) == 'b') {
                b++;

            } else if (str.charAt(i) == 'c') {
                c++;

            } else if (str.charAt(i) == 'd') {
                d++;

            }
        }
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        String str2 = "  aabccdeef";
        int unique = 0;

        System.out.println("unique = " + unique);

         */
        String result = "";
        for (int j = 0; j <str.length() ; j++) {


            char ch = str.charAt(j);//'a'

            int count = 0;

            for (int i = 0; i < str.length(); i++) {

                char each = str.charAt(i);// each character of str

                if (ch == each) {

                    count++;
                }
            }
            if (result.contains(""+ch)){
                continue;
            }
            result+=ch;
            result+=count;

        }
        System.out.println("result = " + result);




    }
}
