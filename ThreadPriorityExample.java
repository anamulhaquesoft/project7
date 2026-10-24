
class MyPriority extends Thread {
    public void run() {
        System.out.println(
            getName() + " Priority: " + getPriority()
        );
    }
}

public class ThreadPriorityExample {
    public static void main(String[] args) {
        MyPriority t1 = new MyPriority();
        MyPriority t2 = new MyPriority();
        MyPriority t3 = new MyPriority();

        t1.setName("Low Priority Thread");
        t2.setName("Normal Priority Thread");
        t3.setName("High Priority Thread");

        t1.setPriority(3);
        t2.setPriority(5);
        t3.setPriority(8);

        t1.start();
        t2.start();
        t3.start();
    }
}
