class Fibonacci extends Thread {
    public void run() {
        int a=0,b=1,i,c;
        System.out.print(a+" "+b);
        for(i=2;i<=10;i++) {
            c=a+b;
            System.out.print("  "+c);
            a=b;
            b=c;
        }
    }
}

class Reverse extends Thread {
    public void run() {
        System.out.println("\nNumbers in reverse order:");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}

public class Multithreading4 {
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        Reverse r = new Reverse();
        f.start();
        r.start();
        try{
            f.join();
            r.join();
        }
        catch(InterruptedException e){
            System.out.print(e);
        }

    }
}
