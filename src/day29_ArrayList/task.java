package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class task {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,4,5,6,7,7,8,8));
        int n=5;

       /* for (int i = 1; i < n; i++) {
            num.remove(Collections.max(num));
        }
        int max=Collections.max(num);
        System.out.println(max);

        */
        for (int i = 1; i < n; i++) {
            list.removeIf( p -> Collections.max(list) == p);
        }

        int max = Collections.max(list);

        System.out.println(max);


    }
}
