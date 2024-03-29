package threads_example.thread_extend.synchronized_lock.lock;

import java.util.concurrent.locks.ReentrantLock;

class LockTicket {
    private int number = 50;
    private final ReentrantLock lock = new ReentrantLock();

    public void saleTicket() {
        lock.lock();
        try {
            if (number > 0) {
                System.out.println(Thread.currentThread().getName() + " sales the ticket order " + (number--) + ", and " + number + " tickets left");
            }
        } finally {
            lock.unlock();
        }
    }
}

public class LockSaleTicket {
    public static void main(String[] args) {
        LockTicket ticket = new LockTicket();

        new Thread(() -> {
            int round = 0;
            for (int i = 0; i < 60; i++) {
                ticket.saleTicket();
                round++;
            }
            System.out.println("wow, " + Thread.currentThread().getName() + " you have worked " + round + " times");
        }, "T1").start();

        new Thread(() -> {
            for (int i = 0; i < 60; i++)
                ticket.saleTicket();
        }, "T2").start();

        new Thread(() -> {
            for (int i = 0; i < 60; i++)
                ticket.saleTicket();
        }, "T3").start();
    }
}
