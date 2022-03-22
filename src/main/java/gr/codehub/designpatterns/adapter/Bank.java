package gr.codehub.designpatterns.adapter;

public interface Bank {

    double getBalance();
    boolean withdraw(double amount);
    boolean deposit(double deposit);
}
