package Day07_Operators;

public class Casting {
    public static void main(String[] args) {
        float avarageScore=20.5f;
        byte num1;
                short num2;
                        int num3 ;
                                long num4;
                                        float num5;
                                                double num6;

                                                num1=(byte)avarageScore;
                                                num2=(short)avarageScore;
num3=(int) avarageScore;
    num4=(long)avarageScore;
          num5=avarageScore;
          num6=avarageScore;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);
//Implicit casting is putting small variable to a large variable
        //explicit is the opposite




    }
}
