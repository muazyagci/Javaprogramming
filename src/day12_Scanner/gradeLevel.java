package day12_Scanner;

public class gradeLevel {
    public static void main(String[] args) {
        int grade=9;
String result="";
if (grade>=0&&grade<=18) {
    switch (grade) {
        case 1: case 2: case 3: case 4: case 5:
            result=("Elementary School");
            break;
            case 6: case 7: case 8:
          result=("Middle School");
            break;
            case 9: case 10: case 11: case 12:
            result=("High School");
            break;
            case 13: case 14: case 15:
          result=("Collage");
            break;
            case 17: case 18:
            result=("Grad School");
            break;
        default:
            result=("Invalid");

    }
}else {
   result=("Invalid");
}
        System.out.println(result);
        /*
        switch (grade){
            case 1:
            case 2:
            case 3:
            case 4:
                case 5:
                    System.out.println("Elementary School");
                    break;
            case 6:
            case 7:
            case 8:
                System.out.println("Middle School");
        break;
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("High School");
        break;
            case 13:  case 14:  case 15:  case 16:
                System.out.println("Collage");
break;
            case 17: case 18:
                System.out.println("Grad School");
        break;
            default:
                System.out.println("Invalid");

        }
*/




    }
}
