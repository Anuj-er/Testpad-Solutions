class Customer {
    private int ID;
    private String name;
    private int discount;
    public Customer(int ID, String name, int discount) {
        this.ID = ID;
        this.name = name;
        this.discount = discount;
    }
    public int getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public int getDiscount() {
        return discount;
    }
    public void setDiscount(int discount) {
        this.discount = discount;
    }
    @Override
    public String toString() {
        return name + "(" + ID + ")";
    }
}
class Bill {
    private int ID;
    private Customer customer;
    private double amount;
    public Bill(int ID, Customer customer, double amount) {
        this.ID = ID;
        this.customer = customer;
        this.amount = amount;
    }
    public int getID() {
        return ID;
    }
    public Customer getCustomer() {
        return customer;
    }
    public double getAmount() {
        return amount;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public int getCustomerID() {
        return customer.getID();
    }
    public String getCustomerName() {
        return customer.getName();
    }
    public int getCustomerDiscount() {
        return customer.getDiscount();
    }
    public double getFinalAmt() {
        return amount - (amount * customer.getDiscount() / 100);
    }
}
