package day10_NeftedIf;

public class NameOfMonth {
    public static void main(String[] args) {
        int number=12;
       String result="";//temporary value
        if (number<=12&&number>=1){

            if (number==1){
                result="January";
            } else if (number==2) {
                result="February";
            }else if (number==3) {
                result="March";
            }else if (number==4) {
                result="April";
            }else if (number==5) {
                result="May";
            }else if (number==6) {
                result="June";
            }else if (number==7) {
                result="July";
            }else if (number==8) {
                result="August";
            }else if (number==9) {
                result="September";
            }else if (number==10) {
                result="October";
            }else if (number==11) {
                result="November";
            }else  {
                result="December";
            }


        }else {//if the number is not valid
           result="Invalid";
        }
        System.out.println(result);




        /*
        pre-condition: if there is only one statement in the block
        not recommended
          int n = 5;

       String name = (n==1)? "Jan" :(n==2)? "Feb" :(n==3)? "Mar" :(n==4)? "April" :(n==5)? "May" :(n==6)?"Jun"
        :(n==7)? "Jul" :(n==8)? "Aug" :(n==9)? "Sep" :(n==10)? "Oct" :(n==11)?"Nov" : "Dec";

        System.out.println(name);
         */

    }
}
