package day24_CustomMethods_Return;

public class ReturnMethodsPractice2 {
    public static void main(String[] args) {
String str1=CheckGrade(95);
        if (str1.equals("A")){
            System.out.println("Excellent");
        } else if (str1.equals("B")) {
            System.out.println("Great");
        } else if (str1.equals("C")) {
            System.out.println("Good");
        } else if (str1.equals("D")) {
            System.out.println("Passed");
        }else if (str1.equals("C")){
            System.out.println("Failed");
        }else {
            System.err.println("Invalid");
        }


    }
    public static String CheckGrade(int score){
        String result="";
        if (score<0||score>100){
            result="Invalid";
        }else {//valid
            result=(score>=90)?"A":(score>=80)?"B":(score>=70)?"C":(score>=60)?"D":"F";
        }
    return result;
    }

}
