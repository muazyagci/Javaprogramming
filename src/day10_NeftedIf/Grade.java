package day10_NeftedIf;

public class Grade {
    public static void main(String[] args) {
      char grade='A';
     String result="";
      if (grade=='A'||grade=='B'||grade=='C'||grade=='D'||grade=='F'){
          if (grade=='A'){
              result="excellent";
          } else if (grade=='B') {
              result="great job";
          } else if (grade=='C') {
              result="good";
          } else if (grade=='D') {
              result="passed";
          }else {
              result="failed";
          }


      }else {
          result="Invalid";
      }
        System.out.println(result);
    }
}
