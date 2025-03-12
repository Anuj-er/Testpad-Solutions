import java.util.Scanner;

class Writer {
    private String name;
    private String email;
    private char gender;

    public Writer(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Writer[name=" + name + ",email=" + email + ",gender=" + gender + "]";
    }
}

class Book {
    private String name;
    private Writer writer;
    private double price;
    private int qty;

    public Book(String name, Writer writer, double price) {
        this.name = name;
        this.writer = writer;
        this.price = price;
        this.qty = 0;
    }

    public Book(String name, Writer writer, double price, int qty) {
        this.name = name;
        this.writer = writer;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book[name=" + name + "," + writer.toString() + ",price=" + price + ",qty=" + qty ;
    }
}
