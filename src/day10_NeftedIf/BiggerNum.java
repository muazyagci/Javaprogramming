package day10_NeftedIf;

public class BiggerNum {
    public static void main(String[] args) {

        int n1=4,n2=5,n3=2;

        String result=(n1>n2&&n1>n3)?"n1 is the biggest":(n2>n1&&n2>n3)?"n2 is the biggest": "n3 is the biggest";

        System.out.println(result);
    }
}// && one of it should be true to get true result, it is looking for a false at all cost but || is ok with just one true.
