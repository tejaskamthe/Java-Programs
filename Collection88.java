import java.util.*;

public class Collection88 implements Comparable<Collection88> {
    private String name;
    private int age;

    public Collection88(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Collection88 other) {
        return Integer.compare(other.age, this.age);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

    public static void main(String[] args) {
        Set<Collection88> customers = new TreeSet<>();

        // Add customers to the set
        customers.add(new Collection88("Alice", 25));
        customers.add(new Collection88("Bob", 35));
        customers.add(new Collection88("Charlie", 30));
        customers.add(new Collection88("Dave", 20));
        customers.add(new Collection88("Eve", 40));

        // Print the customers in descending order
        for (Collection88 customer : customers) {
            System.out.println(customer);
        }
    }
}
