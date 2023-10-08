package labsheet1.q8;

public class PriorityThread extends Thread {

    @Override
    public void run() {
        System.out.println("Thread priority: " + getPriority());
    }
}
