package day51_map;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice3 {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 145000);
        map.put("Conor", 85000);
        map.put("Josh", 145000);
        map.put("Cory", 145000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);
/*


        for (Integer each:map.values()) {
            if (each>maxSalary){
                maxSalary=each;
            }

        }
*/

        int maxSalary= Collections.max(map.values());
        System.out.println(maxSalary);


        for (Map.Entry<String, Integer> each : map.entrySet()) {
            if (each.getValue()==maxSalary){
                System.out.println(each.getKey());
            }
        }



    }
}
