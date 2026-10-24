class MyThread extends Thread {
    boolean suspend = false, stop = false;

    synchronized void suspendT() {
        suspend = true;
    }

    synchronized void resumeT() {
        suspend = false;
        notify();
    }

    synchronized void stopT() {
        stop = true;
        suspend = false;
        notify();
    }

    public void run() {
        int i = 1;
        while (true) {
            synchronized (this) {
                if (stop) break;
                while (suspend && !stop) {
                    try { wait(); }
                    catch (Exception e) { return; }
                }
                if (stop) break;
            }
            System.out.println(i++);
            try { Thread.sleep(500); }
            catch (Exception e) { break; }
        }
    }
}

public class ThreadExample {
    public static void main(String[] args) throws Exception {
        MyThread t = new MyThread();
        t.start();

        Thread.sleep(1000);
        t.suspendT();
        System.out.println("Thread Suspended");

        Thread.sleep(1000);
        t.resumeT();
        System.out.println("Thread Resumed");

        Thread.sleep(1000);
        t.stopT();
        System.out.println("Thread Stopped");
    }
}