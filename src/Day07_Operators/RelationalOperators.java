package Day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {
        //>, >=, <, <=
        boolean result1=200>40;
        System.out.println("result1 = " + result1);
        boolean result2=300>=150;
        System.out.println("result2 = " + result2);
        boolean result3= 100>=100;
        System.out.println("result3 = " + result3);

        boolean resul4 =100>=890;
        System.out.println("resul4 = " + resul4);

        int  creditScore=745;
        boolean creditEligibleForLoan= creditScore>=720;

        boolean result5=100<120;
        System.out.println("result5 = " + result5);

        boolean result6=200<180;
        System.out.println("result6 = " + result6);

        int score=59;
        boolean HasFailed=score>=59;
        System.out.println("HasFailed = " + HasFailed);

        int idealnumber=58;
        boolean idealnumbercheck=idealnumber==58;
        System.out.println("idealnumbercheck = " + idealnumbercheck);

        int x=100;
        int y=200;
        boolean equal=x==y;
        System.out.println("equal = " + equal);

        boolean result8= "Muhtar"=="Good Guy";
        System.out.println("result8 = " + result8);

        boolean result9='A'=='a';
        System.out.println("result9 = " + result9);

boolean result10 ="Java"=="Java";
        System.out.println("result10 = " + result10);

        boolean result11=100!=101;
        System.out.println("result11 = " + result11);

boolean result12= "Java"!="Break";
        System.out.println("result12 = " + result12);








    }
}
