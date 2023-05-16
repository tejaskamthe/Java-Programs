import java.util.*;

public class Collection7 {
    public static void main(String[] args) {
        Map<String, List<Integer>> studentAges = new HashMap<>();

        // Take input from the user
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 4; i++) {
            System.out.println("Enter name and age of " + i + "th: ");
            String name = scanner.next();
            int age = scanner.nextInt();

            // Add the age to the list associated with the name
            List<Integer> ages = studentAges.getOrDefault(name, new ArrayList<>());
            ages.add(age);
            studentAges.put(name, ages);
        }

        // Print the output
        for (Map.Entry<String, List<Integer>> entry : studentAges.entrySet()) {
            String name = entry.getKey();
            List<Integer> ages = entry.getValue();
            int size = ages.size();

            System.out.print(name + " " + ages.get(0));
            for (int i = 1; i < size; i++) {
                System.out.print("," + ages.get(i));
            }
            System.out.println();
        }
    }
}
