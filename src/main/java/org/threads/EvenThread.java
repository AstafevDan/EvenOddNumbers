package org.threads;

public class EvenThread implements Runnable {
    private final Printer printer;
    private final int limit;

    public EvenThread(int limit, Printer printer) {
        this.limit = limit;
        this.printer = printer;
    }

    @Override
    public void run() {
        for (int i = 2; i <= limit; i += 2) {
            printer.printEvenNum(i);
        }
    }
}
