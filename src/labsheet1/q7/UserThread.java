package labsheet1.q7;

public class UserThread extends Thread {
    private Ticket ticket;
    private String name;

    public UserThread(Ticket ticket, String name) {
        this.ticket = ticket;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " is in state " + getState());

        ticket.book(name);

        System.out.println(name + " is in state " + getState());
    }
}
