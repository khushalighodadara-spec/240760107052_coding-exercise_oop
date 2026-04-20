class TablePrinter {
    public synchronized void printTable(int number) {
        System.out.println("Table of " + number + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        System.out.println();
    }
}
class MyThread extends Thread {
    private TablePrinter printer;
    private int number;

    public MyThread(TablePrinter printer, int number) {
        this.printer = printer;
        this.number = number;
    }

    public void run() {
        printer.printTable(number);
    }
}
public class Main {
    public static void main(String[] args) {
        TablePrinter printer = new TablePrinter();
        MyThread t1 = new MyThread(printer, 5);
        MyThread t2 = new MyThread(printer, 7);
        t1.start();
        t2.start();
    }
}

/*
Sample Output:
Table of 5:
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45
5 x 10 = 50

Table of 7:
7 x 1 = 7
7 x 2 = 14
7 x 3 = 21
7 x 4 = 28
7 x 5 = 35
7 x 6 = 42
7 x 7 = 49
7 x 8 = 56
7 x 9 = 63
7 x 10 = 70
*/
