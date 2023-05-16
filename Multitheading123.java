public class Multithreading123 {
    public static void main(String[] args) {
        Thread thread1 = new DisplayThread("Hello from Thread1");
        Thread thread2 = new DisplayThread("Hello from Thread2");

        thread1.start();
        thread2.start();

        try {
            // Wait for user to press Ctrl+C
            while (true) {
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Program terminated.");
        }
    }
}

class DisplayThread extends Thread {
    private String message;

    public DisplayThread(String message) {
        this.message = message;
    }

    public void run() {
        while (true) {
            System.out.println(message);
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}
