package WithOscar.Week07;

import java.util.Random;

public class RandomPassword {
    public static void main(String[] args) {
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_!@#$%^&*";
        String password = "";

        Random random = new Random();

        int number;


        for (int i = 0; i < 8; i++) {
            number = random.nextInt(source.length());// generates random index numbers
            password += source.charAt(number);

        }
        System.out.println(password);




    }
}
