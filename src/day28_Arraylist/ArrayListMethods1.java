package day28_Arraylist;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);//0
        numbers.add(20);//1
        numbers.add(30);//3
        numbers.add(40);//4
        numbers.add(50);//6
        numbers.add(60);//7

        numbers.add(1, 15);//overloaded method //2
        numbers.add(numbers.toArray().length - 1, 45);//5
        System.out.println(numbers);


        System.out.println(numbers.size());

        int lastIndex = numbers.size() - 1;

        System.out.println(lastIndex);

        Integer num = numbers.get(3);
        System.out.println(num);

        System.out.println("---------------------------");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i)+" ");
        }
        System.out.println();
        System.out.println("-------------------");

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

list.set(2,"JavaScript");//set method replaces the given element to the given index number
list.set(3,"C++");

        System.out.println(list);

    }
}
