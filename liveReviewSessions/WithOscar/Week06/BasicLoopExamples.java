package WithOscar.Week06;

public class BasicLoopExamples {
    public static void main(String[] args) {

        //iterate 10 by 10
        for (int i = 0; i <= 1000; i += 10) {

            if (i < 1000) {
                System.out.print(i + ",");
            } else
                System.out.print(i);
        }
        System.out.println("------------------------");
        int x = 0;//Initialization
        for (; x <= 100; ) {// condition
            if (x % 100 == 0) {
                System.out.println(x + " ");
            }
            x++;//iteration
        }
        System.out.println(x);// our iterated variable means "x" is not local anymore

        System.out.println();
        System.out.println("--------------------");

        boolean check = true;

        for (int i=0; check; i+=10){
           if (i>=1000){
               check=false;
           }
            System.out.print(i+" ");

        }

    }
}
