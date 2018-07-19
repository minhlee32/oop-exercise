package account;

import account.Account;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(0.045);
        account.withdraw(2500);
        account.deposit(3000);
        Date now = new Date();
        account.setDateCreated(now);
        System.out.printf("Current balance is %.2f \nThe interest rate of this month is %.2f", account.getBalance(), account.getMontlyInterest());
        System.out.println("\nYour account is created on "+ account.getDateCreated());
    }
}