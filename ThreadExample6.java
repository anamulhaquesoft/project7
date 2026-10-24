
class NewThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread is running: " + i);
        }
    }
}

public class ThreadExample6 {
    public static void main(String[] args) {
        NewThread t = new NewThread();
        t.start();
    }
}
