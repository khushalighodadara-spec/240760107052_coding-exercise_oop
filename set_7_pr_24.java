class NumberThread extends Thread {
    private int start, end;

    NumberThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }
}
public class SequentialThreadDemo {
    public static void main(String[] args) {

        NumberThread t1 = new NumberThread(1, 100);
        NumberThread t2 = new NumberThread(101, 200);
        NumberThread t3 = new NumberThread(201, 300);

        try {
            // Start T1 and wait until it finishes
            t1.start();
            t1.join();

            // Start T2 and wait until it finishes
            t2.start();
            t2.join();

            // Start T3 and wait until it finishes
            t3.start();
            t3.join();

        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}
/*
Output:
1
2
3
...
100
101
102
...
200
201
202
...
300
*/
