//Multitheading 12
public class Multitheading121 {
    public static void main(String[] args) {
        // Create a new thread
        Thread thread = new MyThread();

        // Set the thread's name and priority
        thread.setName("MyThread");
        thread.setPriority(Thread.MAX_PRIORITY);

        // Start the thread
        thread.start();

        // Wait for the thread to finish
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print a message indicating that the thread has finished
        System.out.println("Thread " + thread.getName() + " has finished executing.");
    }

    // Define a custom thread class
    static class MyThread extends Thread {
        @Override
        public void run() {
            // Print a message indicating that the thread has started
            System.out.println("Thread " + getName() + " has started executing.");

            // Perform some task
            for (int i = 0; i < 5; i++) {
                System.out.println(getName() + ": " + i);
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            // Print a message indicating that the thread has finished
            System.out.println("Thread " + getName() + " has finished executing.");
        }
    }
}
