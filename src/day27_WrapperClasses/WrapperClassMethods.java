package day27_WrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String str = "123";

        int num1 = Integer.parseInt(str);//int
        System.out.println(num1 + 1);//124

        System.out.println(str + 1);//1231

        String str2 = "10.5";

        Double d1 = Double.parseDouble(str2);

        System.out.println(d1);


        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("----------------------");
        long maxLong=Long.MAX_VALUE;
        long minLong=Long.MIN_VALUE;
        System.out.println("maxLong = " + maxLong);
        System.out.println("maxLong = " + minLong);

        String s1="true";
       boolean b1= Boolean.parseBoolean(s1);
        System.out.println(b1);

        System.out.println("------------------------------");

    String s2="123";
    Integer x=Integer.valueOf(s2);
    int y=Integer.valueOf(s2);

        System.out.println(x);
        System.out.println(y);


   String s3="1.5";
  Double z= Double.valueOf(s3);
        System.out.println(z);
        System.out.println("----------------------");

//isDigit()
        char ch1='a';
        System.out.println(ch1);
        System.out.println(Character.isDigit(ch1));

        System.out.println(Character.isLetter(ch1));

      boolean r4=!Character.isLetterOrDigit(ch1);
        System.out.println(r4);
        boolean r5=Character.isUpperCase(ch1);
        boolean r6=Character.isLowerCase(ch1);
        System.out.println(r5);
        System.out.println(r6);
        System.out.println("---------------------");

        String s="ab1cde2efg3hi4";
        
        int sum=0;

        for (char each : s.toCharArray()) {
            if (Character.isDigit(each)){
                sum+=Integer.parseInt(""+each);
            }
        }
        System.out.println(sum);
    }
}
