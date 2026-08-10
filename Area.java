class Area
{
    double length, breadth;

    Area()
    {
        length = 5;
        breadth = 4;
    }

    Area(double l, double b)
    {
        length = l;
        breadth = b;
    }

    Area(Area a)
    {
        length = a.length;
        breadth = a.breadth;
    }

    void display()
    {
        double area = length * breadth;

        System.out.println("Length = " + length);
        System.out.println("Breadth = " + breadth);
        System.out.println("Area = " + area);
        System.out.println();
    }

    public static void main(String args[])
    {
        Area a1 = new Area();
        Area a2 = new Area(8, 5);
        Area a3 = new Area(a2);

        a1.display();
        a2.display();
        a3.display();
    }
}