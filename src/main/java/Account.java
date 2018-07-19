import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;

    public Account() {

    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getAnnualInterestRate() {

        return annualInterestRate;
    }

    public double getBalance() {

        return balance;
    }

    public int getId() {

        return id;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setAnnualInterestRate(double annualInterestRate) {

        this.annualInterestRate = annualInterestRate;
    }

    public void setBalance(double balance) {

        this.balance = balance;
    }

    public void setId(int id) {

        this.id = id;
    }

    public double getMontlyInterestRate() {
        double monthlyInterestRate = (annualInterestRate / 12) / 100;
        return monthlyInterestRate;
    }

    public double getMontlyInterest() {
        double withdraw = balance * getAnnualInterestRate();
        return withdraw;
    }

    public double deposit(double money) {
        balance += money;
        return money;
    }
}
