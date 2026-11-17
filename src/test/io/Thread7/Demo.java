package test.io.Thread7;

public class Demo {
    public static void main(String[] args) {
        new Thread(new TicketTask()).start();
        new Thread(new TicketTask()).start();
        new Thread(new TicketTask()).start();
    }
}
