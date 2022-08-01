package day28_Arraylist;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(numbers);
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i,numbers.get(i)*2);//get method = char at method but arraylist version
        }
        System.out.println(numbers);

        ArrayList<String> employees=new ArrayList<>();

        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Hulya");
        employees.add("Kaloyan");
        employees.add("Suat");
        System.out.println(employees);

        employees.remove(2);
        System.out.println(employees);
        employees.remove(2);
        System.out.println(employees);
        employees.remove(2);
        System.out.println(employees);
        employees.remove(employees.size()-1);
        System.out.println(employees);
        employees.add("Suat");
employees.remove("Suat");
        System.out.println(employees);

    }
}
