package day51_map;

import java.util.*;

public class MapPractice1 {
    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

        //  1. Update the "M" to Male and "F" to Female

      /*  for (String each : employeeMap.keySet()) {
            if (employeeMap.get(each).equalsIgnoreCase("m")) {
               employeeMap.replace(each,"Male");
            }


            if (employeeMap.get(each).equalsIgnoreCase("f")){
                employeeMap.replace(each,"Female");
            }
        }
*/


        for (Map.Entry<String, String> entry : employeeMap.entrySet()) {
            if (entry.getValue().equalsIgnoreCase("m")){
                entry.setValue("Male");
            }

            if (entry.getValue().equalsIgnoreCase("f")){
                entry.setValue("Female");
            }
        }



        System.out.println(employeeMap);
        System.out.println("*---------------------------------------*");

        for (Map.Entry<String, String> eachPair : employeeMap.entrySet()) {
            String eachKey=eachPair.getKey();
            String eachValue=eachPair.getValue();
            if (eachValue.equals("Female")) {
                System.out.println(eachPair);
            }


            }


    }

}
