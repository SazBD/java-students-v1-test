package test.io.Thread6;

public class Demo {
    public static void main(String[] args) {
        Task task = new Task();
        Thread t = new Thread(task);
        System.out.println("1." + t.getState());
        t.start();
        System.out.println("2." + t.getState());
        try {
            t.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("3." + t.getState());
    }
}
