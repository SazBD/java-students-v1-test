package test.io.Thread3;

public class Demo {
    public static void main(String[] args) {
        RunnableThread rt = new RunnableThread();
        new Thread(rt).start();
        new Thread(rt).start();
        new Thread(rt).start();
    }
}
