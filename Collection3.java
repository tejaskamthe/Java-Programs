import java.util.ArrayList;
import java.util.Iterator;

public class Collection3 {
    public static void main(String[] args) {
        // create a new ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // add some colors to the ArrayList
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        // print out the collection using iterator()
        System.out.println("Using iterator():");
        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()) {
            String color = iterator.next();
            System.out.println(color);
        }

        // print out the collection using foreach loop
        System.out.println("\nUsing foreach loop:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
