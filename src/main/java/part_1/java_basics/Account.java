package part_1.java_basics;

public class Account {

    private double balance;

    public void withdraw(double amount) {
        if (amount > 0)
            balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    //    public void setBalance(double balance) {
//        if (balance > 0)
//            this.balance = balance;
//    }

    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }
}
