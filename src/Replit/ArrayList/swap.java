package Replit.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class swap {
    public static ArrayList<String> swap(ArrayList<String> list, int pos1, int pos2) {
        String pos1_1=list.get(pos1);
        String pos2_1=list.get(pos2);
list.set(pos1,pos2_1);
list.set(pos2,pos1_1);




return  list;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int pos1 = in.nextInt();
        int pos2 = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.next());
        }

        System.out.println(swap(list, pos1, pos2));

    }
}
