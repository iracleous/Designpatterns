package gr.codehub.designpatterns.adapter;

public class DimitrisBank implements Bank{

    private double amount;

    public DimitrisBank(double amount) {
        this.amount = amount;
    }

    @Override
    public double getBalance() {
        return amount;
    }

    @Override
    public boolean withdraw(double amount) {
        this.amount -= amount;
        return true;
    }

    @Override
    public boolean deposit(double deposit) {
        this.amount += amount;
        return true;
    }
}
