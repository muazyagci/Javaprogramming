package day10_NeftedIf;

public class NameOfMonths2 {
    public static void main(String[] args) {

        int number=10;

// the parenthesis is optional in ternaries but in if statement it is obligatory, and it is strongly recommended to put parenthesis.
        String result3= number==1?"Jan":number==2?"Feb":number==3?"March":number==4?"April":number==5?"May":(number==6)?"June":(number==7)?"July"
                :(number==8)?"Aug":(number==9)?"Sep":(number==10)?"Oct":(number==11)?"Nov":"Dec";
        System.out.println(result3);

/*
if:       (Condition)?
else:                :
else if: :(Condition)?
 */






    }
}
