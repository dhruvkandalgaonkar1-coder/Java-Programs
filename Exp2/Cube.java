package Exp2;
class Cube {
    double length, breadth, height;
    Cube(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }
    void displayVolume() {
        double volume = length * breadth * height;
        System.out.println("Length : " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Height : " + height);
        System.out.println("Volume : " + volume);
        System.out.println();
    }
    public static void main(String[] args) {
        Cube c1 = new Cube(2, 3, 4);
        Cube c2 = new Cube(5, 6, 7); 

        Cube c3 = new Cube(8, 9, 10);

        System.out.println("Cube 1");
        c1.displayVolume();

        System.out.println("Cube 2");
        c2.displayVolume();

        System.out.println("Cube 3");
        c3.displayVolume();
    }
}