package Exp5;
import java.util.Scanner;

class MyPerson {
    String name;
    int age;

    void inputPerson(Scanner sc) {
        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter age: ");
        age = sc.nextInt();
        sc.nextLine();
    }

    void walk() {
        System.out.println(name + " is running.");
    }
}

class MyStudent extends MyPerson {
    
}

interface MySport {
    void play();
}

class MySportStudent extends MyStudent implements MySport {

    String sportName;

    void inputSportStudent(Scanner sc) {
        inputPerson(sc);

        System.out.print("Enter sport: ");
        sportName = sc.nextLine();
    }

    public void play() {
        System.out.println(name + " is playing " + sportName + ".");
    }

    void display() {
        System.out.println("\nSport Student Details");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Sport: " + sportName);
    }
}

public class SportStudentDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MySportStudent s = new MySportStudent();

        s.inputSportStudent(sc);
        s.display();
        s.walk();
        s.play();

        sc.close();
    }
}