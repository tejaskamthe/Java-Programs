public class Person {
    private String name;
    private int age;

    // Constructor with two parameters
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Main method to create a Person object
    public static void main(String[] args) {
        // Create a Person object using the constructor
        Person person = new Person("John", 30);
        
        // Print the values of the Person object's fields
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
