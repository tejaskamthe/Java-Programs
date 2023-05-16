// Student.java
package pack1;

public class Student {
    private String name;
    protected int age;
    String email; // default access modifier
    public int id;

    public Student(String name, int age, String email, int id) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    void setEmail(String email) {
        this.email = email;
    }

    private void setId(int id) {
        this.id = id;
    }
}

// Batch.java
package pack2;

import pack1.Student;

public class Batch {
    public void printStudentInfo() {
        Student student = new Student("John Doe", 20, "johndoe@example.com", 12345);
        System.out.println("Student name: " + student.getName());
        System.out.println("Student age: " + student.age); // accessible because it's protected
        System.out.println("Student email: " + student.email); // accessible because it's default
        // System.out.println("Student id: " + student.id); // not accessible because it's public in pack1
    }
}

// PrintData.java
public class PrintData {
    public static void main(String[] args) {
        Batch batch = new Batch();
        batch.printStudentInfo();
    }
}
