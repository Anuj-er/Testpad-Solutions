class Book : public Publication
{
private:
    int pages;
    string author;

public:
    Book(string t, int p, int pg, string a) {
        title = t;
        price = p;
        pages = pg;
        author = a;
    }

    void putdata() const {
        cout << "Book Title \"" << title << "\", written by \"" << author 
             << "\" has " << pages << " pages and of " << price << " rupees." << endl;
    }
};

class CD : public Publication
{
private:
    int playingTime;

public:
    CD(string t, int p, int pt) {
        title = t;
        price = p;
        playingTime = pt;
    }

    void putdata() const {
        cout << "CD Title \"" << title << "\", is of " << playingTime 
             << " minutes length and of " << price << " rupees." << endl;
    }
};