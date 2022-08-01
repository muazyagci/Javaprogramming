package day28_Arraylist;

import java.util.ArrayList;

public class RemoveDublicates {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(30);

        ArrayList<Integer> result = new ArrayList<>();
        for (Integer integer : list) {
            if (!result.contains(integer)) {
                result.add(integer);
            }
        }
        System.out.println(result);
    }
}
