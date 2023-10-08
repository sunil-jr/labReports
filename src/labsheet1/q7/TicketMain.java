package labsheet1.q7;

public class TicketMain {
    public static void main(String[] args) {
        int tickets = 5;
        Ticket ticket = new Ticket(tickets);

        Thread user1 = new UserThread(ticket, "User 1");
        Thread user2 = new UserThread(ticket, "User 2");
        Thread user3 = new UserThread(ticket, "User 3");
        Thread user4 = new UserThread(ticket, "User 4");
        Thread user5 = new UserThread(ticket, "User 5");

        user1.start();
        user2.start();
        user3.start();
        user4.start();
        user5.start();

        try {
            user1.join();
            user2.join();
            user3.join();
            user4.join();
            user5.join();
        } catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
        }
    }
}
