package day25_CustomMethod_Overloading;

public class task2 {
    public static void main(String[] args) {
int [] maxNumber={10,20,50,60,70};


    }
    public static int maxNumber(int[] num){
        int maxNumber=0;
        for (int i : num) {
            if (num[i]>maxNumber){
                maxNumber=num[i];
            }

        }
        return maxNumber;


    }

}
