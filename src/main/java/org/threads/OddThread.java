package org.threads;

public class OddThread implements Runnable {
    private final Printer printer;
    private final int limit;

    public OddThread(int limit, Printer printer) {
        this.limit = limit;
        this.printer = printer;
    }

    @Override
    public void run() {
        for (int i = 1; i <= limit; i += 2) {
            printer.printOddNum(i);
        }
    }
}
