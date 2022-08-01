package day31_Constructers;

public class CapitalOne {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();


        account1.setInfo("Muaz Yagci", 987456321789l);
        account1.deposit(20000);
        account1.checkBalance();

        account1.withdraw(900);
        account1.checkBalance();
        account1.deposit(20000);
account1.checkBalance();
        BankAccount account2 = new BankAccount();
account1.setInfo("Ayse",321456987654l);

account2.deposit(1000);
account2.checkBalance();


    }
}
