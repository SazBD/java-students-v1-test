package test.io.Thread2;

public class Demo {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        new Thread(mt).start();
    }
}
