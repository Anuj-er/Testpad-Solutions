#include<iostream>
using namespace std;
class Bill {
protected:
    int item_price;
    int qty;
    int total_bill;
public:
    void calculate_bill() {
        total_bill = item_price * qty;
    }
    void set_item_price(int price) {
        item_price = price;
    }
    void set_quantity(int quantity) {
        qty = quantity;
    }
    int get_total_bill() {
        return total_bill;
    }
};
class Cash : public Bill {
private:
    int notes_2000;
    int notes_500;
    int notes_100;
    int notes_50;
    int notes_10;
    int total_cash;
public:
    void get_cash() {
        int price, quantity;
        cin >> price;
        cin >> quantity;
        set_item_price(price);
        set_quantity(quantity);
        calculate_bill();
        cin >> notes_2000;
        cin >> notes_500;
        cin >> notes_100;
        cin >> notes_50;
        cin >> notes_10;
        total_cash = (notes_2000 * 2000) + (notes_500 * 500) + (notes_100 * 100) +
                     (notes_50 * 50) + (notes_10 * 10);
    }
    void display() {
        int amount_due = get_total_bill() - total_cash;
        if (amount_due <= 0) {
            cout << "Clear" << endl;
        } else {
            cout << "Need to pay: " << amount_due << endl;
        }
    }
};