import java.util.*;

public class Collection88 implements Comparable<Collection8> {
    private String name;
    private int age;

    public Collection8(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Collection8 other) {
        return Integer.compare(other.age, this.age);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

    public static void main(String[] args) {
        Set<Collection8> customers = new TreeSet<>();

        // Add customers to the set
        customers.add(new Collection8("Alice", 25));
        customers.add(new Collection8("Bob", 35));
        customers.add(new Collection8("Charlie", 30));
        customers.add(new Collection8("Dave", 20));
        customers.add(new Collection8("Eve", 40));

        // Print the customers in descending order
        for (Collection8 customer : customers) {
            System.out.println(customer);
        }
    }
}
