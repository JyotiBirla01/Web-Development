

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class Transactions {

    private String description;
    private double amount;
    private double leftBalance;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy   HH:mm:ss");
    LocalDateTime transactionDateTime = null;

    public Transactions() {
    }

    public Transactions(String description, double amount, double leftBalance, LocalDateTime dateTime) {
        this.description = description;
        this.amount = amount;
        this.leftBalance = leftBalance;
        this.transactionDateTime = dateTime;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLeftBalance(double leftBalance) {
        this.leftBalance = leftBalance;
    }

    public void setTransactionDateTime(LocalDateTime transactionDateTime) {
        this.transactionDateTime = transactionDateTime;
    }

    public LocalDateTime getTransactionDateTime() {
        return transactionDateTime;
    }

    public void setDtf(DateTimeFormatter dtf) {
        this.dtf = dtf;
    }

    public DateTimeFormatter getDtf() {
        return dtf;
    }

    // public String getTimestamp() {
    // SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    // Date date = new Date();
    // return dateFormat.format(date);
    // }
    public double getLeftBalance() {
        return leftBalance;
    }
}
