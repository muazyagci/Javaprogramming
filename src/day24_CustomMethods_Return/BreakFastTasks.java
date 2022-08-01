package day24_CustomMethods_Return;


public class BreakFastTasks {
    public static void main(String[] args) {
        initials("Muaz", "Yagci");
        System.out.println("---------------------------");
        domain("m.muazyagci@gmail.com");
        System.out.println("---------------------------");
        String[] emails = {"josh@gmail.com", "jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com"};
        for (String email : emails) {
            domain(email);
        }
        System.out.println("---------------------------");
        nameOfMonths(12);
        System.out.println("---------------------------");
    nameOfDay(27);

    }

    public static void initials(String firstName, String lastName) {
        String initial = firstName.charAt(0) + "." + lastName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println("initial = " + initial);

    }

    public static void domain(String email) {// shows the entered domain
        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println("domain= " + domain);

    }

    public static void nameOfMonths(int number) {
        String name = "";
        if (number >= 1 && number <= 12) {
            name = (number == 1) ? "January" : (number == 2) ? "February" : (number == 3) ? "March" : (number == 4) ? "Apbril"
                    : (number == 5) ? "May" : (number == 6) ? "June" : (number == 7) ? "July" : (number == 8) ? "August"
                    : (number == 9) ? "September" : (number == 10) ? "October" : (number == 11) ? "November" : "December";
        } else {
            System.err.println("Invalid");
            //System.exit(0);
        }
        System.out.println("Month name = " + name);

    }

    public static void nameOfDay(int number) {
       String name="";
if (number>=1&&number<=28){
    name = (number == 1) ? "Sunday" : (number == 2) ? "Monday" : (number == 3) ? "Tuesday" : (number == 4) ? "Wednesday"
            : (number == 5) ? "Thursday" : (number == 6) ? "Friday" : (number == 7) ? "July" : (number == 8) ? "August"
            : (number == 9) ? "September" : (number == 10) ? "October" : (number == 11) ? "November" : "December";
}else {
    System.err.println("Invalid");
}
    }
public static void reverse(String str){
        String reverse="";

        for (int i=str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);
        }
    System.out.println(reverse);

    }

}
