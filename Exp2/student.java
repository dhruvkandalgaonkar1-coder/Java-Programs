package Exp2;
class Student
{
    String name;
    int rollNo;
    String dept;

    Student()
    {
        name = "Dhruv";
        rollNo = 11;
        dept = "CS";
    }

    Student(String n, int r, String d)
    {
        name = n;
        rollNo = r;
        dept = d;
    }

    Student(Student s)
    {
        name = s.name;
        rollNo = s.rollNo;
        dept = s.dept;
    }

    void display()
    {
        System.out.println("Name = " + name);
        System.out.println("Roll No = " + rollNo);
        System.out.println("Department = " + dept);
        System.out.println();
    }

    public static void main(String args[])
    {
        Student s1 = new Student();
        Student s2 = new Student("Rahul", 101, "IT");
        Student s3 = new Student(s2);

        s1.display();
        s2.display();
        s3.display();
    }
} 