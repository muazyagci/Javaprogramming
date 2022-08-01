package day11_Switch_Scanner;

public class numberToWords {
    public static void main(String[] args) {
        int numbers=9;
        boolean iseligible=numbers>=0&&numbers<=9;
       String result=(iseligible)? (numbers==0)?"Zero"  :(numbers==1)?"One" :(numbers==2)?"Two" :(numbers==3)?"Three"
               :(numbers==4)?"Four" :(numbers==5)?"Five" :(numbers==6)?"Six" :(numbers==7)?"Seven" :(numbers==8)?"Eight" :"Nine"
        :"Invalid";

        System.out.println(result);


    }
}
