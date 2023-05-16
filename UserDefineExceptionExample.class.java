//This is the User Define Example..!!

class NegativeNumberException extends Exception{
    NegativeNumberException(String message) {
        super(message);
    }
}
public class UserDefineExceptionExample {
    public static void main(String[] args) {
        int number = -5;
        try {
            if (number < 0) {
                throw new NegativeNumberException("Number cannot be negative");
            }
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}
