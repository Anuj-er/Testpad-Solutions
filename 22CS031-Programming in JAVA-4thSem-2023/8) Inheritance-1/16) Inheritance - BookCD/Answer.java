class Book extends Publication {
    private int pages;
    private String author;
    public Book(String title, int price, int pages, String author) {
        this.title = title; // Directly set the title
        this.price = price; // Directly set the price
        this.pages = pages;
        this.author = author;
    }
    public void putdata() {
        System.out.println("Book Title \"" + title + "\", written by \"" + author + 
                           "\" has " + pages + " pages and of " + price + " rupees.");
    }
}
class CD extends Publication {
    private int playingTime;
    public CD(String title, int price, int playingTime) {
        this.title = title; // Directly set the title
        this.price = price; // Directly set the price
        this.playingTime = playingTime;
    }
    public void putdata() {
        System.out.println("CD Title \"" + title + "\", is of " + playingTime + 
                           " minutes length and of " + price + " rupees.");
    }
}