package day10_NeftedIf;

public class GradeReport2 {
    public static void main(String[] args) {


    int score=90;

    String result= (score<=100&&score>=0)? (score>=90&&score<=100)?"Excellent" :(score>=80&&score<=89)? "Great":(score>=70&&score<=79)?"Good"
            :(score>=60&&score<=69)?"Passed":
            "Failed":"Invalid Score";


        System.out.println(result);


/*
        90 ~ 100: Excellent
        80 ~ 89: Great
        70 ~ 79: Good
        60 ~ 69: Passed
        0 ~ 59: failed
         */

        System.out.println("-------------------------------------------");
        // solution3:
        String result2 = "";
int s=score;
        if (s >= 0 && s <= 100) { // if the s is valid (0 ~ 100 )

            result2 = (s >= 90) ? "Excellent" : (s >= 80) ? "Great" : (s >= 70) ? "Good" : (s >= 60) ? "Passed" : "Failed";

        } else { // if the s is NOT valid
            result2 = "Invalid Score";
        }

        System.out.println(result2);



        if (s >= 0 && s <= 100) { // if the s is valid (0 ~ 100 )
            // 5 possibilities: A, B, C, D, F
            if (s >= 90) { //false:  s < 90
                System.out.println("Excellent");
            } else if (s >= 80) { // false: s < 80
                System.out.println("Great");
            } else if (s >= 70) { // false: s < 70
                System.out.println("Good");
            } else if (s >= 60) {// false: s < 60
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }

        } else { // if the s is NOT valid
            System.out.println("Invalid Score");
        }

        System.out.println("-------------------------------------------");
        /*
        // solution2: use ternaries ONLY
        String result = (s >= 0 && s <= 100) ? (s >= 90) ? "Excellent" : (s >= 80) ? "Great" : (s >= 70) ? "Good"
                        : (s >= 60) ? "Passed" : "Failed" : "Invalid Score";
        System.out.println(result);
         */
}}
