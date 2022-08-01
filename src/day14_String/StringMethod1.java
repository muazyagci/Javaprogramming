package day14_String;

public class StringMethod1 {
    public static void main(String[] args) {
        String str1 = "   batch     25      ";

        str1 = str1.trim();
        System.out.println("str1 = " + str1);

        String str2 = "Cydeo School";

        int n1 = str2.indexOf("h");
        System.out.println("n1 = " + n1);

        int n2 = str2.indexOf("ool");
        System.out.println("n2 = " + n2);

        String str3 = "java Programming Language";

        int n3 = str3.indexOf("an");
        System.out.println("n3 = " + n3);

        int n4 = str3.lastIndexOf("Lan");
        System.out.println("n4 = " + n4);

        int n5 = str3.lastIndexOf("Lan");
        System.out.println("n5 = " + n5);

        System.out.println("-----------------------");

        String s = "Java Nova Cava Wawa orange";

        int firsta = s.indexOf("a");
        int lastA = s.lastIndexOf("a");
        int secondA = s.indexOf("a ");
        int thirdA = s.indexOf("a C");
        //int fourthA=s.indexOf("ava W");
        //int fourthA = s.lastIndexOf("av");
        int fourtA = s.indexOf("Ca") + 1;
        //int fifthA=s.lastIndexOf("va")+1;
        int fifthA = s.lastIndexOf("a W");
        int sixthA = s.lastIndexOf("aw");
        int seventhA = s.lastIndexOf("a ");

        System.out.println("firsta = " + firsta);
        System.out.println("lastA = " + lastA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirdA = " + thirdA);
        System.out.println("fourthA = " + fourtA);
        System.out.println("fifthA = " + fifthA);
        System.out.println("sixthA = " + sixthA);
        System.out.println("seventhA = " + seventhA);


    }


}
