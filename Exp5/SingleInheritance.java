package Exp5;
class Book {
    String author, title, publisher;

    Book(String a, String t, String p) {
        author = a;
        title = t;
        publisher = p;
    }
}

class BookInfo extends Book {
    double price;
    int stockPosition;

    BookInfo(String a, String t, String p, double pr, int sp) {
        super(a, t, p);
        price = pr;
        stockPosition = sp;
    }

    void show() {
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Publisher: " + publisher);
        System.out.println("Price: " + price);
        System.out.println("Stock Position: " + stockPosition);
        System.out.println();
    }
}

public class SingleInheritance {
    public static void main(String[] args) {

        BookInfo b1 = new BookInfo("James", "Java Basics", "ABC", 500, 20);
        BookInfo b2 = new BookInfo("Dennis", "C Programming", "XYZ", 450, 15);
        BookInfo b3 = new BookInfo("Robert", "Data Strauctures", "PQR", 600, 10);

        b1.show();
        b2.show();
        b3.show();
    }
} 