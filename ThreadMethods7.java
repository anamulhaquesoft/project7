
class MyWorker7 extends Thread {
    volatile boolean running = true;

    public void run() {
        for (int i = 1; i <= 5 && running; i++) {
            System.out.println(getName() + ": " + i);

            Thread.yield();

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                break;
            }
        }
    }

    public void stopThread() {
        running = false;
    }
}

public class ThreadMethods7 {
    public static void main(String[] args)
            throws InterruptedException {

        MyWorker7 t = new MyWorker7();
        t.start();

        Thread.sleep(1200);
        t.stopThread();

        System.out.println("Thread stopped");
    }
}
