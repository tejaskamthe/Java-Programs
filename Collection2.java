import java.util.*;

public class Collection2 {
    public static void main(String[] args) {
        // Test List APIs
        List<String> list = new ArrayList<>();
        System.out.println("List is empty? " + list.isEmpty());
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        System.out.println("List size: " + list.size());
        list.remove("E");
        System.out.println("List size after removing E: " + list.size());
        System.out.println("List elements:");
        Iterator<String> listItr = list.iterator();
        while (listItr.hasNext()) {
            System.out.println(listItr.next());
        }

        // Test Set APIs
        Set<String> set = new HashSet<>();
        System.out.println("Set is empty? " + set.isEmpty());
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");
        set.add("F");
        System.out.println("Set size: " + set.size());
        set.remove("D");
        System.out.println("Set size after removing D: " + set.size());
        System.out.println("Set elements:");
       for(String name: set){
        System.out.println(name);
       }
    }
}
