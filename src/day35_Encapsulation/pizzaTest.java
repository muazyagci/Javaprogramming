package day35_Encapsulation;

import day35_Encapsulation.Pizza;



public class pizzaTest {

    public static void main(String[] args) {

        Pizza order1=new Pizza();
       order1.setSize("medium");
       order1.setNumberOfCheeseToping(5);
        System.out.println(order1.getNumberOfCheeseToping());

    }
}
