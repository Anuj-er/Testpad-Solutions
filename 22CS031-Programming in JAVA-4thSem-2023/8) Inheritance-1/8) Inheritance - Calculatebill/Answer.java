import java.util.Scanner;
class Bill {
    protected int itemPrice;
    protected int quantity;
    protected int totalBill;
    public void calculateBill() {
        totalBill = itemPrice * quantity;
    }
    public void setItemPrice(int price) {
        this.itemPrice = price;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getTotalBill() {
        return totalBill;
    }
}
class Cash extends Bill {
    private int notes2000;
    private int notes500;
    private int notes100;
    private int notes50;
    private int notes10;
    private int totalCash;
    void get_cash() {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int quantity = sc.nextInt();
        setItemPrice(price);
        setQuantity(quantity);
        calculateBill();
        notes2000 = sc.nextInt();
        notes500 = sc.nextInt();
        notes100 = sc.nextInt();
        notes50 = sc.nextInt();
        notes10 = sc.nextInt();
        totalCash = (notes2000 * 2000) + (notes500 * 500) + (notes100 * 100) +
                    (notes50 * 50) + (notes10 * 10);
    }
    void display() {
        int amountDue = getTotalBill() - totalCash;
        if (amountDue <= 0) {
            System.out.println("Clear");
        } else {
            System.out.println("Need to pay: " + amountDue);
        }
    }
}