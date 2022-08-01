package day10_NeftedIf;

public class gradeLevel {
    public static void main(String[] args) {
        byte gradelevels=5;
        String result="";
        
        
        if (gradelevels>=1&&gradelevels<=18){
            if (gradelevels>=1&&gradelevels<=5) {
                result = "Elementry school";
            } else if (gradelevels>=6&&gradelevels<=8) {
            result="Middle School";
                
            } else if (gradelevels>=9&&gradelevels<=12) {
                result="High School";
            } else if (gradelevels>=13&&gradelevels<=16) {
                result="Collage";
            }else {
                result="Grad School";
            }


        }else {
           result="For Any Other grade: Invalid grade level given";
        }
        System.out.println(result);

    }
}
