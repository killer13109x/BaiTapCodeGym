package OOP.account;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    public static void main(String[] args) {
        Account ac = new Account();
        System.out.println(ac.getBalance());
        System.out.println(ac.getDateCreated());
        System.out.println(ac.getMonthlyInterest());
        System.out.println(ac.withdraw(25000));
        System.out.println(ac.deposit(3000));
        System.out.println(ac.getBalance());



    }

}