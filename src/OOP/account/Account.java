package OOP.account;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private String dateCreated;

    public Account() {
        this.id = 1122;
        this.balance = 20000;
        this.annualInterestRate = 0.045;
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        this.dateCreated = df.format(date);
    }

    public Account(int id, double balance, double annualInterestRate, String dateCreated) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = dateCreated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public double getMonthlyInterestRate() {
        return this.annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance * annualInterestRate / 12;
    }

    public String withdraw(double tienRut){
        if (balance < tienRut) return "Thất bại";
        else {
            balance = balance - tienRut;
            return "Thành công";
        }
    }
    public String deposit(double tienGui){
        balance = balance + tienGui;
        return "Thành công";
    }

}
