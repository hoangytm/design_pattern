package muti_tasking.semaphore;

import java.util.concurrent.Semaphore;

public class WorkerThread extends Thread {

    private final Semaphore semaphore;
    private final String name;

    public WorkerThread(Semaphore semaphore, String name) {
        this.semaphore = semaphore;
        this.name = name;

    }

    public void run() {
        try {
            System.out.println("semaphore.availablePermits()" + semaphore.availablePermits());
            semaphore.acquire();
            System.out.println("time : " + System.currentTimeMillis());
            test();
            semaphore.release();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void test() throws InterruptedException {
        System.out.println("test");
        Thread.sleep(100);
    }
}