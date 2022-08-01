package day17_While_DoWhile;

public class FrequencyofWord_While {
    public static void main(String[] args) {
        String str = "Java Java Java ";
        int frequency = 0;
        while (str.contains("Java")) {
            str = str.replaceFirst("Java", "");
            frequency++;

        }
        System.out.println(frequency);


        System.out.println("-------------------");

        String sr = "Cat Cat Cat Dog Dog";

        int countcat = 0;
        while (sr.contains("Cat")){
            sr=sr.replaceFirst("Cat","");
            countcat++;

        }
        System.out.println("countcat = " + countcat);

        System.out.println("----------------");

    String s="java java java python python";

    int countjava=0,countpython=0;
    while (s.contains("java")||s.contains("python")){
        if (s.contains("java")){
            s=s.replaceFirst("java","");
            countjava++;
        } else if (s.contains("python")) {
          s=   s.replaceFirst("python","");
            countpython++;

        }
    }

        System.out.println("countjava = " + countjava);
        System.out.println("countpython = " + countpython);
    }
}
