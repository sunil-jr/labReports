package labsheet1.q8;

public class Main {

    public static void main(String[] args) {
        Thread low = new PriorityThread();
        Thread mid = new PriorityThread();
        Thread high = new PriorityThread();
        low.setPriority(1);
        mid.setPriority(5);
        high.setPriority(10);

        low.start();
        mid.start();
        high.start();
    }
}
