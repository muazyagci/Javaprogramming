package day24_CustomMethods_Return;

import java.sql.PreparedStatement;

public class RetunMethodPractice {
    public static void main(String[] args) {
        int max = maxNumber(100, 200);
        System.out.println(max);
        int multiplication = max * 2;
        System.out.println("Multiplcation= "+multiplication);
    }

    public static int maxNumber(int a, int b) {
        int result = 0;
        if (a > b) {
            result = a;
        } else {
            result = b;
        }
        return result;
    }

}
