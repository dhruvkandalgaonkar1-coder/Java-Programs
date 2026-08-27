package Exp2;
class Mobile {
    String companyName;
    double screenSize;
    Mobile() {
        companyName = "Unknown";
        screenSize = 0.0;
    }
    Mobile(String companyName, double screenSize) {
        this.companyName = companyName;
        this.screenSize = screenSize;
    }
    void display() {
        System.out.println("Company Name : " + companyName); 
        System.out.println("Screen Size  : " + screenSize + " inches");
        System.out.println();
    }
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile("Samsung", 6.5);
        Mobile m3 = new Mobile("Apple", 6.1);
        Mobile m4 = new Mobile("OnePlus", 6.7);
        Mobile m5 = new Mobile("Xiaomi", 6.8);
        System.out.println("Mobile 1");
        m1.display();
        System.out.println("Mobile 2");
        m2.display();
        System.out.println("Mobile 3");
        m3.display();
        System.out.println("Mobile 4");
        m4.display();
        System.out.println("Mobile 5");
        m5.display();
    }
}