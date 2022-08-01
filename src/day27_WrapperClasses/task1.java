package day27_WrapperClasses;

import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
     /* for (int i = 0; i >= array.length-1; i++) {

            if (i==index){
                result[i]=element;

            }else {
                result[i]=array[i];
            }

        }
        System.out.println(Arrays.toString(result));

        */
        int[] arr1=new int[5];
        int[] array = {1, 2, 4, 5, 6};
        // array=insert(array,2,3);
        System.out.println(Arrays.toString(array));
        int index = 2, element = 3;
        int[] result = new int[array.length + 1];
        int x = 0;
        for (int i = 0; i < array.length + 1; i++, x++) {
           /* x++;
            if (array[i]==2){
                result[i]=array[i];
                result[i+1]=element;
                i++;
            }else {
                result[i]=array[x];
            }

            */
            if (i == index) {
                result[i] = element;
                i++;
                result[i] = array[x];
            } else {
                result[i] = array[x];
            }
        }
        System.out.println(Arrays.toString(result));



    }

    public static int[] insert(int[] array, int index, int element) {
        int[] result = new int[array.length + 1];
        int x = 0;
        for (int i = 0; i < array.length + 1; i++, x++) {
           /* x++;
            if (array[i]==2){
                result[i]=array[i];
                result[i+1]=element;
                i++;
            }else {
                result[i]=array[x];
            }

            */
            if (i == index) {
                result[i] = element;
                i++;
                result[i] = array[x];
            } else {
                result[i] = array[x];
            }
        }


        return result;
    }
}
