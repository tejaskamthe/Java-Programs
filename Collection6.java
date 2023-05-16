import java.util.*;

public class Collection6 {
    public static void main(String[] args) {
        // Create a TreeMap with a custom comparator to sort by key in descending order
        Map<String, String> phoneBook = new TreeMap<>(Collections.reverseOrder());

        // Add some telephone numbers and names
        phoneBook.put("8080313281", "Tejas");
        phoneBook.put("9763592341", "Kamthe");
        phoneBook.put("6822357587", "TSKP");
        phoneBook.put("5666645464", "Sonu");

        // Print the original data
        System.out.println("Original data:");
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Sort the data by key in descending order
        Map<String, String> sortedPhoneBook = new TreeMap<>(Collections.reverseOrder());
        sortedPhoneBook.putAll(phoneBook);

        // Print the sorted data
        System.out.println("\nSorted data:");
        for (Map.Entry<String, String> entry : sortedPhoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
