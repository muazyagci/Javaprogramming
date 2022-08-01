package day21ForEachLoop;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class ArraysUtiliy2 {
    public static void main(String[] args) {
        String[] student = {"Elif", "Sinem", "Gunay", "Cihad", "David", "James", "Aaron", "Daniel"};

        String[] earlyBirds = Arrays.copyOf(student, 3);

        System.out.println(Arrays.toString(earlyBirds));

int[]numbers={1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(numbers));
numbers=Arrays.copyOf(numbers,5);

        System.out.println(Arrays.toString(numbers));

        



    }
}
