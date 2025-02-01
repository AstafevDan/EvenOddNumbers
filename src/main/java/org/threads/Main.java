package org.threads;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new EvenThread(1000));
        Thread thread2 = new Thread(new OddThread(1000));
        thread1.setName("Even");
        thread2.setName("Odd");

        thread1.start();
        try {
            thread1.join();                // поток main ждет, пока первый поток выведет все четные числа, а потом запускает вывод другим потоком нечетных
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread2.start();
    }
}
