package day17_While_DoWhile;

public class EvenAndOddnumbers {
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {
            if (!(i%2==0)){
                continue;
            }
            System.out.println(i);

        }
        System.out.println();
        for (int i = 1; i <=10 ; i++) {
            if ((i%2==0)){
                continue;
            }
            System.out.println(i);

        }
    }
}
