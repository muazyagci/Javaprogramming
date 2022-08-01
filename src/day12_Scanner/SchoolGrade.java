package day12_Scanner;

import java.util.Scanner;

public class SchoolGrade {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Welcome to the Grader!");
        System.out.println("Please enter subject name number 1 and score for this subject");
        String subname1= scan.nextLine();
        double score1=scan.nextDouble();
        scan.nextLine();
        System.out.println("Please enter subject name number 2 and score for this subject");
        String subname2=scan.nextLine();
        double score2=scan.nextDouble();
        scan.nextLine();
        System.out.println("Please enter subject name number 2 and score for this subject");
        String subname3=scan.nextLine();
        double score3=scan.nextDouble();
        scan.nextLine();
        System.out.println("Please enter subject name number 2 and score for this subject");
        String subname4=scan.nextLine();
        double score4=scan.nextDouble();
        scan.nextLine();
        System.out.println("Please enter subject name number 2 and score for this subject");
        String subname5=scan.nextLine();
        double score5=scan.nextDouble();
double totalscore, avarage;
totalscore=score1+score2+score3+score4+score5;
avarage=totalscore/5;
        System.out.println("Summary:"+subname1+" - "+score1+", "+subname2+" - "+score2+",  "+subname3+" - "+score3+", "+subname4+" - "+score4+", "+subname5+" - "+score5+"\n" +
                "Your avarage score is: "+avarage+"\nThank you for using Grader!\nGoodbye");
        scan.close();
    }
}
