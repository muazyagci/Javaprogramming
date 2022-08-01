package WithOscar.Week13;

public class Login {
    public static void main(String[] args) {
        Credentials user =new Credentials();
        System.out.println("user.email= "+user.email);

//        System.out.println("user.userName= "+user.useName);
//        System.out.println("user.passWord= "+user.password);

        System.out.println("user.= "+user.getUserName("oscar@cydeo.com"));

        System.out.println("user.passWord= "+ user.getPassWord("oscar@cydeo.com","Scolfield"));

        user.setPassWord("newPasswordForOscar");

        System.out.println("user.passWord After Change= "+ user.getPassWord("oscar@cydeo.com","Scolfield"));

    }
}
