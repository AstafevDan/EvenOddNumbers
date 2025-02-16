package org.threads;

import java.util.concurrent.Semaphore;

public class Printer {
    private Semaphore evenSem = new Semaphore(1);
    private Semaphore oddSem = new Semaphore(0);

    void printEvenNum(int num) {
        try {
            evenSem.acquire();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(Thread.currentThread().getName() + ": " + num);
        oddSem.release();
    }

    void printOddNum(int num) {
        try {
            oddSem.acquire();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(Thread.currentThread().getName() + ": " + num);
        evenSem.release();
    }
}
