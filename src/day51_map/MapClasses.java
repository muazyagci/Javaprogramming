package day51_map;


import java.util.*;

public class MapClasses {
    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(10, "Arthur");
        hashMap.put(20, "George");
        hashMap.put(3, "Jack");
        hashMap.put(40, "Emma");
        hashMap.put(5, "Ahmet");
        hashMap.put(5, "Isabella");
        hashMap.put(6, null);
        hashMap.put(7, null);
        hashMap.put(8, null);
        hashMap.put(null, null);
        hashMap.put(null, "Emre");
        hashMap.put(null, "Hulya");

        System.out.println("hashMap = " + hashMap);

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();


        Map<Integer, String> treeMap = new TreeMap<>();


        Map<Integer, String> hashtable = new Hashtable<>();


    }
}
