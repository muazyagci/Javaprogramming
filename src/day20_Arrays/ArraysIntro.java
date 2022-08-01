package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args){

        //create a variable that's capable enough to contain 5 names
    String []myGroups=new String[5];
        myGroups[0]="Gunay";
        myGroups[1]="Neira";
        myGroups[2]="Suat";
        myGroups[3]="Hulya";
        myGroups[4]="Mikhael";


        //System.out.println(myGroups);//hashcode
        System.out.println(Arrays.toString(myGroups));//["Gunay", "Neira", "Suat", "Hulya", "Mikhael"]
        for (int i = 0; i <5 ; i++) {
            System.out.println("Hello and Welcome "+myGroups[i]);
        }
        System.out.println();
        System.out.println("--------------------------------------------------------------");
String [] days={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday", "Sunday"};

        System.out.println(Arrays.toString(days));

        int number=1;

        if (number<1||number>7){
            System.err.println("Invalid number");
        System.exit(0);

        }
        System.out.println();

        System.out.println(days[number]);




}

    }

