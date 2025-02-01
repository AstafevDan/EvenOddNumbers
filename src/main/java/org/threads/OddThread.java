package org.threads;

public class OddThread implements Runnable {

    private final int limit;

    public OddThread(int limit) {
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }

    @Override
    public void run() {
        for (int i = 1; i < limit; i += 2) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
