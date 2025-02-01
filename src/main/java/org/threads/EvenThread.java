package org.threads;

public class EvenThread implements Runnable {

    private final int limit;

    public EvenThread(int limit) {
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }

    @Override
    public void run() {
        for (int i = 0; i < limit; i += 2) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
