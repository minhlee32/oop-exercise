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

    void setAnnualInterestRate(double annualInterestRate) {

        this.annualInterestRate = annualInterestRate;
    }

    public void setBalance(double balance) {

        this.balance = balance;
    }

    public void setId(int id) {

        this.id = id;
    }

    private double getMontlyInterestRate() {
        return (annualInterestRate / 12) / 100;
    }

    public double getMontlyInterest() {
        return balance * getMontlyInterestRate();
    }

    void withdraw(double money) {
        balance -= money;
    }

    public double deposit(double money) {
        balance += money;
        return money;
    }
}
