package test.io.Thread7;

public class TicketTask implements Runnable {
    private static int tickets = 100;
    private final Object lock = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                if (tickets > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "在卖票，" + "还剩" + tickets + "张票");
                    tickets--;
                } else {
                    break;
                }
            }
        }
    }
}
