package labsheet1.q7;

import java.util.Random;

public class Ticket {
    private int availableTickets;

    public Ticket(int totalTickets) {
        availableTickets = totalTickets;
    }

    public synchronized void book(String user) {
        if (availableTickets > 0) {
            System.out.println(user + " is booking ticket");
            try {
                Random random = new Random();
                int bookingTime = random.nextInt(1000);
                Thread.sleep(bookingTime);
            } catch (InterruptedException exception) {
                Thread.currentThread().interrupt();
            }
            availableTickets--;
            System.out.println(user + " booked a ticket. " + availableTickets + " remaining tickets");
        } else {
            System.out.println("Couldn't book ticket, no tickets available");
        }
    }
}
