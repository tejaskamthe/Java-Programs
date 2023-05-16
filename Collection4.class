import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Collection4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        int choice;
        do {
            System.out.println("Choose an operation:");
            System.out.println("1. Add element");
            System.out.println("2. Retrieve element at index");
            System.out.println("3. Insert element at first position");
            System.out.println("4. Update element by value");
            System.out.println("5. Remove element at position");
            System.out.println("6. Search for element");
            System.out.println("7. Reverse list");
            System.out.println("8. Sort list");
            System.out.println("9. Exit");

            choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("Enter element to add:");
                    String elementToAdd = scanner.nextLine();
                    list.add(elementToAdd);
                    break;

                case 2:
                    System.out.println("Enter index to retrieve element from:");
                    int index = scanner.nextInt();
                    scanner.nextLine(); // consume the newline character

                    if (index < 0 || index >= list.size()) {
                        System.out.println("Invalid index.");
                    } else {
                        String element = list.get(index);
                        System.out.println("Element at index " + index + " is: " + element);
                    }
                    break;

                case 3:
                    System.out.println("Enter element to insert at first position:");
                    String elementToInsert = scanner.nextLine();
                    list.add(0, elementToInsert);
                    break;

                case 4:
                    System.out.println("Enter element to update:");
                    String elementToUpdate = scanner.nextLine();

                    System.out.println("Enter new value:");
                    String newValue = scanner.nextLine();

                    int indexToUpdate = list.indexOf(elementToUpdate);
                    if (indexToUpdate == -1) {
                        System.out.println("Element not found.");
                    } else {
                        list.set(indexToUpdate, newValue);
                        System.out.println("Element updated successfully.");
                    }
                    break;

                case 5:
                    System.out.println("Enter position to remove element from:");
                    int positionToRemove = scanner.nextInt();
                    scanner.nextLine(); // consume the newline character

                    if (positionToRemove < 0 || positionToRemove >= list.size()) {
                        System.out.println("Invalid position.");
                    } else {
                        String removedElement = list.remove(positionToRemove);
                        System.out.println("Element removed: " + removedElement);
                    }
                    break;

                case 6:
                    System.out.println("Enter element to search for:");
                    String elementToSearch = scanner.nextLine();

                    int indexFound = list.indexOf(elementToSearch);
                    if (indexFound == -1) {
                        System.out.println("Element not found.");
                    } else {
                        System.out.println("Element found at index: " + indexFound);
                    }
                    break;

                case 7:
                    Collections.reverse(list);
                    System.out.println("List reversed.");
                    break;

                case 8:
                    Collections.sort(list);
                    System.out.println("List sorted.");
                    break;

                case 9:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice.");
                    break;
            }

            System.out.println("Current list: " + list);
            System.out.println(); // add a blank line for readability
        } while (choice != 9);
    }
}
