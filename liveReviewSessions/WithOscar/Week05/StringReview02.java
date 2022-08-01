package WithOscar.Week05;

import java.util.Locale;
import java.util.Scanner;

public class StringReview02 {
    public static void main(String[] args) {
/*
lenght(): No parameter ---- returns integer
 */
        String message = "EU9 is doing so great!!";
    int count=message.length();

        System.out.println("count = " + count);

        /*
        message.lenght(); it is very usefull to create Loops that involves Strings, for getting size
         */

        System.out.println(message.toUpperCase());

        /*
        message.toUpperCase() : what happens in the Java memory, a new String is created in the String Pool
        however 'message' my object reference is still pointing to the old object (original)
         */
        System.out.println(message);
message= message.toUpperCase();
        System.out.println("message = " + message);
        String message2=message.toLowerCase();

    }
}
