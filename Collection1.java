public class Collection1 {
    public static void main(String[] args) {
        // auto boxing - converting primitive to object
        Integer number = 10; 
        System.out.println("Auto boxed number: " + number);

        // auto unboxing - converting object to primitive
        int sum = number + 5; 
        System.out.println("Auto unboxed sum: " + sum);
    }
}