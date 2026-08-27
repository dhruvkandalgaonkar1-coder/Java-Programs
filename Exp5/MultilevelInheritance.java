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
}

class BookSales extends BookInfo {
    int noOfCopiesSold;

    BookSales(String a, String t, String p,
              double pr, int sp, int copies) {

        super(a, t, p, pr, sp); 
        noOfCopiesSold = copies;
    }

    double revenueGenerated() {
        return price * noOfCopiesSold;
    }

    void allShow() {
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Publisher: " + publisher);
        System.out.println("Price: " + price);
        System.out.println("Stock Position: " + stockPosition);
        System.out.println("Copies Sold: " + noOfCopiesSold);
        System.out.println("Revenue Generated: " + revenueGenerated());
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {

        BookSales b = new BookSales(
                "James",
                "Java Programming",
                "ABC",
                500,
                20,
                50);

        b.allShow();
    }
}