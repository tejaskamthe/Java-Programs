import java.util.Hashtable;
import java.util.Scanner;

public class Collection5 {
    private String productId;
    private String productName;

    public Collection5(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String toString() {
        return "Product ID: " + productId + ", Product Name: " + productName;
    }

    public static void main(String[] args) {
        Hashtable<String, Collection5> productTable = new Hashtable<>();
        Scanner scanner = new Scanner(System.in);

        // Accept information of 10 products
        for (int i = 1; i<=3; i++) {
            System.out.println("Enter product ID for product " + i + ":");
            String productId = scanner.nextLine();

            System.out.println("Enter product name for product " + i + ":");
            String productName = scanner.nextLine();

            Collection5 product = new Collection5(productId, productName);
            productTable.put(productId, product);
        }

        // Search for a particular product
        System.out.println("Enter product ID to search for:");
        String productIdToSearch = scanner.nextLine();

        Collection5 productToSearch = productTable.get(productIdToSearch);
        if (productToSearch == null) {
            System.out.println("Product not found.");
        } else {
            System.out.println("Product found: " + productToSearch);
        }

        // Remove a particular product by id and name
        System.out.println("Enter product ID to remove:");
        String productIdToRemove = scanner.nextLine();

        System.out.println("Enter product name to remove:");
        String productNameToRemove = scanner.nextLine();

        Collection5 productToRemove = productTable.get(productIdToRemove);
        if (productToRemove != null && productToRemove.getProductName().equals(productNameToRemove)) {
            productTable.remove(productIdToRemove);
            System.out.println("Product removed.");
        } else {
            System.out.println("Product not found.");
        }
         System.out.println("\nProduct ID\tProduct Name");
    System.out.println("--------------------------");
    for (Collection5 product : productTable.values()) {
        System.out.format("%-10s\t%s\n", product.getProductId(), product.getProductName());
    }
    }
}
