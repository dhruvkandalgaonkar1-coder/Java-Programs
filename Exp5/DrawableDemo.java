package Exp5;
import java.util.Scanner;

interface MyDrawable {
    void draw();
}

interface MyPrintable {
    void print();
}

class MyDocument implements MyDrawable, MyPrintable {

    String documentName;

    void inputDocument(Scanner sc) {
        System.out.print("Enter document name: ");
        documentName = sc.nextLine();
    }

    public void draw() {
        System.out.println("Drawing: " + documentName);
    }

    public void print() {
        System.out.println("Printing: " + documentName);
    }
}

public class DrawableDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MyDocument doc = new MyDocument();

        doc.inputDocument(sc);
        doc.draw();
        doc.print();

        sc.close();
    }
}