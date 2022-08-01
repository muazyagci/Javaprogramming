package day10_NeftedIf;

public class TernariesWithNestedIf {
    public static void main(String[] args) {

        int score=600;
     /*
        if (score>=0&& score<=100){

            if (score>=60){
                System.out.println("Passed");
            }else {
                System.out.println("Failed");
            }




        }else
            System.out.println("Invalid Score");


      */
// if you are going to convert nested if to ternaries it is not recommended because it is hard to readable. Mixing them would be ok

       String res =(score>=0&& score<=100)? (score>=60)?"Passed":"Failed": "Invalid Score";
//                     pre-condition          if                  else      pre-condition else

        System.out.println(res);

    }
}
