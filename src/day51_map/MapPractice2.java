package day51_map;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);

       /* int maxSalary=0;
        for (Integer each : map.values()) {
            if (each>maxSalary){
                maxSalary=each;
            }
        }

        System.out.println(maxSalary);

        */
        String name1="";

        int maxSalary=Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> each : map.entrySet()) {
            String eachKey= each.getKey();
            if (each.getValue()>maxSalary){
                maxSalary=each.getValue();
                name1=eachKey;
            }
        }

        System.out.println(name1+" has max salary: "+maxSalary);

String name2="";

int minSalary= Collections.min(map.values());

      /*  for (Map.Entry<String, Integer> each : map.entrySet()) {
            if (each.getValue()<minSalary){
                minSalary= each.getValue();
                name2=each.getKey();
            }
        }

       */

        for (Map.Entry<String, Integer> each : map.entrySet()) {

            if (each.getValue()==minSalary){
                name2=each.getKey();
            }

        }
        System.out.println("----------------------");

        for (Map.Entry<String, Integer> each : map.entrySet()) {
            if (each.getValue()>=120000&&each.getValue()<=150000){
                System.out.println(each.getKey());
            }
        }

    }
}
