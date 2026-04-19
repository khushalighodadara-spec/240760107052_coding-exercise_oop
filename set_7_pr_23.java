class ThreadOne extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread 1: " + i);

            try {
                Thread.sleep(1000); // 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread 1 interrupted");
            }
        }
    }
}

class ThreadTwo extends Thread {
    public void run() {
        for (int i = 11; i <= 20; i++) {
            System.out.println("Thread 2: " + i);

            try {
                Thread.sleep(500); // 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Thread 2 interrupted");
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {

        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();

        // Start both threads
        t1.start();
        t2.start();
    }
}

/*
Sample Output (may vary because threads run in parallel):

Thread 1: 1
Thread 2: 11
Thread 2: 12
Thread 1: 2
Thread 2: 13
Thread 2: 14
Thread 1: 3
...
Thread 1: 10
Thread 2: 20
*/
