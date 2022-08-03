package day40_FinalKeyword.Daily;

public class account {
    public String userName,passWord;
static String correctUserName="ozgurguler",CorrectPassword="anadoluatesi";


    public void login() {
        boolean a = true;
        while (a) {
            if (userName.equals(correctUserName) && passWord.equals(CorrectPassword)) {
                System.out.println("Logged In");
                a=false;
            }else {
                System.err.println("Wrong password.Try again");
                break;
            }

        }

    }

}
