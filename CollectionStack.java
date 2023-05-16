import java.util.Stack;

public class CollectionStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        
        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        // Pop elements from the stack
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        
        // Peek at the top element of the stack
        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);
        
        // Check if the stack is empty
        boolean isEmpty = stack.empty();
        System.out.println("Is the stack empty? " + isEmpty);
        
        // Search for an element in the stack
        int searchElement = 20;
        int position = stack.search(searchElement);
        System.out.println("Position of " + searchElement + " in the stack: " + position);
    }
}
