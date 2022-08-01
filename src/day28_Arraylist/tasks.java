package day28_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class tasks {
    public static void main(String[] args) {
        ArrayList<Integer> num1 = new ArrayList<>();
        num1.addAll(Arrays.asList(1, 2, 3, 4, 5));

        num1.set(num1.size() - 1, 0);
        System.out.println(num1);
        System.out.println("*----------------------------------------*");
        ArrayList<Integer> num2 = new ArrayList<>();
        num2.addAll(Arrays.asList(1, 2, 3, 4, 5));
        int last = num2.get(num2.size() - 1), first = num2.get(0);

        num2.set(0, last);
        num2.set(num2.size() - 1, first);
        System.out.println(num2);
        System.out.println("*----------------------------------------*");
        ArrayList<Integer> num3 = new ArrayList<>();
        num3.addAll(Arrays.asList(1, 2, 3, 4, 5));

        for (int i = 0; i < num3.size(); i++) {
            if (num3.get(i) % 2 != 0) {
                num3.set(i, num3.get(i) * 2);
            }

        }
        System.out.println(num3);
        System.out.println("*----------------------------------------*");
        ArrayList<String> list=new ArrayList<>();
        String[] arr1={"A", "B", "C"};
        String[] arr2={"D", "E", "F", "G"};
        /*for (int i = 0; i < arr1.length ; i++) {
            list.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length ; i++) {
            list.add(arr2[i]);
        }

         */
        int b=0;
        for (int i = 0; i < arr1.length+ arr2.length ; i++) {
            if (i< arr1.length){
                list.add(arr1[i]);
            }else {

                list.add(arr2[b]);
                b++;
            }
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(list);
        System.out.println("*----------------------------------------*");
        ArrayList<Integer> num5=new ArrayList<>();
        num5.addAll(Arrays.asList(1,2,3,4,5));
        int max =0;
        for (Integer integer : num5) {
            if (integer> max){
                max =integer;
            }

        }
        System.out.println(max);
        System.out.println("*----------------------------------------*");
        int min=Integer.MAX_VALUE;
        for (Integer integer : num5) {
            if (integer< min){
                min =integer;
            }

        }
        System.out.println(min);
        System.out.println("*----------------------------------------*");
        ArrayList<Integer>num6=new ArrayList<>();
        num6.addAll(Arrays.asList(1,2,2,3,4,4,5,6,7,7));
        int result=0;
        for (Integer integer : num6) {
            if (num6.indexOf(integer)!=num6.lastIndexOf(integer)){
                result=integer;
                break;
            }
        }
        System.out.println(result);
        System.out.println("*----------------------------------------*");
        ArrayList<Integer>  scores = new ArrayList<>();
       int gradersA=0,gradersB=0,gradersC=0,gradersD=0,gradersF=0;
        scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));
        for (Integer each : scores) {
            if (each>=90&&each<=100){
                gradersA++;
            } else if (each>=80&&each<=89) {
                gradersB++;
            } else if (each>=70&&each<=79) {
                gradersC++;
            } else if (each>=60&&each<=69) {
                gradersD++;
            } else{
                gradersF++;


            }
        }
        System.out.println("gradersA = " + gradersA);
        System.out.println("gradersB = " + gradersB);
        System.out.println("gradersC = " + gradersC);
        System.out.println("gradersD = " + gradersD);
        System.out.println("gradersF = " + gradersF);


    }
}
