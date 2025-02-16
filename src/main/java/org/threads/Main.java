package org.threads;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Thread thread1 = new Thread(new EvenThread(1000, printer));
        Thread thread2 = new Thread(new OddThread(1000, printer));
        thread1.setName("Even");
        thread2.setName("Odd");

        thread1.start();
        thread2.start();
    }
}
