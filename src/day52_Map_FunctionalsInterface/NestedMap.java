package day52_Map_FunctionalsInterface;
import java.util.*;
public class NestedMap {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new LinkedHashMap<>(); // employeeId & jobTitle

        map1.put(11, "SDET");

        map1.put(12, "SM");

        map1.put(13, "BA");

        map1.put(14, "Developer");

        map1.put(15, "PO");

        Map<String,Integer> map2=new LinkedHashMap<>();

        map2.put("Shay",100000);

        map2.put("Hulya",110000);

        map2.put("Veronica",115000);

        map2.put("Ali",150000);

        map2.put("Alex",160000);

Map<Map<Integer,String>,Map<String,Integer>> mapOfMap=new LinkedHashMap<>();

mapOfMap.put(map1,map2);

        for (Map.Entry<Map<Integer, String>, Map<String, Integer>> each : mapOfMap.entrySet()) {

            for (Map.Entry<Integer, String> each2 : each.getKey().entrySet()) {

                System.out.println(each2.getKey());

            }

            for (Map.Entry<Integer, String> each3 : each.getKey().entrySet()) {

                System.out.println(each3.getValue());

            }

        }

        System.out.println("------------------------------------");

        System.out.println(mapOfMap.get(map1).get("Veronica"));

        System.out.println("------------------------------------");



    }
}
