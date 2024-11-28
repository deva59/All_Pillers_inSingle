package Oops_Concept_all;

// Abstract class (Abstraction)
abstract class Bank {
    private String accountNumber; // Encapsulation
    private double balance;

    // Encapsulated getter and setter for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter and Setter for balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    // Abstract methods
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}

// Derived class (Inheritance and Polymorphism)
class Customer extends Bank {
    private String customerName;

    // Constructor
    public Customer(String customerName, String accountNumber, double initialBalance) {
        this.customerName = customerName;
        setAccountNumber(accountNumber);
        setBalance(initialBalance);
    }

    // Getter for customer name
    public String getCustomerName() {
        return customerName;
    }

    // Overriding deposit method (Polymorphism)
    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposit successful. New balance: " + getBalance());
    }

    // Overriding withdraw method (Polymorphism)
    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal successful. New balance: " + getBalance());
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}
public class BankSystem {
    public static void main(String[] args) {
        // Creating a Customer object (Inheritance)
        Customer customer = new Customer("John Doe", "123456789", 1000.0);

        // Accessing encapsulated data through methods
        System.out.println("Customer Name: " + customer.getCustomerName());
        System.out.println("Account Number: " + customer.getAccountNumber());

        // Performing operations (Abstraction and Polymorphism)
        customer.deposit(500.0);
        customer.withdraw(300.0);
        customer.withdraw(1500.0); // Insufficient balance
    }
}
