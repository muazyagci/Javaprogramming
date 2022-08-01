package day15_ForLoop;

public class StringMethods {
    public static void main(String[] args) {
        String str=" ";

        boolean r=str.isEmpty();

        System.out.println("r = " + r);

        boolean r1=str.isBlank();

        System.out.println("r1 = " + r1);

        String  str2="a";
        System.out.println(str2.isBlank());

        System.out.println("---------------------");

    String s1="CYDEO";
        String s2="cydeo";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println("-------------------------");

        String sentence="My favorite programming language is Java";

        System.out.println(sentence.contains("C#"));
        System.out.println(sentence.toLowerCase().contains("java"));






    }
}
