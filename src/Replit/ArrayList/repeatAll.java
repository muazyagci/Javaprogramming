package Replit.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class repeatAll {
    //create your method below
public static ArrayList<Boolean> repeatAll(ArrayList<Boolean>list){

    for (int i=0;i< list.size();i++) {
        list.add(list.get(i));

    }


    return list;
}






    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Boolean> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextBoolean());
        }

        System.out.println(repeatAll(list));

    }

}
