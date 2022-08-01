package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChars {
    public static void main(String[] args) {
        String str="Cydeo12345School!@#$%WoodenSpoon";

        String digits="";
        String letters="";
        String specialchars="";

        for (int i = 0; i <str.length() ; i++) {// i: index number of str (o -- last index)

            char ch=str.charAt(i);
           // System.out.println(ch);
            if (ch>'a'&&ch<'z'||ch>'A'&&ch<'Z'){//if the character is between 'A' to 'Z' then it's letter or 'a' to 'z'
letters+=ch;
            } else if (ch>='0'&&ch<='9') {//if the character is between '0' to '9'
                digits+=ch;
            } else  {//if the character is neither digit nor letter, then it's special character
               if (ch!=' ') {// if the special character is not the space

                   specialchars += ch;
               }
               }

     
    }
        System.out.println();
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialchars = " + specialchars);

    }}
