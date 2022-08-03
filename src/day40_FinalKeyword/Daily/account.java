package day40_FinalKeyword.Daily;

public class account {
    public String userName,passWord;

    public account(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public void login() {
        boolean a = true;
        while (a) {
            if (userName.equals("ozgurguler") && passWord.equals("anadoluatesi")) {
                System.out.println("Logged In");
                a=false;
            }else {
                System.err.println("Wrong password.Try again");
            }

        }

    }

}
