package day50_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class iterablePractice {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5));

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)<4){
                list.remove(i);
            }

        }

    }
}
