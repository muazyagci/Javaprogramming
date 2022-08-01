package WithOscar.Week07;

public class TaskNestedLoop02 {
    public static void main(String[] args) {
        for (int i = 1; i <=6 ; i++) {
            for (int j = 1; j<=i ; j++) {//column number is dependent on row number
                if (j%2==1){
                    System.out.print(1);
                }else {
                    System.out.print(0);
                }


            }
            System.out.println();
        }
        for (int i = 6; i >=1 ; i--) {
            for (int j = 1; j<=i ; j++) {//column number is dependent on row number
                if (j%2==1){
                    System.out.print(1);
                }else {
                    System.out.print(0);
                }


            }
            System.out.println();
        }
    }
}
