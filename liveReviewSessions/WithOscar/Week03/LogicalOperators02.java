package WithOscar.Week03;

public class LogicalOperators02 {
    public static void main(String[] args) {
        int b=2;
        boolean res=++b==2|| --b==2&&--b==2;
        //boolean res=++b==2||--b==2&&--b==2;
//                  false   true    false
        System.out.println("res = " + res);//false
        System.out.println("b = " + b);//1
// !!!!!!!!!!   i should check every time that if the variable haven't been assigned to a new value it has the value of the past!!!!!!!!!!!!








    }
}
