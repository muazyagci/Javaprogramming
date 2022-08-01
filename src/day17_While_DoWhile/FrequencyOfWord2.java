package day17_While_DoWhile;

public class FrequencyOfWord2 {
    public static void main(String[] args) {
        String str = "Cat Dog Cat Dog Cat cat CAt cAt";
        int frequency = 0;
        for (int i = 0; i <=str.length()-3 ; i++) {
            String eachsub=str.substring(i,i+3);
            if (eachsub.equalsIgnoreCase("Cat")){
                frequency++;
            }
        }
        System.out.println("frequency = " + frequency);

    }
}
