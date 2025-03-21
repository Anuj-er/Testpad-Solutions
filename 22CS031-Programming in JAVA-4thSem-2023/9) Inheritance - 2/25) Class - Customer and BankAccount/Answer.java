class Customer {
    private int ID;
    private String name;
    private char gender;

    public Customer(int ID, String name, char gender) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return name + "(" + ID + ")";
    }
}
class BankAccount {
    private int ID;
    private Customer customer;
    private double balance;

    public BankAccount(int ID, Customer customer, double balance) {
        this.ID = ID;
        this.customer = customer;
        this.balance = balance;
    }

    public int getID() {
        return ID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amt) {
        balance += amt;
    }

    public void withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    public String toString() {
        return customer.toString() + " balance=INR " + String.format("%.2f", balance);
    }
}
