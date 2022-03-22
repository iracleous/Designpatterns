package gr.codehub.designpatterns.builder;

public class BankCustomer {
    private int id;
    private String firstName;
    private String lastName;
    private double salary;

    public int getId() {
        return id;
    }

    public BankCustomer setId(int id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public BankCustomer setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public BankCustomer setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public double getSalary() {
        return salary;
    }

    public BankCustomer setSalary(double salary) {
        this.salary = salary;
        return this;
    }
}
