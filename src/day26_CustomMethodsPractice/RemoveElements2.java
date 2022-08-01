package day26_CustomMethodsPractice;

import Utilities.ArraysUtility;

public class RemoveElements2 {
    public static void main(String[] args) {

    }


    public static int[] removeElement(int[] array,int index){
int[] result={};

        for (int i = 0; i < array.length ; i++) {
            if (i!=index){
                result=ArraysUtility.addElement(result,array[i]);
            }
        }
        return result;
        
    }
}
