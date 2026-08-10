interface FY {
    void getFYData();
}

interface SY {
    void getSYData();
}

class Student implements FY, SY {

    int rollNo;
    String name;
    String fyResult;
    String syResult;

    public void getFYData() {
        rollNo = 101;
        name = "Rahul";
        fyResult = "Pass";
    }

    public void getSYData() {
        syResult = "First Class";
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("FY Result: " + fyResult);
        System.out.println("SY Result: " + syResult);
    }

    public static void main(String[] args) {
        Student s = new Student();

        s.getFYData();
        s.getSYData();

        s.display();
    }
}