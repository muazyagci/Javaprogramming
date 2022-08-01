package day24_CustomMethods_Return;

public class ReturnStatement2 {
    public static void main(String[] args) {
nameOfMonths(10);
    }
    public static void nameOfMonths(int number) {
        String name = "";
        if (number<1||number>12){
            System.err.println("Invalid");
            return;//exits method

        }
            name = (number == 1) ? "January" : (number == 2) ? "February" : (number == 3) ? "March" : (number == 4) ? "April"
                    : (number == 5) ? "May" : (number == 6) ? "June" : (number == 7) ? "July" : (number == 8) ? "August"
                    : (number == 9) ? "September" : (number == 10) ? "October" : (number == 11) ? "November" : "December";

        System.out.println("Month name = " + name);

    }
}
