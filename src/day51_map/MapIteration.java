package day51_map;

import java.util.*;

public class MapIteration {
    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<>();

        students.put("Aygun", 95);
        students.put("Maria", 90);
        students.put("Ali", 85);
        students.put("Alex", 80);
        students.put("Ozan", 75);
        students.put("Serkan", 70);
        students.put("Andriy", 98);
/*
        Set<String> keys=students.keySet();

        for (String each : keys) {
            //System.out.println(each+" : "+students.get(each));
        students.replace(each,students.get(each)+5);

        }

 */
        System.out.println(students);


        for (String each : students.keySet()) {
            Integer eachValue = students.get(each);
       /*  if (eachValue<90){
             students.remove(each);
         }

        */
            if (eachValue < 90) {
                System.out.println(each);
            }
        }

        System.out.println(students);

        Map<String, Integer> earlyBirds = new HashMap<>();
        Map<String, Integer> angryBirds = new HashMap<>();
        for (String key : students.keySet()) {
            Integer value = students.get(key);
            if (value >= 90) {
                earlyBirds.put(key, value);
            } else {
                angryBirds.put(key, value);
            }
        }
        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("angryBirds = " + angryBirds);

        Set<String> names = students.keySet();
        System.out.println("---------------------------");

        //Collection<Integer> scores=students.values();

        List<Integer> scores = new ArrayList<>(students.values());

        System.out.println(scores);
        System.out.println("---------------------------------");
        for (Integer each : students.values()) {
            System.out.println(each);
        }
        System.out.println("--------------------------");

        int maxScore = Integer.MIN_VALUE;
        int minScore = Integer.MAX_VALUE;
        for (Integer each : students.values()) {
            if (each > maxScore) {
                maxScore = each;
            }

            if (each < minScore) {
                minScore = each;
            }
        }
        System.out.println(maxScore);
        System.out.println(minScore);
        System.out.println("-------------------------");

        int max = Collections.max(students.values());
        int min = Collections.min(students.values());

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        int count=0;
      /*  for (Integer each : students.values()) {

            if (each>=95){
                count++;
            }

        }

       */

        for (String each : students.keySet()) {

            Integer eachScore=students.get(each);
            if (eachScore>=95){
                count++;
            }
        }

        System.out.println(count);
        System.out.println("------------------------------");


       // students.entrySet().removeIf(each-> each.getValue()<95);

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            //System.out.println(entry);
            System.out.println(entry.getKey() +" : " +entry.getValue());
        }



    }

}
