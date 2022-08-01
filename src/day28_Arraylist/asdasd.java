package day28_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class asdasd {
    public static void main(String[] args) {
        ArrayList<String> str2=new ArrayList<>();
        str2.addAll(Arrays.asList("Mehmet","Mustafa","Orhan","Veli","Sultan","AbdulHamit","Mahmut"));
        ArrayList<String> str=new ArrayList<>();
        str.add("Fatih");
        str.addAll(Arrays.asList("Mehmet","Mustafa","Orhan","Veli","Sultan","AbdulHamit","Mahmut"));
        System.out.println(str);
        System.out.println("------------------------------------");
        System.out.println(str.get(3));
        str.set(3,"Muaz");
        System.out.println(str);
        System.out.println(str.contains("abdulhamit"));
        System.out.println(  str.remove("Sultan"));
        System.out.println(str);
        System.out.println(str.containsAll(str2));
        System.out.println(str);
        str.toArray();
        System.out.println(str);
     /* //  str.clear();
        System.out.println(str);
        System.out.println( str.isEmpty());

      */
        System.out.println(str2);
        System.out.println("-----------------------------");
        System.out.println(str.retainAll(str2));
        System.out.println(str+"str1");
        System.out.println(str2);
    }
}
