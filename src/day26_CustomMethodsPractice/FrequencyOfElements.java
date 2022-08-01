package day26_CustomMethodsPractice;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int[] array = {1, 1, 1, 11, 1, 2, 2, 3, 3, 3, 4, 4, 1, 1, 1, 1};
        int element = 1;
        int n = frequencyofElement(array, element);
        System.out.println(n);
    }

    //returns the frequency of the given element from the given array
    public static int frequencyofElement(int[] array, int element) {
        int count = 0;
        for (int i : array) {
            if (i == element) {
                count++;
            }
        }

        return count;
    }

    public static double frequencyofElement(double[] array, double element) {
        double count = 0;
        for (double i : array) {
            if (i == element) {
                count++;
            }
        }

        return count;
    }

    public static char frequencyofElement(char[] array, char element) {
        char count = 0;
        for (char i : array) {
            if (i == element) {
                count++;
            }
        }

        return count;
    }

    public static int frequencyofElement(String[] array, String element) {
        int count = 0;
        for (String i : array) {
            if (i == element) {
                count++;
            }
        }

        return count;
    }



}
