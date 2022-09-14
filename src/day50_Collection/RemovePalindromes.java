package day50_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class RemovePalindromes {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam"));

        Iterator<String> i = names.iterator();

        while (i.hasNext()) {
            String each = i.next();
            String reverse = "";

            for (int j = each.length() - 1; j >= 0; j--) {
                reverse += each.charAt(j);
            }

            if (each.equalsIgnoreCase(reverse)) {
                i.remove();
            }

        }
        System.out.println(names);
        System.out.println("-----------------------------------------------");
        List<String> names2 = new ArrayList<>();
        names.addAll(Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam"));

       /* Predicate<String> palindrome = str -> {
            String reverse = "";
            for (int j = str.length() - 1; j >= 0; j--) {
                reverse += str.charAt(j);
            }
            return reverse.equalsIgnoreCase(str);
        };
        System.out.println(names2);
        */

         /*
        names2.removeIf(str -> { String reverse = "";
            for(int i = str.length()-1; i >= 0; i--){
                reverse += str.charAt(i);
            }
            return reverse.equalsIgnoreCase(str);}
        );
        System.out.println(names2);
        */

    }
}
