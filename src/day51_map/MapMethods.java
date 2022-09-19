package day51_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapMethods {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();

        students.put("Aygun", 85);
        students.put("Maria", 86);
        students.put("Ali", 95);
        students.put("Alex", 96);
        students.put("Ozan", 98);
        students.put("Serkan", 97);
        students.put("Andriy", 98);

        System.out.println("students = " + students);
        System.out.println(students.size());

        System.out.println("students.get(\"Ali\") = " + students.get("Ali"));


        students.replace("Ali", 90);
        System.out.println(students);

        students.remove("Ozan");
        System.out.println(students);

        students.remove("Alex");
        System.out.println(students);

        boolean r1 = students.containsKey("Muhtar");
        boolean r2 = students.containsKey("Serkan");
        System.out.println(r1);
        System.out.println(r2);

        boolean r3= students.containsValue(99);
        System.out.println(r3);

        System.out.println(students.isEmpty());



    }
}
